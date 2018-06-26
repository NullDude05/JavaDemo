import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JPanel implements ActionListener{

    private JFrame frame;
    private JTextField txtfield, txtfield2;
    private JButton addbutton, multbutton, divbutton, subbutton;
    private JPanel panel;
    private String num1, num2;
    private JLabel result;

    public void gui(){

        frame = new JFrame("Calculator");
        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        txtfield = new JTextField("First Number",20);
        txtfield2 = new JTextField("Second Number", 20);
        addbutton = new JButton("+");
        subbutton = new JButton("-");
        multbutton = new JButton("*");
        divbutton = new JButton("/");
        result = new JLabel();

        addbutton.addActionListener(this);
        subbutton.addActionListener(this);
        multbutton.addActionListener(this);
        divbutton.addActionListener(this);

        panel.add(txtfield);
        panel.add(txtfield2);
        panel.add(addbutton);
        panel.add(subbutton);
        panel.add(multbutton);
        panel.add(divbutton);
        panel.add(result);
        frame.setContentPane(panel);

    }

    public String GrabText(JTextField text){
        return text.getText();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == addbutton) {
            num1 = GrabText(txtfield);
            num2 = GrabText(txtfield2);

            float answer = Float.parseFloat(num1) + Float.parseFloat(num2);
            result.setText("" + Float.toString(answer));
        }
        if(e.getSource() == subbutton) {
            num1 = GrabText(txtfield);
            num2 = GrabText(txtfield2);

            float answer = Float.parseFloat(num1) - Float.parseFloat(num2);
            result.setText("" + Float.toString(answer));
        }
        if(e.getSource() == multbutton) {
            num1 = GrabText(txtfield);
            num2 = GrabText(txtfield2);

            float answer = Float.parseFloat(num1) * Float.parseFloat(num2);
            result.setText("" + Float.toString(answer));
        }
        if(e.getSource() == divbutton) {
            num1 = GrabText(txtfield);
            num2 = GrabText(txtfield2);

            float answer = Float.parseFloat(num1) / Float.parseFloat(num2);
            result.setText("" + Float.toString(answer));
        }

    }
}
