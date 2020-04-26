package com.javayh.state.context;

import com.javayh.constant.Constant;
import com.javayh.domain.HotelEntity;
import com.javayh.state.hotel.HotelState;
import com.javayh.state.hotel.info.FamilyHotel;
import com.javayh.state.hotel.info.FreeHotel;
import com.javayh.state.hotel.info.PresidentialSuiteHotel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 * 酒店订单
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-04-26
 */
public class HotelContext {
    private HotelState hotelState;
    public void setHotelState(HotelState hotelState) {
        this.hotelState = hotelState;
    }

    public Boolean run(HotelEntity hotelEntity){
        String type = hotelEntity.getType();
        if(Constant.STANDARD_ROOM.equalsIgnoreCase(type)){
            hotelState = new FreeHotel();
        }else if(Constant.FAMILY_ROOM.equalsIgnoreCase(type)){
            hotelState = new FamilyHotel();
        }else if(Constant.PRESIDENTIAL_SUITE.equalsIgnoreCase(type)){
            hotelState = new PresidentialSuiteHotel();
        }else {
            return false;
        }
        return hotelState.add(hotelEntity);
    }

    public Boolean stop(HotelEntity hotelEntity){
        String type = hotelEntity.getType();
        if(Constant.STANDARD_ROOM.equalsIgnoreCase(type)){
            hotelState = new FreeHotel();
        }else if(Constant.FAMILY_ROOM.equalsIgnoreCase(type)){
            hotelState = new FamilyHotel();
        }else if(Constant.PRESIDENTIAL_SUITE.equalsIgnoreCase(type)){
            hotelState = new PresidentialSuiteHotel();
        }else {
            return false;
        }
        return hotelState.remove(hotelEntity);
    }
}
