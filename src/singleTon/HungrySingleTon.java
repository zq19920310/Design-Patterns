package singleTon;

/**
 * 饿汉式迫不及待
 * 类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了
 * 是线程安全的
 */
public class HungrySingleTon {
    private static HungrySingleTon instance=new HungrySingleTon();
    private HungrySingleTon() {
    }
    public static HungrySingleTon getInstance(){
        return instance;
    }

}
