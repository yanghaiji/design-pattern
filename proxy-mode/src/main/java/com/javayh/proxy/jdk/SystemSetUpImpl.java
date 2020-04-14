package com.javayh.proxy.jdk;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-12 14:21
 */
public class SystemSetUpImpl implements SystemSetUp {

    @Override
    public String setUpUser(String username) {
        if("admin".equalsIgnoreCase(username)){
            return "true";
        }
        return "false";
    }
}
