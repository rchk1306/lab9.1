import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Carlicense {
    public Carlicense(){
            JFrame frame = new JFrame("Vechicle registration");
            Container cp = frame.getContentPane();
            cp.setLayout(null);
    
            JLabel name = new JLabel("Name : ");
            JTextField ntf = new JTextField("",40);
            JLabel license = new JLabel("Car license : ");
            JTextField ltf = new JTextField("",10);
            JLabel province = new JLabel("Province : ");
            JComboBox<String> p = province_to_combobox();
            JLabel type = new JLabel("Car Type : ");
            JRadioButton car = new JRadioButton("Car",true);
            JRadioButton bike = new JRadioButton("Bike",false);
            ButtonGroup group = new ButtonGroup();
            group.add(car);
            group.add(bike);
            JButton b = new JButton("OK");
    
            name.setBounds(41,0,100,40);
            ntf.setBounds(90,10,200,20);
            license.setBounds(10,30,100,40);
            ltf.setBounds(90,39,100,20);
            province.setBounds(24,67,70,25);
            p.setBounds(90,68,100,20);
            type.setBounds(24,95,70,25);
            car.setBounds(90,97,50,20);
            bike.setBounds(150,97,50,20);
            b.setBounds(100,130,70,30);
    
            cp.add(name);
            cp.add(ntf);
            cp.add(license);
            cp.add(ltf);
            cp.add(province);
            cp.add(p);
            cp.add(type);
            cp.add(car);
            cp.add(bike);
            cp.add(b);
            
            frame.setSize(320,210);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public JComboBox<String> province_to_combobox(){
        JComboBox<String> tmp = new JComboBox<>();
        File f = null;
        FileReader fr = null ;
        BufferedReader fb = null;
            try {
                f = new File("Thailand_PRV.csv");
                fr = new FileReader(f);
                fb = new BufferedReader(fr);
                System.out.println("");
                String s;
                fb.readLine();
                while ((s = fb.readLine()) != null) {
                    String arr[] = s.split(",");
                    tmp.addItem(arr[1]);
                }
                //tmp.setSelectedIndex(1); //ใช้ได้เหมือนกัน
                tmp.setSelectedItem("Bangkok");
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    try {
                        fb.close();
                        fr.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
           return tmp;
    }
    
}
