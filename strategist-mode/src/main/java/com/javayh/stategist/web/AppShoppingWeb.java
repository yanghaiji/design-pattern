package com.javayh.stategist.web;

import com.javayh.result.DataResult;
import com.javayh.stategist.design.CustomerContext;
import com.javayh.vo.PriceVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dylan Yang
 * @Description: 商品核算
 * @ProjectName design-pattern-pattern
 * @date 2020-02-02 15:13
 */
@RestController
public class AppShoppingWeb {

    /**
     * @Description 根据用户信息计算，产品价格，邮费信息
     * @UserModule: design-pattern
     * @author Dylan
     * @date 2020/2/2 0002
     * @param [vo]
     * @return com.javayh.result.DataResult
     */
    @PostMapping(value = "/getPrice")
    public DataResult getPrice(@RequestBody PriceVO vo){
        CustomerContext customerContext = new CustomerContext(vo.getType());
        return DataResult.success(customerContext.getPrice(vo));
    }

}
