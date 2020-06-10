package com.javayh.proxy.game;

import org.apache.commons.lang3.ObjectUtils;

/**
 * <p>
 *      游戏代练
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-06-10
 */
public class GameProxy implements IGameFrame {

    private RealGame realGame;

    /**
     * <p>
     *       通过工造方法进行注入
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/6/10
     * @param realGame
     * @return null
     */
    public GameProxy(RealGame realGame) {
        if(ObjectUtils.isEmpty(realGame)){
            this.realGame = new RealGame();
        }
        this.realGame = realGame;
    }

    @Override
    public Boolean login(String userName, String passWord) {
        return realGame.login(userName,passWord);
    }

    @Override
    public String killBox(String userName) {
        return realGame.killBox(userName);
    }

    @Override
    public String upgrade(String userName) {
        return realGame.upgrade(userName);
    }
}
