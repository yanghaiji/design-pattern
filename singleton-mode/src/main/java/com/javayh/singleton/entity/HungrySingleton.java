package com.javayh.singleton.entity;

/**
 * <p>
 * 饿汉式单例模式
 * </p>
 *
 * @author Dylan
 * @version 1.0.0
 * @since 2020-02-11 15:22
 */
public class HungrySingleton {

    private static final HungrySingleton ourInstance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return ourInstance;
    }

    private HungrySingleton() {
    }
}
