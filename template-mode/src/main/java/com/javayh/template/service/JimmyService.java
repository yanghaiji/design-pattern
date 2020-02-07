package com.javayh.template.service;

import com.javayh.template.template.JavayhTemplate;
import com.javayh.vo.GirlVO;

/**
 * @author Dylan Yang
 * @Description: Jimmy
 * @ProjectName design-pattern
 * @date 2020-02-07 11:47
 */
public class JimmyService extends JavayhTemplate {

    public JimmyService(GirlVO girlVO) {
       super(girlVO.getHeight(),girlVO.getAge(),girlVO.getBodyWeight(),girlVO.getGender());
    }

    @Override
    public Boolean heightRequirement(Double height) {
        return height > 165;
    }

    @Override
    public Boolean ageRrequirement(Integer age) {
        return age < 28;
    }

    @Override
    public Boolean bodyWeightRequirement(Double bodyWeight) {
        return bodyWeight < 50;
    }

}
