package com.javayh.stategist.service;

import com.javayh.constant.Constant;
import com.javayh.dto.PriceDTO;
import com.javayh.stategist.design.PriceService;
import com.javayh.uitl.BigDecimalUtils;
import com.javayh.vo.PriceVO;
import org.springframework.stereotype.Service;

/**
 * @author Dylan Yang
 * @Description: 普通用户
 * @ProjectName design-pattern-pattern
 * @date 2020-02-02 16:04
 */
@Service
public class OrdinaryService implements PriceService {

    @Override
    public PriceDTO getPrice(PriceVO priceVO) {
        String price = BigDecimalUtils.calculation(priceVO.getPrice(), 1.0);
        String priceEms = BigDecimalUtils.calculation(priceVO.getEmsPrice(), 1.0);
        return PriceDTO.builder().type(priceVO.getType()).price(price).emsPrice(priceEms).msg(Constant.MSG).build();
    }

    @Override
    public String getCustomerType(){
        return Constant.ORD;
    }

}
