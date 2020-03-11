package com.javayh.adapter.twoway;

import com.javayh.adapter.clazz.ComputerInit;
import com.javayh.adapter.clazz.Inteli5;
import com.javayh.adapter.clazz.Inteli7;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-11 11:21
 */
public class TwoWayMain {
    public static void main(String[] args) {

        /*通过适配着接口 调用  目标接口*/
        TwoWayAdaptee adaptee=new AdapteeRealize();
        ComputerInit target=new TwoWayAdapter(adaptee);
        System.out.println(target.assemble());
        System.out.println("============");

        /*通过目标接口 调用 适配着接口 */
        target = new Inteli7TwoWayAdapter(new Inteli7());
        adaptee = new TwoWayAdapter(target);
        System.out.println(adaptee.twoWayAdaptee());

        System.out.println("============");
        target = new Inteli5TwoWayAdapter(new Inteli5());
        adaptee = new TwoWayAdapter(target);
        System.out.println(adaptee.twoWayAdaptee());
    }
}
