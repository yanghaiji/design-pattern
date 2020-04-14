package com.javayh.proxy.jdk;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-12 14:25
 */
public class SystemMain {
    public static void main(String[] args) throws Throwable {
        SystemSetUp systemSetUp = new SystemSetUpImpl();
        SystemProxy<SystemSetUp> systemProxy = new SystemProxy();
    }
}
