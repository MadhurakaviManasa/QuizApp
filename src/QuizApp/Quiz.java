package QuizApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Quiz extends JFrame implements ActionListener
{
    JLabel label, error;
    JRadioButton option[] = new JRadioButton[4];
    ButtonGroup bg;
    JButton button1, button2;
    private int count, current = 0;

    Quiz(){

        // Creating a label to hold the question
        label = new JLabel("Que1: Which among these is not a data type?");
        label.setBounds(50,50,600,30);
        add(label);

        // Creating radio buttons for options
        bg = new ButtonGroup();
        for(int i = 0; i < 4; i++){
            option[i] = new JRadioButton();
            add(option[i]);
            bg.add(option[i]);
        }

        option[0].setText("int"); option[0].setBounds(50,100,300,30);
        option[1].setText("Float"); option[1].setBounds(50,130,300,30);
        option[2].setText("boolean"); option[2].setBounds(50,160,300,30);
        option[3].setText("char"); option[3].setBounds(50,190,300,30);

        // Creating a button to continue to the next question
        button1 = new JButton("Next");
        button1.setBounds(50,250, 100,30);
        add(button1);

       // Creating a button to find the result
        button2 = new JButton("Result");
        button2.setBounds(200,250, 100,30);
        add(button2);
        button2.setEnabled(false);

        button1.addActionListener(this);
        button2.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,350);
    }

    public void actionPerformed(ActionEvent e){
            current++;
            if (current == 1) {
                if (option[1].isSelected()) count++;
                bg.clearSelection();
                label.setText("Que2: Which class is available to all the class automatically?");
                option[0].setText("Swing"); option[1].setText("Applet"); option[2].setText("Object"); option[3].setText("ActionEvent");
            }
            if (current == 2) {
                if (option[2].isSelected()) count++;
                bg.clearSelection();
                label.setText("Que3: Which package is directly available to our class without importing it?");
                option[0].setText("swing"); option[1].setText("applet"); option[2].setText("net"); option[3].setText("lang");
            }
            if (current == 3) {
                if (option[3].isSelected()) count++;
                bg.clearSelection();
                label.setText("Que4: String class is defined in which package?");
                option[0].setText("lang"); option[1].setText("Swing"); option[2].setText("Applet"); option[3].setText("awt");
            }
            if (current == 4) {
                if (option[0].isSelected()) count++;
                bg.clearSelection();
                label.setText("Que5: Which of these apply to a String?");
                option[0].setText("Immutable"); option[1].setText("Mutable"); option[2].setText("Both a and b"); option[3].setText("None of the above");
            }
            if (current == 5) {
                if (option[0].isSelected()) count++;
                bg.clearSelection();
                label.setText("Que6: Which one among these is not a keyword");
                option[0].setText("class"); option[1].setText("int"); option[2].setText("get"); option[3].setText("if");
            }
            if (current == 6) {
                if (option[2].isSelected()) count++;
                bg.clearSelection();
                label.setText("Que7: Which one among these is not a class");
                option[0].setText("Swing"); option[1].setText("Actionperformed"); option[2].setText("ActionEvent"); option[3].setText("Button");
            }
            if (current == 7) {
                if (option[1].isSelected()) count++;
                bg.clearSelection();
                label.setText("Que8: which one among these is not a function of Object class");
                option[0].setText("toString"); option[1].setText("finalize"); option[2].setText("equals"); option[3].setText("getDocumentBase");
            }
            if (current == 8) {
                if (option[3].isSelected()) count++;
                bg.clearSelection();
                label.setText("Que9: which function is not present in Applet class");
                option[0].setText("init"); option[1].setText("main"); option[2].setText("start"); option[3].setText("destroy");
            }
            if (current == 9) {
                if (option[1].isSelected()) count++;
                bg.clearSelection();
                button1.setEnabled(false);
                button2.setEnabled(true);
                label.setText("Que10: Which one among these is not a valid component");
                option[0].setText("JButton"); option[1].setText("JList"); option[2].setText("JButtonGroup"); option[3].setText("JTextArea");
            }
            if (current == 10) {
                if (option[2].isSelected()) count++;
                setVisible(false);
                dispose();
                JOptionPane.showMessageDialog(this, "Result: " + count + "/" + 10);
            }
    }

    public static void main(String[] args) {
        new Quiz();
    }
}