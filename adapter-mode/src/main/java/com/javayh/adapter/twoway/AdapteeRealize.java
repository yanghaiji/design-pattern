package com.javayh.adapter.twoway;

/**
 * <p>
 *      适配 者接口实现
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-11 11:18
 */
public class AdapteeRealize implements TwoWayAdaptee {

    @Override
    public String twoWayAdaptee() {
        return "双向适配,进行了回调";
    }
}
