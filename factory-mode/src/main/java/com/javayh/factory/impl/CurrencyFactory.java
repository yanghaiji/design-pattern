package com.javayh.factory.impl;

import com.javayh.constant.Constant;
import com.javayh.factory.PhoneFactory;
import com.javayh.service.PhoneService;
import com.javayh.service.impl.HWServiceImpl;
import com.javayh.service.impl.IPhoneServiceImpl;
import com.javayh.vo.PhoneVO;

/**
 * @author Dylan Yang
 * @Description: 通用工厂
 * @ProjectName design-pattern
 * @date 2020-02-03 13:03
 */
public class CurrencyFactory implements PhoneFactory {

    /**
     * @Description 通用
     * @UserModule: design-pattern
     * @author Dylan
     * @date 2020/2/3 0003
     * @param [phoneVO]
     * @return com.javayh.service.PhoneService
     */
    @Override
    public PhoneService craetePhone(PhoneVO phoneVO) {
        return crateFactory(phoneVO.getType());
    }

    private PhoneService crateFactory(String type){
        return Constant.HUAWEI.equalsIgnoreCase(type)? new HWServiceImpl(): new IPhoneServiceImpl();
    }
}
