package com.javayh.decoration.service.impl;

import com.javayh.constant.Constant;
import com.javayh.decoration.service.ComputerService;
import com.javayh.dto.ComputerDTO;
import org.springframework.stereotype.Service;

/**
 * @author Dylan Yang
 * @Description: Mac电脑
 * @ProjectName design-pattern
 * @date 2020-02-03 16:44
 */
public class ComputerServiceImpl implements ComputerService {

    @Override
    public ComputerDTO getComputer(String type) {
        return ComputerDTO.builder().brand(type).cpu(Constant.CPU)
                .graphicsCard("blackmagic eGPU Pro ")
                .nucleus("16")
                .size("17").build();
    }
}
