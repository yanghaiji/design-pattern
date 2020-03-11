package com.javayh.adapter.object;

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
 * @since 2020-03-11 10:50
 */
public class ObjectMain {

    public static void main(String[] args) {

        ComputerInit inteli5ObjAdapter = new Inteli5ObjAdapter(new Inteli5());
        ComputerInit inteli7ObjAdapter = new Inteli7ObjAdapter(new Inteli7());
        System.out.println(inteli5ObjAdapter.assemble());
        System.out.println(inteli7ObjAdapter.assemble());
    }

}
