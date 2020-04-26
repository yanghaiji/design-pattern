package com.javayh.state.hotel.info;

import com.javayh.domain.HotelEntity;
import com.javayh.state.hotel.HotelState;
import com.javayh.state.hotel.HotelType;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-04-26
 */
public class FamilyHotel implements HotelState {

    @Override
    public Boolean add(HotelEntity hotelEntity) {
        try{
            HotelType.get(hotelEntity);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public Boolean remove(HotelEntity hotelEntity) {
        try{
            HotelType.removeHotel(hotelEntity);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
