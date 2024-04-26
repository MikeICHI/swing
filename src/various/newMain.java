package various;

import javax.swing.*;
import java.awt.*;

public class newMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrameStart");

        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

         //frame.setLayout(new BorderLayout());//разметка границ
        frame.setLayout(new FlowLayout());//расположение на верху по середине в ряд

        JPanel panel1 = new JPanel(new GridLayout(2,3));
        JPanel panel2 = new JPanel(new BorderLayout());
        JPanel panel3 = new JPanel(new FlowLayout());
        JPanel panel4 = new JPanel(new FlowLayout());
        JPanel panel5 = new JPanel(new FlowLayout());
////Background of panels
//       panel1.setBackground(Color.orange);
//        panel2.setBackground(Color.yellow);
//        panel3.setBackground(Color.GREEN);
//        panel4.setBackground(Color.RED);
//        panel5.setBackground(Color.BLUE);


////BorderLayout for panels on frame
//        frame.add(panel1, BorderLayout.PAGE_START);
//        frame.add(panel2, BorderLayout.PAGE_END);
//        frame.add(panel3, BorderLayout.LINE_END);
//        frame.add(panel4, BorderLayout.LINE_START);
//        frame.add(panel5, BorderLayout.CENTER);
//
////buttons
        JButton button1 = new JButton("button1");
        JButton button2 = new JButton("button2");
        JButton button3 = new JButton("button3");
        JButton button4 = new JButton("button4");
        JButton button5 = new JButton("button5");
        JButton button6 = new JButton("button6");
        JButton button7 = new JButton("button7");
        JButton button8 = new JButton("button8");
        JButton button9 = new JButton("button9");
        JButton button10 = new JButton("button10");


        JTextField text = new JTextField(100);

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);
        panel1.add(button10);

        panel2.add(text, BorderLayout.CENTER);



        //panel1.setPreferredSize(new Dimension(600,100));


//        frame.add(panel1, BorderLayout.SOUTH);
//        frame.add(panel2, BorderLayout.SOUTH);

//        frame.add(button1);
//        frame.add(button2);
//        frame.add(button3);
//        frame.add(button4);
//        frame.add(button5);
//        frame.add(button6);
//        frame.add(button7);
//        frame.add(button8);
//        frame.add(button9);
//        frame.add(button10);


        frame.add(panel1, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.NORTH);


//        JButton[] buttons = new  JButton[10];
//
//        for (int i = 0; i < buttons.length; i++) {
//            buttons[i] = new JButton(String.valueOf(i));
//            frame.add(buttons[i]);
//        }

//        panel5.add(button, BorderLayout.CENTER);

        frame.setVisible(true);


    }
}
