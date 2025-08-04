package bank.management.system;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,education,occupation,category,income;
    String formno;
   
    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
             
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details ");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,23));
        additionalDetails.setBounds(250, 60, 400, 30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion :");
        name.setFont(new Font("Raleway",Font.BOLD,17));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String[] valReligion = {"Hindu","Muslim","Christian","Sikh","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname = new JLabel("Category :");
        fname.setFont(new Font("Raleway",Font.BOLD,17));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        String[] valCategory = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.white);
        add(category);
        
        JLabel dob = new JLabel("Income :");
        dob.setFont(new Font("Raleway",Font.BOLD,17));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String[] incomeCategory = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.white);
        add(income);

        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD,17));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Raleway",Font.BOLD,17));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        String[] educationValues = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.white);
        add(education);
 
        JLabel marital = new JLabel("Occupation :");
        marital.setFont(new Font("Raleway",Font.BOLD,17));
        marital.setBounds(100, 380, 200, 30);
        add(marital);
        
        String[] occupationValues = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 380, 400, 30);
        occupation.setBackground(Color.white);
        add(occupation);
        
        JLabel address = new JLabel("Pan Number :");
        address.setFont(new Font("Raleway",Font.BOLD,17));
        address.setBounds(100, 430, 200, 30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.PLAIN,15));
        pan.setBounds(300, 430, 400, 30);
        add(pan);
        
        JLabel city = new JLabel("Aadhar Number :");
        city.setFont(new Font("Raleway",Font.BOLD,17));
        city.setBounds(100, 480, 200, 30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.PLAIN,15));
        aadhar.setBounds(300, 480, 400, 30);
        add(aadhar);
        
        JLabel state = new JLabel("Senior Citizen :");
        state.setFont(new Font("Raleway",Font.BOLD,17));
        state.setBounds(100, 530, 200, 30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 530, 100, 30);
        syes.setBackground(Color.white);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(400, 530, 100, 30);
        sno.setBackground(Color.white);
        add(sno);
        
        ButtonGroup smaritalGroup = new ButtonGroup();
        smaritalGroup.add(syes);
        smaritalGroup.add(sno);
        
        JLabel pincode = new JLabel("Existing Account :");
        pincode.setFont(new Font("Raleway",Font.BOLD,17));
        pincode.setBounds(100, 580, 200, 30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 580, 100, 30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(400, 580, 100, 30);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup emaritalGroup = new ButtonGroup();
        emaritalGroup.add(eyes);
        emaritalGroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.blue);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620, 620, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
   
        setSize(800, 700);
        setLocation(300,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
          
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        } else if(sno.isSelected()) {
            seniorcitizen = "No";
        }
            
        String existingaccount = null;
        if(eyes.isSelected()) {
            existingaccount = "Yes";
        } else if(eno.isSelected()) {
            existingaccount = "No";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
       
        try {
            Conn c = new Conn();
                String query = "Insert into signuptwo values('"+formno+"', '"+sreligion+"','"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
         catch(Exception e) {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        new SignupTwo("");
    }
    
}
