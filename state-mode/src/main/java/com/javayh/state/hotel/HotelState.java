package com.javayh.state.hotel;

import com.javayh.domain.HotelEntity;

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

    /**
     * <p>
     *     预定
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/4/27
     * @param hotelEntity
     * @return java.lang.Boolean
     */
    Boolean add(HotelEntity hotelEntity);

    /**
     * <p>
     *      退房
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/4/27
     * @param hotelEntity
     * @return java.lang.Boolean
     */
    Boolean remove(HotelEntity hotelEntity);

}
