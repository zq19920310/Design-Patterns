package singleTon;

/**
 * 该模式的特点是类加载时没有生成单例,
 * 只有当getInstance方法执行时才会去创建这个实例
 * 注意:懒汉式单例会出现线程不安全的情况
 *      所以需要加上volatile、synchronized保证线程安全
 *      但是每次访问时都要同步,会影响性能,消耗更多资源
 */
public class LazySingleton {
    private static volatile LazySingleton instance=null;

    private LazySingleton() {

    }
    public static synchronized LazySingleton getInstance(){
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }

}
