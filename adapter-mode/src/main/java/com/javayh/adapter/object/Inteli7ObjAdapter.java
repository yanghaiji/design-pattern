package com.javayh.adapter.object;

import com.javayh.adapter.clazz.ComputerInit;
import com.javayh.adapter.clazz.Inteli7;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-11 10:55
 */
public class Inteli7ObjAdapter implements ComputerInit {

    private Inteli7 inteli7;

    public Inteli7ObjAdapter(Inteli7 inteli7) {
        this.inteli7 = inteli7;
    }

    @Override
    public String assemble() {
        String init = inteli7.init();
        return "在对象适配模式中,您选择了:"+init;
    }
}
