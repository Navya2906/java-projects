import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SimpleCalculator {
    public static void main(String[] args) {
        //Creation of JFrame window
        JFrame frame=new JFrame("Calculator");
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        //Creating a text data into the JFrame using JLabel
        JLabel l1=new JLabel("Enter number1:");
        l1.setBounds(100,100,100,20);
        frame.add(l1);

        //creating a textField
        JTextField t1=new JTextField(10);
        t1.setBounds(200,100,100,20);
        frame.add(t1);

        //Creating another text data into the JFrame using JLabel
        JLabel l2=new JLabel("Enter number2:");
        l2.setBounds(100,150,100,20);
        frame.add(l2);

        //creating another textField
        JTextField t2=new JTextField(10);
        t2.setBounds(200,150,100,20);
        frame.add(t2);

        //creating a button for adding
        JButton btn1=new JButton("Add");
        btn1.setBounds(100, 200, 100, 20);
        frame.add(btn1);

        //creating a button for Subtracting
        JButton btn2=new JButton("Sub");
        btn2.setBounds(200,200,100,20);
        frame.add(btn2);

        //creating a button for multiplication
        JButton btn3=new JButton("Multiply");
        btn3.setBounds(100,250,100,20);
        frame.add(btn3); 

        //creating a button for Division
        JButton btn4=new JButton("Divide");
        btn4.setBounds(200,250,100,20);
        frame.add(btn4); 

        //we have to add result
        JLabel res=new JLabel("            ");
        res.setBounds(200, 300, 150, 20);
        res.setForeground(Color.BLUE);
        res.setFont(new Font("Arial",Font.BOLD,25));
        frame.add(res);
        
        //perform action listener for button1 to perform adding operation
        btn1.addActionListener(new ActionListener() {
            public void  actionPerformed(ActionEvent ae) {
                int n1=Integer.parseInt(t1.getText());
                int n2=Integer.parseInt(t2.getText());
                int sum=n1+n2;
                res.setText("sum: "+sum);
            }
        }); 

        //perform actionListener for button2 to perform subtracting operation
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int n3=Integer.parseInt(t1.getText());
                int n4=Integer.parseInt(t2.getText());
                int sub=n3-n4;
                res.setText("sub: "+sub);
            }
        });

        //perform action listener for button3 to perform multiplication operation
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int n5=Integer.parseInt(t1.getText());
                int n6=Integer.parseInt(t2.getText());
                int Multiply=n5*n6;
                res.setText("Multiply: "+Multiply);
            }
        });

        //perform action listener for button3 to perform Division operation
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int n7=Integer.parseInt(t1.getText());
                int n8=Integer.parseInt(t2.getText());
                int divide=n7/n8;
                res.setText("Division: "+divide);
            }
        });
    }
}