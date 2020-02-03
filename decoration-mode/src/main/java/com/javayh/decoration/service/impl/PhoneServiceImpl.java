package com.javayh.decoration.service.impl;

import com.javayh.constant.Constant;
import com.javayh.decoration.service.ComputerService;
import com.javayh.dto.ComputerDTO;
import org.springframework.stereotype.Service;

/**
 * @author Dylan Yang
 * @Description: Acer电脑
 * @ProjectName design-pattern
 * @date 2020-02-03 16:45
 */
public class PhoneServiceImpl implements ComputerService {

    @Override
    public ComputerDTO getComputer(String type) {
        return ComputerDTO.builder().brand(type).cpu(Constant.CPU)
                .graphicsCard("AMD")
                .nucleus("16")
                .size("8.0").build();
    }
}
