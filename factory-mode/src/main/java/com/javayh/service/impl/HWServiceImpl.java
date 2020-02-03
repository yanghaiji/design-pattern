package com.javayh.service.impl;

import com.javayh.constant.Constant;
import com.javayh.dto.PhoneDTO;
import com.javayh.service.PhoneService;
import com.javayh.vo.PhoneVO;
import org.springframework.stereotype.Service;

/**
 * @author Dylan Yang
 * @Description: 华为手机
 * @ProjectName design-pattern
 * @date 2020-02-03 12:11
 */
@Service
public class HWServiceImpl implements PhoneService {

    /**
     * @Description 华为手机套餐
     * @UserModule: design-pattern     
     * @author Dylan
     * @date 2020/2/3 0003
     * @param [phoneVO] 
     * @return com.javayh.dto.PhoneDTO
     */
    @Override
    public PhoneDTO getPhone(PhoneVO phoneVO) {
        return PhoneDTO.builder().type(phoneVO.getType())
                .setMeal(phoneVO.getSetMeal())
                .price(Constant.SET_MEAL_I.equalsIgnoreCase(phoneVO.getSetMeal())? "2020": "3030")
                .msg(Constant.MSG).build();
    }
}
