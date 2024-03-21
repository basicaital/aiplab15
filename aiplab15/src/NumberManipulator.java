package aiplab15.src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NumberManipulator extends Frame implements ActionListener {
    private int num = 0;
    private final Label numberLabel;

    public NumberManipulator(){
        setTitle("Counter");
        setSize(300,150);
        setLayout(new FlowLayout());
        setVisible(true);

        numberLabel = new Label("Number: " +num);
        add(numberLabel);

        Button plusOne = new Button("+1");
        plusOne.addActionListener(this);
        add(plusOne);

        Button minusOne = new Button("-1");
        minusOne.addActionListener(this);
        add(minusOne);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event){
                System.exit(0);
            }});
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if
        (e.getActionCommand().equals("+1")){
            if(num<3){
                num++;
                updateNumberLabel();
            }
        }
        else if (e.getActionCommand().equals("-1")){
            if (num>-5){
                num--;
                updateNumberLabel();
            }
        }
    }
    private void updateNumberLabel(){
        numberLabel.setText("Number: "+num);
    }
}
