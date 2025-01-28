import java.awt.*;
import javax.swing.*;

public class Logingui {
    public Logingui(){
        JFrame f = new JFrame("Login");
        Container cp = f.getContentPane();
        cp.setLayout(null);
        JLabel user = new JLabel("USER :  ");
        JLabel password = new JLabel("Password :  ");
        JButton b = new JButton("Login");
        JTextField tf = new JTextField("",10);
        JPasswordField pf = new JPasswordField("",10);
        user.setBounds(37,0,100,40);
        tf.setBounds(90,10,140,20);
        password.setBounds(10,29,100,40);
        pf.setBounds(90,39,140,20);
        b.setBounds(90,68,70,25);
        cp.add(user);
        cp.add(tf);
        cp.add(password);
        cp.add(pf);
        cp.add(b);
        f.setSize(250,135);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
