package singleTon;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class SingletonEager {
    public static void main(String[] args) {
        JFrame jf = new JFrame("饿汉单例模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container contentPane = jf.getContentPane();
        Pig obj1 = Pig.getInstance();
        contentPane.add(obj1);
        Pig obj2 = Pig.getInstance();
        contentPane.add(obj2);
        if (obj1 == obj2) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//饿汉式
class Pig extends JPanel {
    private static Pig pig=new Pig();
    private BufferedImage img ;
    private Pig(){
        InputStream is;
        try {
            img=ImageIO.read(getClass().getResource("Bajie.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JLabel l1 = new JLabel(new ImageIcon("src/singleTon/Bajie.jpg"));
//        JLabel l1 = new JLabel(new ImageIcon(img));
        this.add(l1);
    }
    public static Pig getInstance(){
        return pig;
    }

}
