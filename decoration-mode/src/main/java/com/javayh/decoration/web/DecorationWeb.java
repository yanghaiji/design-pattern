package com.javayh.decoration.web;

import com.javayh.decoration.decoration.Decorator;
import com.javayh.decoration.service.ComputerService;
import com.javayh.decoration.service.impl.ComputerServiceImpl;
import com.javayh.decoration.service.impl.PhoneServiceImpl;
import com.javayh.decoration.util.DecoratorUtils;
import com.javayh.result.DataResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dylan Yang
 * @Description: 装饰者模式
 * @ProjectName design-pattern
 * @date 2020-02-03 16:38
 */
@RestController
public class DecorationWeb {

    /**
     * @Description 装饰者
     * @UserModule: design-pattern
     * @author Dylan
     * @date 2020/2/3 0003
     * @param [type]
     * @return com.javayh.result.DataResult
     */
    @GetMapping(value = "/getComputer/{type}")
    public DataResult getComputer(@PathVariable String  type){
        return DecoratorUtils.getType(type);
    }




}
