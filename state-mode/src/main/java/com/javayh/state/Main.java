package com.javayh.state;

import com.javayh.constant.Constant;
import com.javayh.domain.HotelEntity;
import com.javayh.state.context.HotelContext;
import com.javayh.state.context.StateContext;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-04-26
 */
public class Main {

    public static void main(String[] args) {
//        StateContext context = new StateContext();
//        context.request("OOO");

        for (int i = 1; i < 60; i++) {
            HotelContext hotelContext = new HotelContext();
            HotelEntity hotelEntity = new HotelEntity();
            hotelEntity.setUserName("admin"+i);
            hotelEntity.setType(Constant.PRESIDENTIAL_SUITE);
            hotelContext.run(hotelEntity);
        }

        for (int i = 1; i < 60; i++) {
            HotelContext hotelContext = new HotelContext();
            HotelEntity hotelEntity = new HotelEntity();
            hotelEntity.setUserName("admin"+i);
            hotelEntity.setType(Constant.PRESIDENTIAL_SUITE);
            hotelContext.stop(hotelEntity);
        }
    }

}

