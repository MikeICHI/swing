package TableExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

public class Jtable {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Таблица");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        BookTableModel btm = new BookTableModel();


        JTable bookTable = new JTable(btm);
        JScrollPane bookTableScrollPage = new JScrollPane(bookTable);
bookTableScrollPage.setPreferredSize(new Dimension(600,400));//размеры задает

        JPanel panel1 = new JPanel(new GridBagLayout());
        JPanel panel2 = new JPanel(new GridBagLayout());


        JLabel title = new JLabel("Название:");
        JLabel author = new JLabel("Автор:");
        JLabel year = new JLabel("Год:");
        JLabel isbn = new JLabel("ISBN:");

        JButton addButton = new JButton("Добавить");
        JButton deleteButton = new JButton("Удалить");
        JButton findButton = new JButton("Найти");
        JButton clearButton = new JButton("Очистить");

        JTextField titleTextField = new JTextField(15);
        JTextField authorText = new JTextField(15);
        JTextField yearText = new JTextField(15);
        JTextField isbnText = new JTextField(15);

        //реализация add
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!titleTextField.getText().isEmpty() && !authorText.getText().isEmpty() && !yearText.getText().isEmpty()){
                    btm.addData(new String[]{titleTextField.getText(),"123",authorText.getText(), yearText.getText()});

                } else
                    showMessageDialog(null, "Не введены данные");
            }


        });






        String []str = new String[5];
        str[0] = "название книги";
        str[1] = "ISBN";
        str[2] = "Автор";
        str[3] = "Год публикации";

        btm.addData(str);

        //label
        frame.add(title, new GridBagConstraints(0, 0, 1,
                1, 0, 0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(author, new GridBagConstraints(0, 1, 1,
                1, 0, 0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(year, new GridBagConstraints(0, 2, 1,
                1, 0, 0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(isbn, new GridBagConstraints(0, 3, 1,
                1, 0, 0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));


        //Text
        frame.add(titleTextField, new GridBagConstraints(1, 0, 1,
                1, 0, 0, GridBagConstraints.NORTH,
                GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(authorText, new GridBagConstraints(1, 1, 1,
                1, 0, 0, GridBagConstraints.NORTH,
                GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(yearText, new GridBagConstraints(1, 2, 1,
                1, 0, 0, GridBagConstraints.NORTH,
                GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(isbnText, new GridBagConstraints(1, 3, 1,
                1, 0, 0, GridBagConstraints.NORTH,
                GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        //Table
        frame.add(bookTableScrollPage, new GridBagConstraints(0, 100, 1,
                1, 1, 1, GridBagConstraints.LINE_START,
                GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 1, 1));


        //Buttons
        frame.add(addButton, new GridBagConstraints(2, 0, 1,
                1, 0, 0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(deleteButton, new GridBagConstraints(2, 1, 1,
                1, 0, 0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(findButton, new GridBagConstraints(2, 2, 1,
                1, 0, 0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(clearButton, new GridBagConstraints(2, 3, 1,
                1, 0, 0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));



//frame.add(panel1,BorderLayout.NORTH);
//frame.add(panel2,BorderLayout.SOUTH);


        frame.pack();
        frame.setVisible(true);




    }


}
