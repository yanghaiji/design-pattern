package com.javayh.template.web;

import com.javayh.constant.Constant;
import com.javayh.result.DataResult;
import com.javayh.template.service.JimmyService;
import com.javayh.template.template.JavayhTemplate;
import com.javayh.vo.GirlVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author Dylan Yang
 * @Description:
 * @ProjectName design-pattern
 * @date 2020-02-07 11:55
 */
@RestController
public class GirlWeb {

    /**
     * @Description 判断这个女孩符合你的要求与否
     * @UserModule: design-pattern     
     * @author Dylan
     * @date 2020/2/7 0007
     * @param [girlVO] 
     * @return com.javayh.result.DataResult
     */
    @PostMapping(value = "getGirl")
    public DataResult getGirl(@RequestBody GirlVO girlVO){
        JavayhTemplate jimmyService = new JimmyService(girlVO);
        Boolean template = jimmyService.template();
        return DataResult.success(template ==  true ? "我很心仪!" : "我们不合适");
    }
}
