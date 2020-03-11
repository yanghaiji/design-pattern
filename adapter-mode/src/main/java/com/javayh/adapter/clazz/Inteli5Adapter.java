package com.javayh.adapter.clazz;

/**
 * <p>
 * 类适配器类
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-11 10:24
 */
public class Inteli5Adapter extends Inteli5 implements ComputerInit  {

    @Override
    public String assemble() {
        String init = this.init();
        return "在类适配器中,您选择的是:"+init;
    }
}
