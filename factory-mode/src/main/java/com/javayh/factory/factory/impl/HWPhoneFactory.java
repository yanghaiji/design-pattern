package com.javayh.factory.factory.impl;

import com.javayh.factory.service.impl.HWServiceImpl;
import com.javayh.factory.factory.PhoneFactory;
import com.javayh.factory.service.PhoneService;
import com.javayh.vo.PhoneVO;

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
