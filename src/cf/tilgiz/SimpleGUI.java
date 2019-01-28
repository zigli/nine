package cf.tilgiz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("",5);
    private JLabel label = new JLabel("Input:");
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Select that");
    private JCheckBox check = new JCheckBox("Check", false);

    public SimpleGUI(){
        super("Simple Example");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container mycontainer = this.getContentPane();
        mycontainer.setLayout(new GridLayout(3,2,2,2));
        mycontainer.add(label);
        mycontainer.add(input);

        ButtonGroup radiogroup = new ButtonGroup();
        radiogroup.add(radio1);
        radiogroup.add(radio2);

        mycontainer.add(radio1);
        radio1.setSelected(true);
        mycontainer.add(radio2);
        mycontainer.add(check);

        button.addActionListener(new ButtonEventListener ());
        mycontainer.add(button);

    }
    class ButtonEventListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String message = "";
            message += "Button was pressed\n";
            message += "Text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " is selected!\n";
            message += "Checkbox is" + (check.isSelected() ? "checked " : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
