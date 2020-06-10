package com.javayh.proxy.game;

/**
 * <p>
 * 测试
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-06-10
 */
public class GameTest {
    private static final String userName = "admin";
    private static final String password = "12345";

    public static void main(String[] args) {
        IGameFrame iGameFrame = new GameProxy(new RealGame());
        //1. login
        Boolean admin = iGameFrame.login(userName, password);
        if(admin){
            System.out.println(userName+":登录成功");
            //2. kill box
            System.out.println(iGameFrame.killBox(userName));
            //3. upgrade
            System.out.println(iGameFrame.upgrade(userName));
        }
    }

}
