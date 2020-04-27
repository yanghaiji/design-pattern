package com.javayh.state.hotel;

import com.javayh.constant.Constant;
import com.javayh.domain.HotelEntity;
import com.javayh.uitl.StringUtils;

import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-04-26
 */
public class HotelType {

    public static void get(HotelEntity hotelEntity) {
        String type = hotelEntity.getType();
        String num = null;
        if (Constant.STANDARD_ROOM.equalsIgnoreCase(type)) {
            Map<String, Object> standardRoom = HotelEntity.getStandardRoom();
            if(standardRoom.size() < 100){
                num = StringUtils.num();
                System.out.println(hotelEntity.getUserName()+"正在预定.......");
                standardRoom.put(hotelEntity.getUserName(), num);
                System.out.println(hotelEntity.getUserName()+"标间预定成功;房间号为:"+num);
            }else {
                System.out.println("正在给您进行房间升级......");
                hotelEntity.setType(Constant.FAMILY_ROOM) ;
                type = hotelEntity.getType();
            }
        }
        if (Constant.FAMILY_ROOM.equalsIgnoreCase(type)) {
            Map<String, Object> familyRoom = HotelEntity.getFamilyRoom();
            if(familyRoom.size() < 50){
                num = StringUtils.num();
                System.out.println(hotelEntity.getUserName()+"正在预定.......");
                familyRoom.put(hotelEntity.getUserName(), num);
                System.out.println(hotelEntity.getUserName()+"家庭房预定成功;房间号为:"+num);
            }else {
                System.out.println("正在给您进行房间升级......");
                hotelEntity.setType(Constant.PRESIDENTIAL_SUITE) ;
                type = hotelEntity.getType();
            }
        }
        if (Constant.PRESIDENTIAL_SUITE.equalsIgnoreCase(type)) {
            Map<String, Object> presidentialSuite = HotelEntity.getPresidentialSuite();
            if(presidentialSuite.size() < 50){
                num = StringUtils.num();
                System.out.println(hotelEntity.getUserName()+"正在预定.......");
                presidentialSuite.put(hotelEntity.getUserName(), num);
                System.out.println(hotelEntity.getUserName()+"套房预定成功;房间号为:"+num);
            }
        }
    }

    public static void removeHotel(HotelEntity hotelEntity) {
        String type = hotelEntity.getType();
        if (Constant.STANDARD_ROOM.equalsIgnoreCase(type)) {
            Map<String, Object> standardRoom = HotelEntity.getStandardRoom();
            if( 0 < standardRoom.size()){
                String userName = hotelEntity.getUserName();
                Object o = standardRoom.get(userName);
                System.out.println(userName+"正在退房......");
                standardRoom.remove(userName);
                System.out.println(userName+"退房成功;房间号为:"+o);
            }
        } else if (Constant.FAMILY_ROOM.equalsIgnoreCase(type)) {
            Map<String, Object> familyRoom = HotelEntity.getFamilyRoom();
            if( 0 < familyRoom.size()){
                String userName = hotelEntity.getUserName();
                System.out.println(userName+"正在退房.....");
                Object o = familyRoom.get(userName);
                familyRoom.remove(userName);
                System.out.println(userName+"退房成功;房间号为:"+o);
            }
        } else if (Constant.PRESIDENTIAL_SUITE.equalsIgnoreCase(type)) {
            Map<String, Object> presidentialSuite = HotelEntity.getPresidentialSuite();
            if( 0 < presidentialSuite.size()){
                String userName = hotelEntity.getUserName();
                Object o = presidentialSuite.get(userName);
                System.out.println(userName+"正在退房.....");
                presidentialSuite.remove(userName);
                System.out.println(userName+"退房成功;房间号为:"+o);
            }
        }else {
            System.out.println("非法操作!");
        }
    }
}
