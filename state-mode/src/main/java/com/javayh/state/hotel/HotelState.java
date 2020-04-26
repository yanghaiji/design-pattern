package com.javayh.state.hotel;

import com.javayh.constant.Constant;
import com.javayh.domain.HotelEntity;
import com.javayh.uitl.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>
 * 用户常用操作
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-04-26
 */
public interface HotelState {

    Boolean add(HotelEntity hotelEntity);

    Boolean remove(HotelEntity hotelEntity);

}
