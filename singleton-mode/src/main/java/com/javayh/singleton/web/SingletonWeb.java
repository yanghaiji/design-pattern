package com.javayh.singleton.web;

import com.javayh.result.DataResult;
import com.javayh.singleton.entity.UserIdCrad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 压力测试单例
 * </p>
 *
 * @author Dylan
 * @version 1.0.0
 * @since 2020-02-11 17:46
 */
public class SingletonWeb {

    public static void main(String[] args) {
        //这里用for循环验证单例模式的创建
        for (int i = 0; i <10 ; i++) {
            UserIdCrad userIdCrad2 = UserIdCrad.getInstance(2020+ i,"Java有货");
        }
    }
}

