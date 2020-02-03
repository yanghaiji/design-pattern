package com.javayh.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Dylan Yang
 * @Description: 电脑赠品
 * @ProjectName design-pattern
 * @date 2020-02-03 17:07
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ComputerGift {
    /*会员*/
    private String member;
    /*积分*/
    private String integral;
    /*优惠券*/
    private String coupon;

}
