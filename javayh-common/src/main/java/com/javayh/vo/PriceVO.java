package com.javayh.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Dylan Yang
 * @Description:
 * @ProjectName design-pattern-pattern
 * @date 2020-02-02 16:34
 */
@Data
public class PriceVO {
    private String type;
    private BigDecimal price;
    private BigDecimal emsPrice;
}
