package com.javayh.service;

import com.javayh.dto.PhoneDTO;
import com.javayh.vo.PhoneVO;

/**
 * @author Dylan Yang
 * @Description: 手机工厂适配接口
 * @ProjectName design-pattern
 * @date 2020-02-03 12:09
 */
public interface PhoneService {

    /**
     * @Description 手机适配接口
     * @UserModule: design-pattern     
     * @author Dylan
     * @date 2020/2/3 0003
     * @param [phoneVO] 
     * @return com.javayh.dto.PhoneDTO
     */
    PhoneDTO getPhone(PhoneVO phoneVO);
}
