package various;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("JFrameStart");

        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

       //frame.setLayout(new GridBagLayout());//разграничение кнопок

        JButton myButton = new JButton("первая кнопка");
        JButton myButton2 = new JButton("вторая кнопка");

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        myButton.setBackground(Color.CYAN);
        myButton.setCursor(cursor);
        myButton2.setForeground(Color.GREEN);
        myButton2.setCursor(cursor);

        JTextField textField = new JTextField(10);//ввод текста
        textField.setText("Low");
        textField.setEditable(false);

        JPasswordField passwordField = new JPasswordField(10);//точки пароль



        JLabel label = new JLabel(" Загрузка...");//метка
        label.setFont(new Font(null, Font.BOLD, 15));

        frame.setVisible(true);

////прогресс загрузки типа того
//        JProgressBar progressBar = new JProgressBar();
//        progressBar.setStringPainted(true);//выводит проценты
//        //progressBar.setIndeterminate(true);//меняет тип загрузки
//        progressBar.setMinimum(0);
//        progressBar.setMaximum(1000);
//        //progressBar.setValue(30);
//
//        frame.add(progressBar);
//        frame.add(label);
//        for (int i = progressBar.getMinimum(); i <= progressBar.getMaximum(); i++) {
//            Thread.sleep(1);
//            progressBar.setValue(i);
//        }
//label.setText(" Загружено!!!");



        //frame.add(passwordField);
        //frame.add(textField);
        //frame.add(myButton);
        //frame.add(myButton2);


        JButton button = new JButton("Кнопка:)");
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        panel.add(button);
        panel.add(panel2);
        panel2.add(myButton);

        panel.setBackground(Color.orange);
        panel2.setBackground(Color.yellow);
        //panel.setVisible(false);
        frame.add(panel);
        //frame.add(panel2);

        Component[] comp = panel.getComponents();

        for (int i = 0; i < comp.length; i++) {
            if(comp[i] instanceof JPanel) System.out.println("Panel");
            if(comp[i] instanceof JButton) System.out.println("Button");
        }

//        Thread.sleep(3000);
//        frame.setState(JFrame.ICONIFIED);//свернуть
//        Thread.sleep(3000);
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);//развернуть на макс размер
//        Thread.sleep(3000);
//        frame.setExtendedState(JFrame.NORMAL);//развернет в те размеры, которые указаны
    }
}