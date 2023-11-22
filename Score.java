
package quizapplication;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    JButton PlayAgain,exit;
    
    Score(String name,int score){
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/ScoreImage.jpg"));
        JLabel image= new JLabel(i1);
        image.setBounds(0,0,1500,300);
        add(image);
        
        JLabel heading = new JLabel("Thankyou "+name+" for your time!");
        heading.setBounds(550,380,1000,45);
        heading.setFont(new Font("Times New Roman",Font.BOLD, 35));
        heading.setForeground(Color.PINK);
        add(heading);
        
        JLabel yourScore = new JLabel("Your score is: "+score);
        yourScore.setBounds(650,450,1000,45);
        yourScore.setFont(new Font("Times New Roman",Font.ITALIC, 33));
        yourScore.setForeground(Color.PINK);
        add(yourScore);
        
        PlayAgain= new JButton("Play Again");
        PlayAgain.setBounds(900, 600, 150, 35);
        PlayAgain.setFont(new Font("Times New Roman",Font.PLAIN, 25));
        PlayAgain.setBackground(Color.PINK);
        PlayAgain.setForeground(Color.BLACK);
        PlayAgain.addActionListener(this);
        add(PlayAgain);
        
        exit= new JButton("Exit");
        exit.setBounds(500, 600, 150, 35);
        exit.setFont(new Font("Times New Roman",Font.PLAIN, 25));
        exit.setBackground(Color.PINK);
        exit.setForeground(Color.BLACK);
        exit.addActionListener(this);
        add(exit);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==PlayAgain){
            setVisible(false);
            new Login();
        }
        else if(ae.getSource()==exit){
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Score("user", 0);
    }
}
