package com.javayh.stategist.service;

import com.javayh.constant.Constant;
import com.javayh.dto.PriceDTO;
import com.javayh.stategist.design.PriceService;
import com.javayh.uitl.BigDecimalUtils;
import com.javayh.vo.PriceVO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Dylan Yang
 * @Description: Vip用户
 * @ProjectName design-pattern-pattern
 * @date 2020-02-02 16:11
 */
@Service
public class VipService implements PriceService {

    @Override
    public PriceDTO getPrice(PriceVO priceVO) {
        String price = BigDecimalUtils.calculation(priceVO.getPrice(), 0.7);
        String priceEms = BigDecimalUtils.calculation(priceVO.getEmsPrice(), 0.7);
        return PriceDTO.builder().type(priceVO.getType()).price(price).emsPrice(priceEms).msg(Constant.MSG).build();
    }

    @Override
    public String getCustomerType() {
        return Constant.VIP;
    }
}
