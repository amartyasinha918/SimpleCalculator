import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAdd, bSub, bDiv, bMul, bEqual, bClr;
    JTextField display;
    JPanel pnl;
    int result, check;
    String s1, s2, s3, s4, s5;

    Calculator() {
        frame = new JFrame("Calculator");
        frame.setLayout(new FlowLayout());

        pnl = new JPanel();

        b0 = new JButton("0");
        b0.addActionListener(this);

        b1 = new JButton("1");
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.addActionListener(this);

        b4 = new JButton("4");
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.addActionListener(this);

        b7 = new JButton("7");
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.addActionListener(this);

        bAdd = new JButton("+");
        bAdd.addActionListener(this);

        bSub = new JButton("-");
        bSub.addActionListener(this);

        bDiv = new JButton("/");
        bDiv.addActionListener(this);

        bMul = new JButton("*");
        bMul.addActionListener(this);

        bEqual = new JButton("=");
        bEqual.addActionListener(this);

        bClr = new JButton("CLR");
        bClr.addActionListener(this);

        display = new JTextField(20);
        frame.add(display);

        pnl.setLayout(new GridLayout(4, 4));

        pnl.add(b7);
        pnl.add(b8);
        pnl.add(b9);
        pnl.add(bAdd);
        pnl.add(b4);
        pnl.add(b5);
        pnl.add(b6);
        pnl.add(bSub);
        pnl.add(b1);
        pnl.add(b2);
        pnl.add(b3);
        pnl.add(bMul);
        pnl.add(bClr);
        pnl.add(b0);
        pnl.add(bEqual);
        pnl.add(bDiv);

        frame.add(pnl);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            s1 = display.getText();
            s2 = "0";
            s3 = s1 + s2;
            display.setText(s3);
        } if (e.getSource() == b1) {
            s1 = display.getText();
            s2 = "01";
            s3 = s1 + s2;
            display.setText(s3);
        } if (e.getSource() == b2) {
            s1 = display.getText();
            s2 = "2";
            s3 = s1 + s2;
            display.setText(s3);
        } if (e.getSource() == b3) {
            s1 = display.getText();
            s2 = "3";
            s3 = s1 + s2;
            display.setText(s3);
        } if (e.getSource() == b4) {
            s1 = display.getText();
            s2 = "4";
            s3 = s1 + s2;
            display.setText(s3);
        } if (e.getSource() == b5) {
            s1 = display.getText();
            s2 = "5";
            s3 = s1 + s2;
            display.setText(s3);
        } if (e.getSource() == b5) {
            s1 = display.getText();
            s2 = "5";
            s3 = s1 + s2;
            display.setText(s3);
        } if (e.getSource() == b6) {
            s1 = display.getText();
            s2 = "6";
            s3 = s1 + s2;
            display.setText(s3);
        } if (e.getSource() == b7) {
            s1 = display.getText();
            s2 = "7";
            s3 = s1 + s2;
            display.setText(s3);
        } if (e.getSource() == b8) {
            s1 = display.getText();
            s2 = "8";
            s3 = s1 + s2;
            display.setText(s3);
        } if (e.getSource() == b9) {
            s1 = display.getText();
            s2 = "9";
            s3 = s1 + s2;
            display.setText(s3);
        } if (e.getSource() == bAdd) {
            s4 = display.getText();
            display.setText("");
            check = 1;
        } if (e.getSource() == bSub) {
            s4 = display.getText();
            display.setText("");
            check = 2;
        } if (e.getSource() == bMul) {
            s4 = display.getText();
            display.setText("");
            check = 3;
        } if (e.getSource() == bDiv) {
            s4 = display.getText();
            display.setText("");
            check = 4;
        } if (e.getSource() == bEqual) {
            s5 = display.getText();
            if (check == 1) {
                result = Integer.parseInt(s4) + Integer.parseInt(s5);
                display.setText(String.valueOf(result));
            } if (check == 2) {
                result = Integer.parseInt(s4) - Integer.parseInt(s5);
                display.setText(String.valueOf(result));
            } if (check == 3) {
                result = Integer.parseInt(s4) * Integer.parseInt(s5);
                display.setText(String.valueOf(result));
            } if (check == 4) {
                result = Integer.parseInt(s4) / Integer.parseInt(s5);
                display.setText(String.valueOf(result));
            }
        } if (e.getSource() == bClr)
            display.setText("");
    }

    public static void main(String[] args) { new Calculator(); }
}
