import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

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

        // adding a label 
        JLabel lbl1= new JLabel();
        JLabel lbl2= new JLabel("Old Records: ");
        Border border= BorderFactory.createLineBorder(Color.green, 3);
        lbl1.setText("New Records: ");
        lbl1.setForeground(new Color(0xFF0000));
        lbl1.setFont(new Font("Consolas", Font.PLAIN, 20));
        lbl1.setBackground(Color.black);
        lbl1.setOpaque(true);
        lbl1.setBorder(border);
        lbl1.setVerticalAlignment(JLabel.CENTER);
        lbl1.setHorizontalAlignment(JLabel.CENTER);

        this.add(lbl1);
        //this.add(lbl2);
    }

    public static void main(String[] params){
        new MyFrame();
    }
}