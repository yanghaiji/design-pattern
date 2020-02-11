package com.javayh.singleton.entity;

/**
 * <p>
 * 懒汉式单例模式
 * </p>
 *
 * @author Dylan
 * @version 1.0.0
 * @since 2020-02-11 15:16
 */
public class LazySingleton {
    /**
     * 保证对象在所以线程中同步
     */
    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    /**
     * <p>
     *      获取实例的方法，保证创建唯一对象
     *      synchronized 本身就比较消耗性能，所使用的更是需要注意。
     *      本案例中,多线程是发生错误的地方应该是在创建对象的过程，
     *      所以我们只需要锁创建对象的的代码即可，这样开销更小！
     * </p>
     * @version 1.0.0
     * @author Dylan
     * @since 2020/2/11 0011
     * @param
     * @return com.javayh.singleton.entity.LazySingleton
     */
    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
