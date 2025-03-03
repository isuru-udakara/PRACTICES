import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setTitle("My Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        ImageIcon image= new ImageIcon("icons\\home.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(240, 240, 240));
        this.setVisible(true);
    }

    public static void main(String[] params){
        new MyFrame();
    }
}