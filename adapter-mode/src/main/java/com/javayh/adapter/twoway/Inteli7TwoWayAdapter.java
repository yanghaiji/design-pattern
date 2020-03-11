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
 * @since 2020-03-11 11:08
 */
public class Inteli7TwoWayAdapter implements ComputerInit {
    private Inteli7 inteli7;

    public Inteli7TwoWayAdapter(Inteli7 inteli7) {
        this.inteli7 = inteli7;
    }

    @Override
    public String assemble() {
        return "在双向适配中,您选择了 " + inteli7.init();
    }
}
