package com.javayh.proxy.game;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>
 * 真实打游戏者
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-06-10
 */
public class RealGame implements IGameFrame{

    @Override
    public Boolean login(String userName, String passWord) {
        if("admin".equalsIgnoreCase(userName) && "12345".equalsIgnoreCase(passWord))
        {
            return true;
        }
        return false;
    }

    @Override
    public String killBox(String userName) {
        if(StringUtils.isEmpty(userName)){
            return "您还未登录,无法 kill box!";
        }
        return userName + ": 正在kill box!";
    }

    @Override
    public String upgrade(String userName) {
        if(StringUtils.isEmpty(userName)){
            return "您还未登录,无法 升级!";
        }
        return userName + ": 又升一级!";
    }
}
