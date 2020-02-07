package com.javayh.template.template;

import com.javayh.constant.Constant;
import lombok.Data;

/**
 * @author Dylan Yang
 * @Description: 模板接口
 * @ProjectName design-pattern
 * @date 2020-02-07 11:04
 */
@Data
public abstract class JavayhTemplate {

    private Double height;
    private Integer age;
    private Double bodyWeight;
    private String gender;
    private boolean defaultValue = true;

    public JavayhTemplate(Double height, Integer age, Double bodyWeight, String gender) {
        this.height = height;
        this.age = age;
        this.bodyWeight = bodyWeight;
        this.gender = gender;
    }

    /**
     * @Description 身高要求
     * @UserModule: design-pattern
     * @author Dylan
     * @date 2020/2/7 0007
     * @param [height]
     * @return java.lang.Integer
     */
   public abstract Boolean heightRequirement(Double height);

   /**
    * @Description 年龄要求
    * @UserModule: design-pattern
    * @author Dylan
    * @date 2020/2/7 0007
    * @param [age]
    * @return java.lang.Boolean
    */
   public abstract Boolean ageRrequirement(Integer age);

   /**
    * @Description 体重要求
    * @UserModule: design-pattern
    * @author Dylan
    * @date 2020/2/7 0007
    * @param [bodyWeight]
    * @return java.lang.Boolean
    */
   public abstract Boolean bodyWeightRequirement(Double bodyWeight);

   /**
    * @Description 钩子方法 判断是不是一个女孩
    * @UserModule: design-pattern
    * @author Dylan
    * @date 2020/2/7 0007
    * @param [gender]
    * @return java.lang.Boolean
    */
   public Boolean genderRequirements(String gender){
       return Constant.GIRL.equalsIgnoreCase(gender) ? true :false;
   }

   /**
    * @Description 判断是男还是女，这里以女孩为例
    * @UserModule: design-pattern
    * @author Dylan
    * @date 2020/2/7 0007
    * @param []
    * @return java.lang.Boolean
    */
   public /*final*/ Boolean template(){
       if(genderRequirements(getGender())){
           Boolean heightRequirement = heightRequirement(getHeight());
           Boolean ageRrequirement = ageRrequirement(getAge());
           Boolean bodyWeightRequirement = bodyWeightRequirement(getBodyWeight());
           return  heightRequirement.equals(defaultValue) &&
                   ageRrequirement.equals(defaultValue) &&
                   bodyWeightRequirement.equals(defaultValue) ? defaultValue : !defaultValue;
       }
       return !defaultValue;
   }
}
