package com.javayh.adapter.clazz;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-11 10:04
 */
public class Inteli7Adapter extends Inteli7 implements ComputerInit {

    @Override
    public String assemble() {
        String init = this.init();
        return "在类适配器中,您选择的是:"+init;
    }
}
