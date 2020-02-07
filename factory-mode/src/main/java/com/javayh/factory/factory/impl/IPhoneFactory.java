package com.javayh.factory.factory.impl;

import com.javayh.factory.factory.PhoneFactory;
import com.javayh.factory.service.PhoneService;
import com.javayh.factory.service.impl.IPhoneServiceImpl;
import com.javayh.vo.PhoneVO;

/**
 * @author Dylan Yang
 * @Description: 苹果手机工厂
 * @ProjectName design-pattern
 * @date 2020-02-03 12:19
 */
public class IPhoneFactory implements PhoneFactory {

    @Override
    public PhoneService craetePhone(PhoneVO phoneVO) {
        return new IPhoneServiceImpl();
    }
}
