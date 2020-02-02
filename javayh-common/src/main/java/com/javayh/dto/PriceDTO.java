package com.javayh.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Dylan Yang
 * @Description:
 * @ProjectName design-pattern-pattern
 * @date 2020-02-02 17:00
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceDTO {
    private String type;
    private String price;
    private String emsPrice;
    private String msg;
}
