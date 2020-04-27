package com.javayh.domain;

import com.javayh.constant.Constant;
import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-04-26
 */
@Data
public class HotelEntity {
    /**初始化酒店房间数*/
    private static volatile Map<String,Object> standardRoom;
    private static volatile Map<String,Object> familyRoom ;
    private static volatile Map<String,Object> presidentialSuite ;
    private static volatile HotelEntity hotelEntity ;
    /**锁*/
    private static ReentrantLock standardRoomLocK = new ReentrantLock(true);
    private static ReentrantLock familyRoomLocK = new ReentrantLock(true);
    private static ReentrantLock presidentialSuiteLocK = new ReentrantLock(true);
    private static ReentrantLock hotelEntityLock = new ReentrantLock(true);
    private String userName;
    private String type;
    private AtomicInteger roomNum = new AtomicInteger(0);

    private HotelEntity() {
    }

    public static HotelEntity getInstance() {
        if(hotelEntity == null ){
            try {
                if (hotelEntityLock.tryLock()){
                    if(hotelEntity == null ){
                        hotelEntity = new HotelEntity();
                    }
                }
            }finally {
                hotelEntityLock.unlock();
            }
        }
        return hotelEntity;
    }

    public static Map<String, Object> getStandardRoom() {
        if(standardRoom == null ){
            try {
                if (standardRoomLocK.tryLock()){
                    if(standardRoom == null ){
                        standardRoom = new ConcurrentHashMap<>(100);
                    }
                }
            }finally {
                standardRoomLocK.unlock();
            }
        }
        return standardRoom;
    }

    public static Map<String, Object> getFamilyRoom() {
            if(familyRoom == null ){
                try{
                    if (familyRoomLocK.tryLock()){
                        if(familyRoom == null ){
                            familyRoom = new ConcurrentHashMap<>(100);
                        }
                    }
                }finally {
                    familyRoomLocK.unlock();
                }
            }

        return familyRoom;
    }

    public static Map<String, Object> getPresidentialSuite() {
        if(presidentialSuite == null ){
            try{
                if (presidentialSuiteLocK.tryLock()){
                    if(presidentialSuite == null ){
                        presidentialSuite = new ConcurrentHashMap<>(100);
                    }
                }
            }finally {
                presidentialSuiteLocK.unlock();
            }

        }
        return presidentialSuite;
    }

}
