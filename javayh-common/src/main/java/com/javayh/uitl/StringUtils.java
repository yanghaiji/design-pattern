package com.javayh.uitl;

import java.util.concurrent.ThreadLocalRandom;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-04-26
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {

    private static final ThreadLocalRandom RANDOM = ThreadLocalRandom.current();

    public static String num(){
        return StringUtils.rightPad("8",5,generateNumber(4));
    }

    private static String generateNumber(final int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(RANDOM.nextInt(9));
        }
        return sb.toString();

    }
}
