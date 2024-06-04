import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TemperatureConverter {
    public static void main(String[] args) {

        //creating frame
        JFrame frame=new JFrame("Converter");
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        //creating a combobox using array of strings
        String s1[] = {"CelsiusToFahrenheit","CelsiusToKelvin","FahrenheitToCelsius","FahrenheitToKelvin","KelvinToCelsius","KelvinToFahrenheit"};
        JComboBox comboBox=new JComboBox(s1);
        comboBox.setBounds(285,100,100,20);
        frame.add(comboBox);

        //creating a label 
        JLabel lc=new JLabel("Temperature:");
        lc.setBounds(100,100,100,25);
        frame.add(lc);
        
        //creating a textField for celsius
        JTextField t1=new JTextField(10);
        t1.setBounds(180,100,100,25);
        frame.add(t1);

        //creating another button
        JButton btn=new JButton("Convert");
        btn.setBounds(150,150,100,25);
        frame.add(btn);

        //creating a result label
        JLabel res=new JLabel("Result:");
        res.setBounds(150,250,100,20);
        res.setForeground(Color.BLUE);
        frame.add(res);

        //perform action listener for button1 to perform adding operation
        btn.addActionListener(new ActionListener() 
        {
            public void  actionPerformed(ActionEvent ae) 
            {
                String option= (String)comboBox.getSelectedItem();
                String s=t1.getText();
                try 
                {
                    double temperature=Double.parseDouble(s);
                    double result=0;
                    switch(option) 
                    {
                        case "CelsiusToFahrenheit":
                            result=(temperature * 9/5)+32;
                            break;
                        case "CelsiusToKelvin":
                            result=temperature+273.15;
                            break;
                        case "FahrenheitToCelsius":
                            result=(temperature-32)*5/9;
                            break;
                        case "FahrenheitToKelvin":
                            result=(temperature-32)*5/9+273.15;
                            break;
                        case "KelvinToCelsius":
                            result=(temperature-273.15);
                            break;
                        case "KelvinToFahrenheit":
                            result=(temperature-273.15) * 9/5 +32;
                            break;                    
                    }
                    res.setText("Result:"+result);
                }
                catch(NumberFormatException ex) 
                {
                    res.setText("Invalid input: enter another number");
                }
            }
        }); 
    } 
}