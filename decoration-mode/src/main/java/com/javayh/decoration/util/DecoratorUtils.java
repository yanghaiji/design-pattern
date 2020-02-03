package com.javayh.decoration.util;

import com.javayh.decoration.decoration.Decorator;
import com.javayh.decoration.service.ComputerService;
import com.javayh.decoration.service.impl.ComputerServiceImpl;
import com.javayh.decoration.service.impl.PhoneServiceImpl;
import com.javayh.dto.ComputerDTO;
import com.javayh.result.DataResult;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dylan Yang
 * @Description: 返回值修饰
 * @ProjectName design-pattern
 * @date 2020-02-03 17:53
 */
public class DecoratorUtils {
    
    public static DataResult getType(String type){
        Map<String,Integer> map = new HashMap();
        map.put(type,"Mac".equalsIgnoreCase(type)? 1 :("P30".equalsIgnoreCase(type)? 2 :3));
        ComputerService computerService = null;
        Decorator decorator = null;
        ComputerDTO computer = null;
        switch (map.get(type)){
            case 1:
                computerService = new ComputerServiceImpl();
                decorator = new Decorator(computerService);
                computer = decorator.getComputer(type);
                break;
            case 2:
                computerService = new PhoneServiceImpl();
                decorator = new Decorator(computerService);
                computer = decorator.getComputer(type);
                break;
            default:
                break;
        }
        return DataResult.success(computer);
    }
}
