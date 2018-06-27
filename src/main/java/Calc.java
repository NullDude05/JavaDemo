import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Calc extends JPanel implements ActionListener{

    private JFrame frame;
    private JTextField txtfield, txtfield2;
    private JButton addbutton, multbutton, divbutton, subbutton;
    private JPanel panel, panel2, panel3;
    private String num1, num2;
    private JLabel result;
    DecimalFormat df = new DecimalFormat("###.###");

    public void gui(){

        frame = new JFrame("Calculator");
        frame.pack();

        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel.setLayout(new BorderLayout());
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new BorderLayout());

        txtfield = new JTextField("",20);
        txtfield2 = new JTextField("", 20);
        addbutton = new JButton("+");
        subbutton = new JButton("-");
        multbutton = new JButton("*");
        divbutton = new JButton("/");
        result = new JLabel();

        addbutton.addActionListener(this);
        subbutton.addActionListener(this);
        multbutton.addActionListener(this);
        divbutton.addActionListener(this);

        Dimension size = new Dimension(50, 50);
        addbutton.setPreferredSize(size);
        subbutton.setPreferredSize(size);
        multbutton.setPreferredSize(size);
        divbutton.setPreferredSize(size);

        panel.add(txtfield, "North");
        panel.add(txtfield2, "South");
        panel2.add(addbutton);
        panel2.add(subbutton);
        panel2.add(multbutton);
        panel2.add(divbutton);
        result.setFont(new Font("Serif", Font.BOLD, 50));
        panel3.add(result, "West");

        frame.getContentPane().add(panel, "North");
        frame.getContentPane().add(panel2, "Center");
        frame.getContentPane().add(panel3, "South");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String GrabText(JTextField text){
        return text.getText();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == addbutton) {
            num1 = GrabText(txtfield);
            num2 = GrabText(txtfield2);

            double answer = Double.parseDouble(num1) + Double.parseDouble(num2);
            result.setText("" + Double.toString(Double.parseDouble(df.format(answer))));
        }
        if(e.getSource() == subbutton) {
            num1 = GrabText(txtfield);
            num2 = GrabText(txtfield2);

            double answer = Double.parseDouble(num1) - Double.parseDouble(num2);
            result.setText("" + Double.toString(Double.parseDouble(df.format(answer))));
        }
        if(e.getSource() == multbutton) {
            num1 = GrabText(txtfield);
            num2 = GrabText(txtfield2);

            double answer = Double.parseDouble(num1) * Double.parseDouble(num2);
            result.setText("" + Double.toString(Double.parseDouble(df.format(answer))));
        }
        if(e.getSource() == divbutton) {
            num1 = GrabText(txtfield);
            num2 = GrabText(txtfield2);

            double answer = Double.parseDouble(num1) / Double.parseDouble(num2);
            result.setText("" + Double.toString(Double.parseDouble(df.format(answer))));
        }

    }
}
