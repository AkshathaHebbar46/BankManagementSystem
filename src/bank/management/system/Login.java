package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Times New Roman",Font.BOLD, 35));
        text.setBounds(250,20,400,40);
        add(text);
        
        JLabel cardno = new JLabel("Card Number : ");
        cardno.setFont(new Font("Times New Roman",Font.BOLD, 20));
        cardno.setBounds(250,80,200,100);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(400, 115, 300, 30);
        cardTextField.setFont(new Font("Aerial",Font.PLAIN,15));
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN : ");
        pin.setFont(new Font("Times New Roman",Font.BOLD, 20));
        pin.setBounds(250,140,200,100);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(400, 175, 300, 30);
        pinTextField.setFont(new Font("Aerial",Font.PLAIN,15));
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBackground(Color.blue);
        login.setForeground(Color.white);
        login.setBounds(400, 230, 100, 30);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBackground(Color.blue);
        clear.setForeground(Color.white);
        clear.setBounds(600, 230, 100, 30);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBackground(Color.blue);
        signup.setForeground(Color.white);
        signup.setBounds(400, 280, 300, 30);
        signup.addActionListener(this);
        add(signup);
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(800,400);
        setVisible(true);
        setLocation(300,200);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource()==login) {
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            
            try {
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()) {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            } catch(Exception e) {
                System.out.println(e);
            }
        }
        
        else if(ae.getSource()==signup) {
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Login();  
    }
}
