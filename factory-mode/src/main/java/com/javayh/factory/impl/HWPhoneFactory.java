package com.javayh.factory.impl;

import com.javayh.factory.PhoneFactory;
import com.javayh.service.PhoneService;
import com.javayh.service.impl.HWServiceImpl;
import com.javayh.vo.PhoneVO;
import org.springframework.stereotype.Component;

/**
 * @author Dylan Yang
 * @Description: 华为手机工厂
 * @ProjectName design-pattern
 * @date 2020-02-03 12:18
 */
public class HWPhoneFactory implements PhoneFactory {

    @Override
    public PhoneService craetePhone(PhoneVO phoneVO) {
        return new HWServiceImpl();
    }
}
