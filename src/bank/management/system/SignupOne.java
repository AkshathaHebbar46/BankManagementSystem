package bank.management.system;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField, fnameTextField, emailTextField,addressTextField, stateTextField, cityTextField, pinTextField;
    JButton next;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser  dateChooser;
    SignupOne() {
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000)+1000);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,35));
        formno.setBounds(150, 20, 600, 40);
        add(formno);
        
        JLabel personDetails = new JLabel("Page 1 : Personal Details ");
        personDetails.setFont(new Font("Raleway",Font.BOLD,23));
        personDetails.setBounds(250, 80, 400, 30);
        add(personDetails);
        
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway",Font.BOLD,17));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.PLAIN,15));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name :");
        fname.setFont(new Font("Raleway",Font.BOLD,17));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.PLAIN,15));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,17));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,17));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(400, 290, 120, 30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JLabel email = new JLabel("Email Address :");
        email.setFont(new Font("Raleway",Font.BOLD,17));
        email.setBounds(100, 330, 200, 30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.PLAIN,15));
        emailTextField.setBounds(300, 330, 400, 30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status :");
        marital.setFont(new Font("Raleway",Font.BOLD,17));
        marital.setBounds(100, 380, 200, 30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300, 380, 100, 30);
        married.setBackground(Color.white);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(400, 380, 100, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(510, 380, 100, 30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup mStatus = new ButtonGroup();
        mStatus.add(married);
        mStatus.add(unmarried);
        mStatus.add(other);
        
        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,17));
        address.setBounds(100, 430, 200, 30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.PLAIN,15));
        addressTextField.setBounds(300, 430, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,17));
        city.setBounds(100, 480, 200, 30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.PLAIN,15));
        cityTextField.setBounds(300, 480, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("State :");
        state.setFont(new Font("Raleway",Font.BOLD,17));
        state.setBounds(100, 530, 200, 30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.PLAIN,15));
        stateTextField.setBounds(300, 530, 400, 30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pin Code :");
        pincode.setFont(new Font("Raleway",Font.BOLD,17));
        pincode.setBounds(100, 580, 200, 30);
        add(pincode);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.PLAIN,15));
        pinTextField.setBounds(300, 580, 400, 30);
        add(pinTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.blue);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620, 620, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
   
        setSize(800, 700);
        setLocation(300,20);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String formno = ""+random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if(female.isSelected()) {
            gender = "Female";
        }
        
        String email = emailTextField.getText();
        
        String mStatus = null;
        if(married.isSelected()) {
            mStatus = "Married";
        } else if(unmarried.isSelected()) {
            mStatus = "Unmarried";
        } else if(other.isSelected()) {
            mStatus = "Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        try {
            if(name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            } else {
                Conn c = new Conn();
                String query = "Insert into signup values('"+formno+"', '"+name+"','"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+mStatus+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        new SignupOne();
    }
    
}
