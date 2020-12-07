package prototype;


public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation obj1=new Citation("张三", "同学：在2016学年第一学期中表现优秀，被评为三好学生。", "韶关学院");
        obj1.display();
        Citation obj2= (Citation) obj1.clone();
        obj2.setName("李四");
        obj2.display();
    }
}

class Citation implements Cloneable{
    String name;
    String info;
    String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display(){
        System.out.println(name+info+college);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功");
        return (Object)super.clone();
    }
}