import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JButton btn1;
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
        this.setLayout(null);

        // adding a button
        button= new JButton();
        btn1= new JButton("Disabled.");
        btn1.setFocusable(false);
        btn1.setBounds(200, 200, 100, 50);
        btn1.setEnabled(false);

        button.setText("Click Here");
        button.setFocusable(false);
        button.addActionListener(this);
        button.setBounds(200, 100, 100, 50);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);

        this.add(button);
        this.add(btn1);
    }

    public static void main(String[] params){
        new MyFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Button was clicked.");
            btn1.setEnabled(true);
        }
    }
}