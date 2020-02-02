package com.javayh.uitl;

import java.math.BigDecimal;

/**
 * @author Dylan Yang
 * @Description: 数据计算
 * @ProjectName design-pattern-pattern
 * @date 2020-02-02 16:51
 */
public class BigDecimalUtils {

    public static String calculation(BigDecimal originalPrice,Double d){
        return originalPrice.multiply(new BigDecimal(d)).setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString();
    }
}
