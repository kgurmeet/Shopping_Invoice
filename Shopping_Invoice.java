import java.awt.*;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shopping_Invoice implements ActionListener {
    JFrame f;
    JLabel l, l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField t1, t2;
    JComboBox cb1, cb2;
    JRadioButton r1, r2;
    ButtonGroup bg;
    JCheckBox c1;
    Container c;
    JButton b1;
    Font f1, f2, f3;
    

    Shopping_Invoice() {
        String Product[] = { "T-shirt", "Jeans", "Huddy", "Bell-bottom", "Jacket", "Kurti", "Shirt", "Trouser", "Top" };
        String[] discount = { "0", "10", "20", "30", "40" };
        f = new JFrame("SHOPPING CALCULATOR");
        c = f.getContentPane();
        c.setBackground(Color.GRAY);
        f.setLayout(null);
        f.setSize(1500, 1500);
        f.setVisible(true);
        f1 = new Font("Arial", Font.PLAIN, 26);
        f2 = new Font("Arial", Font.PLAIN, 21);
        f3 = new Font("Arial", Font.PLAIN, 21);
        l = new JLabel("GURMEET KAUR             ATTENDED  AT  R.D.  ENGINEERING  COLLEGE           3rd YEAR");
        l.setBounds(250, -10, 1500, 100);
        l1 = new JLabel("Enter Coustmer Name :");
        l1.setBounds(270, 100, 300, 50);
        t1 = new JTextField();
        t1.setBounds(600, 100, 250, 40);
        l2 = new JLabel("Select your product :");
        l2.setBounds(270, 150, 300, 50);

        cb1 = new JComboBox<String>(Product);
        cb1.setBounds(600, 150, 300, 40);
        l3 = new JLabel("Enter MRP :");
        l3.setBounds(270, 200, 300, 50);
        t2 = new JTextField("0");
        t2.setBounds(600, 200, 250, 40);
        l4 = new JLabel("Select Discount :");
        l4.setBounds(270, 250, 300, 50);

        cb2 = new JComboBox<String>(discount);
        cb2.setBounds(600, 250, 250, 40);
        l5 = new JLabel("Gender :");
        l5.setBounds(270, 300, 300, 50);
        r1 = new JRadioButton("Male", true);
        r1.setBounds(300, 350, 250, 40);
        r2 = new JRadioButton("Female(2% extra discount)");
        r2.setBounds(300, 400, 250, 40);
        bg = new ButtonGroup();
        c1 = new JCheckBox("Special customer (5% extra discount)");
        c1.setBounds(270, 450, 400, 40);
        b1 = new JButton("Calculate");
        b1.setBounds(500, 550, 200, 40);
        l6 = new JLabel("Payable Amount :");
        l6.setBounds(490, 600, 250, 40);
        l7 = new JLabel();
        l7.setBounds(520, 650, 250, 40);
        ImageIcon icon = new ImageIcon("shopping mall1.JPG");
        l8 = new JLabel(icon);

        JLabel  = new JLabel(icon);

        l8.setBounds(1180, 100, 300, 400);
        c.add(l);
        c.add(l1);
        c.add(t1);
        l.setFont(f1);
        c.add(t2);
        c.add(l2);
        c.add(cb1);
        c.add(l3);
        c.add(l4);
        c.add(cb2);
        c.add(l5);
        bg.add(r1);
        c.add(r1);
        bg.add(r2);
        c.add(l6);
        c.add(r2);
        c.add(c1);
        c.add(b1);
        c.add(l7);
        c.add(l8);
        l1.setFont(f2);
        l2.setFont(f2);
        l3.setFont(f2);
        l4.setFont(f2);
        l5.setFont(f2);
        c1.setFont(f2);
        l6.setFont(f3);
        l7.setFont(f3);

        b1.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
         Shopping_Invoice();
    }

    public void actionPerformed(ActionEvent e) {
        int dis = 0;

        int mrp = Integer.parseInt(t2.getText());
        String text = (String) cb2.getSelectedItem();
        System.out.println(text);
        dis = Integer.parseInt(text);
        if (r2.isSelected())
            dis = dis + 2;
        if (c1.isSelected())
            dis = dis + 5;
        double pay = mrp - (mrp * dis / 100);
        l6.setText("Amount to be pay" + pay);
        l7.setText("Thank U : " + t1.getText());
    }
}
