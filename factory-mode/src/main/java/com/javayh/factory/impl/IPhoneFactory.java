package com.javayh.factory.impl;

import com.javayh.factory.PhoneFactory;
import com.javayh.service.PhoneService;
import com.javayh.service.impl.IPhoneServiceImpl;
import com.javayh.vo.PhoneVO;
import org.springframework.stereotype.Component;

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
