package com.javayh.adapter.object;

import com.javayh.adapter.clazz.ComputerInit;
import com.javayh.adapter.clazz.Inteli5;

/**
 * <p>
 *      对象的实现
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-11 10:55
 */
public class Inteli5ObjAdapter implements ComputerInit {

    private Inteli5 inteli5;

    public Inteli5ObjAdapter(Inteli5 inteli5) {
        this.inteli5 = inteli5;
    }

    @Override
    public String assemble() {
        String init = inteli5.init();
        return "在对象适配模式中,您选择了:"+init;
    }
}
