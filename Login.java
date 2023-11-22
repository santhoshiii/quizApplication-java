
package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,exit;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/quizImage.jpg"));
        JLabel image= new JLabel(i1);
        image.setBounds(0,0,1500,500);
        add(image);
        
        /*JLabel heading = new JLabel("IT'S QUIZ TIME!");
        heading.setBounds(650,550,250,45);
        heading.setFont(new Font("Times New Roman",Font.BOLD, 30));
        heading.setForeground(Color.WHITE);
        add(heading);*/
        
        JLabel name = new JLabel("Enter your name ");
        name.setBounds(648,510,250,45);
        name.setFont(new Font("Times New Roman",Font.PLAIN, 30));
        name.setForeground(Color.PINK);
        add(name);
        
        tfname= new JTextField();
        tfname.setBounds(600,565,320,40);
        tfname.setFont(new Font("Times New Roman",Font.ITALIC, 30));
        tfname.setBackground(Color.PINK);
        tfname.setForeground(Color.BLACK);
        add(tfname);
        
        exit= new JButton("Exit");
        exit.setBounds(530, 700, 90, 35);
        exit.setFont(new Font("Times New Roman",Font.PLAIN, 25));
        exit.setBackground(Color.PINK);
        exit.setForeground(Color.BLACK);
        exit.addActionListener(this);
        add(exit);
        
        rules= new JButton("Rules");
        rules.setBounds(890, 700, 90, 35);
        rules.setFont(new Font("Times New Roman",Font.PLAIN, 25));
        rules.setBackground(Color.PINK);
        rules.setForeground(Color.BLACK);
        rules.addActionListener(this);
        add(rules);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setLocation(200,150);
        //setSize(1200,500);
        setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==exit){
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Login();
    }
}
