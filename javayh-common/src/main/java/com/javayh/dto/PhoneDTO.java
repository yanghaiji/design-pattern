package com.javayh.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Dylan Yang
 * @Description: 手机工厂返回
 * @ProjectName design-pattern
 * @date 2020-02-03 12:23
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {
    /*型号*/
    private String type;
    /*套餐*/
    private String setMeal;
    /*消息*/
    private String msg;
    /*价格*/
    private String price;
}
