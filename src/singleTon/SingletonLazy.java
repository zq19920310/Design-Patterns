package singleTon;

public class SingletonLazy {
    public static void main(String[] args) {
        Monitor m1=Monitor.getInstance();
        Monitor m2=Monitor.getInstance();
        m1.getName();
        m2.getName();
        if(m1==m2){
            System.out.println("他们是同一个人");
        }else{
            System.out.println("他们不是同一个人");
        }
    }
}
class Monitor{
    private static volatile Monitor monitor=null;
    private Monitor(){
        System.out.println("产生了一个班长！");
    }
    public static synchronized Monitor getInstance(){
        if(monitor==null){
            monitor=new Monitor();
        }else{
            System.out.println("已经有了一个班长,不能有新班长了");
        }
        return monitor;
    }
    public void getName(){
        System.out.println("我是班长,我叫ZQ");
    }


}