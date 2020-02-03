package com.javayh.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Dylan Yang
 * @Description: 工厂模式VO
 * @ProjectName design-pattern
 * @date 2020-02-03 12:21
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneVO {
    /*型号*/
    private String type;
    /*套餐*/
    private String setMeal;
}
