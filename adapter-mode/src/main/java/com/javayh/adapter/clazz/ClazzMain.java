package com.javayh.adapter.clazz;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-11 10:44
 */
public class ClazzMain {

    public static void main(String[] args) {
        ComputerInit inteli5Adapter = new Inteli5Adapter();
        ComputerInit inteli7Adapter = new Inteli7Adapter();

        System.out.println(inteli7Adapter.assemble());
        System.out.println(inteli5Adapter.assemble());
    }
}
