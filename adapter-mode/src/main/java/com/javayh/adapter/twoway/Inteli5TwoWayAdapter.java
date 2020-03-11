package com.javayh.adapter.twoway;

import com.javayh.adapter.clazz.ComputerInit;
import com.javayh.adapter.clazz.Inteli5;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-11 11:08
 */
public class Inteli5TwoWayAdapter implements ComputerInit {

    private Inteli5 inteli5;

    public Inteli5TwoWayAdapter(Inteli5 inteli5) {
        this.inteli5 = inteli5;
    }

    @Override
    public String assemble() {
        return "在双向适配中,您选择了 "+inteli5.init();
    }
}
