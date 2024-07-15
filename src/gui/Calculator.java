package gui;

import java.awt.*;
import java.awt.event.*;

class Close extends WindowAdapter {

    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener {

    TextField tf;
    Button b01, b02, b03, b04, b05, b06, b07, b08, b09, b10,
            b11, b12, b13, b14, b15, b16, b17, b18, b19, b20,
            b21, b22, b23, b24, b25, b26, b27, b28, b29, b30;
    String fv, sv, op;
    Double fdv, sdv, tot, memory;

    Cal() {
        Frame f = new Frame();
        f.addWindowListener(new Close());
        f.setBackground(Color.gray);
        f.setTitle("Calculator");
        f.setResizable(false);
        f.setSize(310, 450);
        f.setLocationRelativeTo(null);

        Font f1 = new Font("Bahnschrift", Font.BOLD, 30);
        Font f2 = new Font("Cambria", Font.BOLD, 20);
        Font f3 = new Font("Cambria", Font.BOLD, 40);
        Font f4 = new Font("Cambria", Font.PLAIN, 14);

        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("View");
        MenuItem mi0 = new MenuItem("Standard");
        m1.add(mi0);

        Menu m2 = new Menu("Edit");
        MenuItem mi1 = new MenuItem("Copy");
        MenuItem mi2 = new MenuItem("Cut");
        MenuItem mi3 = new MenuItem("Paste");
        m2.add(mi1);
        m2.add(mi2);
        m2.add(mi3);

        Menu m3 = new Menu("Help");
        MenuItem mi4 = new MenuItem("View Help F1");
        MenuItem mi5 = new MenuItem("About Calculator");
        m3.add(mi4);
        m3.add(mi5);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        f.setMenuBar(mb);

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        GridLayout g1 = new GridLayout(6, 5, 4, 4); //(rows, cols, hgap, vgap)
        p2.setLayout(g1);
        p2.setBackground(Color.black);

        tf = new TextField(12);
        tf.setFont(f3);
        tf.setEditable(true);
        tf.setForeground(Color.black);
        tf.setBackground(Color.white);
        tf.setText("0");

        p1.add(tf);

        b01 = new Button("MC");
        b02 = new Button("MR");
        b03 = new Button("MS");
        b04 = new Button("M+");
        b05 = new Button("M-");

        b06 = new Button("BACK");
        b07 = new Button("CE");
        b08 = new Button("C");
        b09 = new Button("+/-");
        b10 = new Button("SQRT");

        b11 = new Button("7");
        b12 = new Button("8");
        b13 = new Button("9");
        b14 = new Button("/");
        b15 = new Button("%");

        b16 = new Button("4");
        b17 = new Button("5");
        b18 = new Button("6");
        b19 = new Button("x");
        b20 = new Button("1/X");

        b21 = new Button("1");
        b22 = new Button("2");
        b23 = new Button("3");
        b24 = new Button("-");
        b25 = new Button("=");

        b26 = new Button("0");
        b27 = new Button("");
        b28 = new Button(".");
        b29 = new Button("+");
        b30 = new Button("");

        b29.setFont(f2);
        b24.setFont(f2);
        b25.setFont(f2);
        b19.setFont(f2);
        b28.setFont(f2);
        b14.setFont(f2);
        b15.setFont(f2);
        b30.setFont(f1);
        b09.setFont(f4);
        b10.setFont(f4);
        b20.setFont(f4);
        b06.setBackground(Color.orange);
        b07.setBackground(Color.orange);
        b08.setBackground(Color.orange);
        b25.setBackground(Color.orange);
        b29.setBackground(Color.orange);
        b24.setBackground(Color.orange);
        b19.setBackground(Color.orange);
        b20.setBackground(Color.orange);
        b14.setBackground(Color.orange);
        b15.setBackground(Color.orange);
        b10.setBackground(Color.orange);
        b09.setBackground(Color.orange);
        b27.setBackground(Color.gray);
        b30.setBackground(Color.gray);

        p2.add(b01);
        p2.add(b02);
        p2.add(b03);
        p2.add(b04);
        p2.add(b05);
        p2.add(b06);
        p2.add(b07);
        p2.add(b08);
        p2.add(b09);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        p2.add(b21);
        p2.add(b22);
        p2.add(b23);
        p2.add(b24);
        p2.add(b25);
        p2.add(b26);
        p2.add(b27);
        p2.add(b28);
        p2.add(b29);
        p2.add(b30);

        b01.addActionListener(this);
        b02.addActionListener(this);
        b03.addActionListener(this);
        b04.addActionListener(this);
        b05.addActionListener(this);
        b06.addActionListener(this);
        b07.addActionListener(this);
        b08.addActionListener(this);
        b09.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent d) {

        if (tf.getText().equals("0")) {
            tf.setText("");
        }
        Object o = d.getSource();

        if (o.equals(b01)) { // MC
            memory = 0.0;
        } else if (o.equals(b02)) { // MR
            tf.setText(memory.toString());
        } else if (o.equals(b03)) { // MS
            memory = Double.parseDouble(tf.getText());
        } else if (o.equals(b04)) { // M+
            memory += Double.parseDouble(tf.getText());
        } else if (o.equals(b05)) { // M-
            memory -= Double.parseDouble(tf.getText());
        } else if (o.equals(b06)) { // Backspace
            String text = tf.getText();
            if (text.length() > 0) {
                tf.setText(text.substring(0, text.length() - 1));
            }
        } else if (o.equals(b07)) { // CE
            tf.setText("");
        } else if (o.equals(b08)) { // C
            tf.setText("0");
            fv = sv = op = null;
        } else if (o.equals(b09)) { // +/-
            tf.setText(String.valueOf(-Double.parseDouble(tf.getText())));
        } else if (o.equals(b10)) { // SQRT
            fv = tf.getText();
            tot = Math.sqrt(Double.parseDouble(fv));
            tf.setText(tot + "");
        } else if (o.equals(b11)) {
            tf.setText(tf.getText() + b11.getLabel());
        } else if (o.equals(b12)) {
            tf.setText(tf.getText() + b12.getLabel());
        } else if (o.equals(b13)) {
            tf.setText(tf.getText() + b13.getLabel());
        } else if (o.equals(b14)) { // /
            fv = tf.getText();
            op = b14.getLabel();
            tf.setText("");
        } else if (o.equals(b15)) { // %
            fv = tf.getText();
            tot = Double.parseDouble(fv) / 100;
            tf.setText(tot + "");
        } else if (o.equals(b16)) {
            tf.setText(tf.getText() + b16.getLabel());
        } else if (o.equals(b17)) {
            tf.setText(tf.getText() + b17.getLabel());
        } else if (o.equals(b18)) {
            tf.setText(tf.getText() + b18.getLabel());
        } else if (o.equals(b19)) { // *
            fv = tf.getText();
            op = "x";
            tf.setText("");
        } else if (o.equals(b20)) { // 1/X
            fv = tf.getText();
            tot = 1 / Double.parseDouble(fv);
            tf.setText(tot + "");
        } else if (o.equals(b21)) {
            tf.setText(tf.getText() + b21.getLabel());
        } else if (o.equals(b22)) {
            tf.setText(tf.getText() + b22.getLabel());
        } else if (o.equals(b23)) {
            tf.setText(tf.getText() + b23.getLabel());
        } else if (o.equals(b24)) { // -
            fv = tf.getText();
            op = b24.getLabel();
            tf.setText("");
        } else if (o.equals(b25)) { // =
            sv = tf.getText();
            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);
            tf.setText("");

            if (op.equals("+")) {
                tot = fdv + sdv;
                tf.setText(tot + "");
            } else if (op.equals("-")) {
                tot = fdv - sdv;
                tf.setText(tot + "");
            } else if (op.equals("x")) {
                tot = fdv * sdv;
                tf.setText(tot + "");
            } else if (op.equals("/")) {
                tot = fdv / sdv;
                tf.setText(tot + "");
            }
        } else if (o.equals(b26)) {
            tf.setText(tf.getText() + b26.getLabel());
        } else if (o.equals(b28)) {
            if (!tf.getText().contains(".")) {
                tf.setText(tf.getText() + ".");
            }
        } else if (o.equals(b29)) { // +
            fv = tf.getText();
            op = b29.getLabel();
            tf.setText("");
        }
    }
}

public class Calculator {

    public static void main(String[] args) {
        new Cal();
    }
}
