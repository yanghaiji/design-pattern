package com.javayh.decoration.service;

import com.javayh.dto.ComputerDTO;

/**
 * @author Dylan Yang
 * @Description: 电脑
 * @ProjectName design-pattern
 * @date 2020-02-03 16:42
 */
public interface ComputerService {

    /**
     * @Description 购买的电脑信息
     * @UserModule: design-pattern     
     * @author Dylan
     * @date 2020/2/3 0003
     * @param [type] 
     * @return com.javayh.dto.ComputerDTO
     */
    ComputerDTO getComputer(String type);
}
