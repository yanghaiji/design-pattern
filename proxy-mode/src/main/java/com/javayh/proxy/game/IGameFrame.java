package com.javayh.proxy.game;

import org.springframework.lang.Nullable;

/**
 * <p>
 *      打游戏
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-06-10
 */
public interface IGameFrame {
    /**
     * <p>
     *       登录游戏
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/6/10
     * @param userName
     * @param passWord
     * @return java.lang.String
     */
    Boolean login(@Nullable String userName, String passWord);

    /**
     * <p>
     *       打怪
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/6/10
     * @param userName
     * @return java.lang.String
     */
    String killBox(@Nullable String userName);

    /**
     * <p>
     *       升级
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/6/10
     * @param userName
     * @return java.lang.String
     */
    String upgrade(@Nullable String userName);

}
