package com.javayh.web;

import com.javayh.factory.PhoneFactory;
import com.javayh.factory.impl.CurrencyFactory;
import com.javayh.factory.impl.HWPhoneFactory;
import com.javayh.result.DataResult;
import com.javayh.service.PhoneService;
import com.javayh.vo.PhoneVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dylan Yang
 * @Description: 手机/型号/套餐 适配
 * @ProjectName design-pattern
 * @date 2020-02-03 12:05
 */
@RestController
public class PhoneWeb {

    /**
     * @Description 获取手机
     * @UserModule: design-pattern
     * @author Dylan
     * @date 2020/2/3 0003
     * @param [vo]
     * @return com.javayh.result.DataResult
     */
    @PostMapping(value = "/getPhone")
    public DataResult getPhone(@RequestBody PhoneVO vo){
        PhoneFactory phoneFactory = new HWPhoneFactory();
        PhoneService phoneService = phoneFactory.craetePhone(vo);
        return DataResult.success(phoneService.getPhone(vo));
    }

    /**
     * @Description 获取手机
     * @UserModule: design-pattern
     * @author Dylan
     * @date 2020/2/3 0003
     * @param [vo]
     * @return com.javayh.result.DataResult
     */
    @PostMapping(value = "/getCurrency")
    public DataResult getCurrency(@RequestBody PhoneVO vo){
        PhoneFactory phoneFactory = new CurrencyFactory();
        PhoneService phoneService = phoneFactory.craetePhone(vo);
        return DataResult.success(phoneService.getPhone(vo));
    }

}
