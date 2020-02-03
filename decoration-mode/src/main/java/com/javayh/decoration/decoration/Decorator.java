package com.javayh.decoration.decoration;

import com.javayh.decoration.service.ComputerService;
import com.javayh.domain.ComputerGift;
import com.javayh.dto.ComputerDTO;

import java.io.Serializable;

/**
 * @author Dylan Yang
 * @Description: 装饰者
 * @ProjectName design-pattern
 * @date 2020-02-03 17:02
 */
public class Decorator implements ComputerService {

    private ComputerService computerService;

    public Decorator(ComputerService computerService) {
        this.computerService = computerService;
    }
    @Override
    public ComputerDTO getComputer(String type) {
        ComputerDTO computer = computerService.getComputer(type);
        computer.setComputerGift(ComputerGift.builder()
                .member("恭喜您已成为本店铂金会员")
                .integral("赠送您10积分")
                .coupon("赠送您一张(30元)店铺统用优惠券").build());
        return computer;
    }
}
