package prototype;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Administrator
 */
public class ProtoTypeWukong {
    public static void main(String[] args) throws  CloneNotSupportedException {
        JFrame jf=new JFrame("真假美猴王");
        //一行两列的布局
        GridLayout g = new GridLayout(1,2);
        jf.setLayout(g);
        // 容器
        Container contentPanel = jf.getContentPane();
        SunWuKong obj1 = new SunWuKong();
        //将悟空对象添加到容器里
        contentPanel.add(obj1);
        SunWuKong obj2 = (SunWuKong) obj1.clone();
        contentPanel.add(obj2);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class SunWuKong extends JPanel implements Cloneable{
    private static final long serialVersionUID = 1L;
    public SunWuKong()  {
//        JLabel l1 = new JLabel(new ImageIcon("src/singleTon/Bajie.jpg"));
        JLabel l1 = new JLabel(new ImageIcon("src/prototype/Wukong.jpg"));

        this.add(l1);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        SunWuKong s=null;
        try {
            s= (SunWuKong) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("复制错误");
        }
        return s;
    }
}
