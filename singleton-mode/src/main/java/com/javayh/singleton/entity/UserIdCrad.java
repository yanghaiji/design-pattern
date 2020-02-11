package com.javayh.singleton.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan
 * @version 1.0.0
 * @since 2020-02-11 17:40
 */
@Slf4j
@Data
public class UserIdCrad
{
    private Integer idCrad;
    private String name;
    private volatile static UserIdCrad userIdCrad;

    private UserIdCrad(Integer idCrad, String name) {
        this.idCrad = idCrad;
        this.name = name;
    }

    public static UserIdCrad getInstance(Integer idCrad,String name){
        if (userIdCrad == null){
            synchronized (UserIdCrad.class){
                if(userIdCrad ==null){
                    userIdCrad = new UserIdCrad(idCrad,name);
                    log.info("初次创建的对象，值为：{}",userIdCrad  +" 参数 "+ idCrad + name);
                }
            }
        }
        log.info("创建的对象已存在，值为：{}",userIdCrad  +" 想改变的参数 "+ idCrad + name);
        return userIdCrad;
    }
}
