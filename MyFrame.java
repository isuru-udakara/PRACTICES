import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
    JButton btn;
    JTextField tf;
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
        this.setLayout(new FlowLayout());

        btn= new JButton("Submit");
        btn.addActionListener(this);

        // creating a textbox 
        tf= new JTextField();
        tf.setPreferredSize(new Dimension(250, 40));

        this.add(btn);
        this.add(tf);
        this.pack();
    }

    public static void main(String[] params){
        new MyFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            System.out.println(tf.getText());
        }
    }
}