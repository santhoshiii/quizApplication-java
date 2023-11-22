
package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    JButton back, start;
    String name;
    Rules(String name){
        this.name= name;
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " !");
        heading.setBounds(670,50,700,45);
        heading.setFont(new Font("Times New Roman",Font.PLAIN, 30));
        heading.setForeground(Color.PINK);
        add(heading);
        
        JLabel rules= new JLabel();
        rules.setBounds(470,120,740,400);
        rules.setFont(new Font("Times New Roman",Font.ITALIC, 20));
        rules.setText(
        "<html>"+
                "1. Answer the questions honestly and independently without seeking external help."+"<br><br>"+
                "2. Adhere to the specified time limits for each question and the overall quiz."+"<br><br>"+
                "3. Use compatible devices, browsers, and internet connections as specified."+"<br><br>"+
                "4. Maintain respectful and non-disruptive behavior during the quiz."+"<br><br>"+
                "5. Your personal information and data will be handled with care and respect."+"<br><br>"+
                "6. Do not skip questions, as you may not be able to return to them later."+"<br><br>"+
                "7. Do not use unauthorized software, plugins, or tools to assist in answering questions."+"<br><br>"+
        "</html>");
        rules.setForeground(Color.PINK);
        add(rules);
        
        back= new JButton("Back");
        back.setBounds(520, 570, 90, 35);
        back.setFont(new Font("Times New Roman",Font.PLAIN, 25));
        back.setBackground(Color.PINK);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);
        
        start= new JButton("Start");
        start.setBounds(950, 570, 90, 35);
        start.setFont(new Font("Times New Roman",Font.PLAIN, 25));
        start.setBackground(Color.PINK);
        start.setForeground(Color.BLACK);
        start.addActionListener(this);
        add(start);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== start){
           setVisible(false);
           new quiz(name);
        }
        else if(ae.getSource()== back){
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Rules("user");
    }
}
