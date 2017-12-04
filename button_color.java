package exercise.exercise4.unusual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class button_color {
    private Frame f = new Frame("按钮变色测试");
    Button red = new Button("set red");
    Button green = new Button("set green");
    Button blue = new Button("set blue");
    public void init()
    {
        red.setFont(new Font("宋体",Font.PLAIN,28));
        green.setFont(new Font("黑体",Font.PLAIN,28));
        blue.setFont(new Font("楷体",Font.PLAIN,28));

        red.addActionListener(e -> {
            red.setBackground(Color.red);
            green.setBackground(Color.red);
            blue.setBackground(Color.red);
        });
        green.addActionListener(e -> {
            green.setBackground(Color.green);
            blue.setBackground(Color.green);
        });
        blue.addActionListener(e -> {
            red.setBackground(Color.blue);
            green.setBackground(Color.blue);
            blue.setBackground(Color.blue);
        });

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        f.setLayout(new BoxLayout(f,BoxLayout.Y_AXIS));
        f.add(red,BorderLayout.NORTH);
        f.add(green,BorderLayout.CENTER);
        f.add(blue,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new button_color().init();
    }
}
