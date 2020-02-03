package com.javayh.dto;

import com.javayh.domain.ComputerGift;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Dylan Yang
 * @Description: 电脑
 * @ProjectName design-pattern
 * @date 2020-02-03 16:50
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ComputerDTO {
    /*品牌*/
    private String brand;
    /*核数*/
    private String nucleus;
    /*显卡*/
    private String graphicsCard;
    /*处理器*/
    private String cpu;
    /*尺寸*/
    private String size;
    /*赠品*/
    private ComputerGift computerGift;
}
