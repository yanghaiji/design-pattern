package com.javayh.domain;

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
    private static ReentrantLock locK = new ReentrantLock(true);
    private String userName;
    private String type;

    public static Map<String, Object> getStandardRoom() {
        if(standardRoom == null ){
            try {
                if (locK.tryLock()){
                    if(standardRoom == null ){
                        standardRoom = new ConcurrentHashMap<>(100);
                    }
                }
            }finally {
                locK.unlock();
            }
        }
        return standardRoom;
    }

    public static Map<String, Object> getFamilyRoom() {
            if(familyRoom == null ){
                try{
                    if (locK.tryLock()){
                        if(familyRoom == null ){
                            familyRoom = new ConcurrentHashMap<>(100);
                        }
                    }
                }finally {
                    locK.unlock();
                }
            }

        return familyRoom;
    }

    public static Map<String, Object> getPresidentialSuite() {
        if(presidentialSuite == null ){
            try{
                if (locK.tryLock()){
                    if(presidentialSuite == null ){
                        presidentialSuite = new ConcurrentHashMap<>(100);
                    }
                }
            }finally {
                locK.unlock();
            }

        }
        return presidentialSuite;
    }

}
