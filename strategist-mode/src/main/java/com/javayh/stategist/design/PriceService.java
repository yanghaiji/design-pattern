package com.javayh.stategist.design;

import com.javayh.dto.PriceDTO;
import com.javayh.vo.PriceVO;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Dylan Yang
 * @Description: 策略接口
 * @ProjectName design-pattern-pattern
 * @date 2020-02-02 15:57
 */
public interface PriceService {

    Map<String, PriceService> map = new ConcurrentHashMap<>();
    @PostConstruct
    default void init() {
        map.put(this.getCustomerType(), this);
    }
    /**
     * @Description 根据用户计算价格
     * @UserModule: design-pattern
     * @author Dylan
     * @date 2020/2/2 0002
     * @param [priceVO]
     * @return PriceDTO
     */
    PriceDTO getPrice(PriceVO priceVO);

    /**
     * @Description 确定类型
     * @UserModule: design-pattern
     * @author Dylan
     * @date 2020/2/2 0002
     * @param []
     * @return java.lang.String
     */
    String getCustomerType();
}
