package com.javayh.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Dylan Yang
 * @Description: json返回
 * @ProjectName design-pattern-pattern
 * @date 2020-02-02 15:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataResult<T> {

    private Integer code;
    private String msg;
    private T data;

    public static <T> DataResult<T> success(T dataPrama){
        return new DataResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),dataPrama);
    }

    public static <T> DataResult<T> success(String msg,T dataPrama){
        return new DataResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(msg),dataPrama);
    }

    public static <T> DataResult<T> failed(T dataPrama){
        return new DataResult<T>(ResultCode.FAILED.getCode(),ResultCode.FAILED.getMessage(),dataPrama);
    }

    public static <T> DataResult<T> failed(String msg,T dataPrama){
        return new DataResult<T>(ResultCode.FAILED.getCode(),ResultCode.FAILED.getMessage(msg),dataPrama);
    }
}
