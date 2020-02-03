package com.javayh.stategist.design;

import com.javayh.dto.PriceDTO;
import com.javayh.vo.PriceVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Dylan Yang
 * @Description: 上下文计算
 * @ProjectName design-pattern-pattern
 * @date 2020-02-02 16:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerContext {
    private PriceService priceService;

    public CustomerContext(String customerType) {
        this.priceService = PriceService.map.get(customerType) ;
    }

    public PriceDTO getPrice(PriceVO priceVO){
        return priceService.getPrice(priceVO);
    }
}
