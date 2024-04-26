package various;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class griiidBagLayout {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Авторизация в системе");

        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new GridBagLayout());

        JLabel loginLabel = new JLabel("login:");
        JLabel passwordLabel = new JLabel("password:");

        JButton loginButton = new JButton("login in");
        JButton registrationButton = new JButton("registration");

        JTextField loginTextField = new JTextField(15);
        JPasswordField passwordText = new JPasswordField(15);

        final JRadioButton radio = new JRadioButton("это да");
        JCheckBox box = new JCheckBox("Флажок");
        loginButton.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent event) {
                                              String str1 = loginTextField.getText();
                                              String str2 = passwordText.getText();
                                              loginTextField.setText(str2);
                                              passwordText.setText(str1);

                                              if (box.isSelected()) {
                                                  String nameOfButton = (((JButton) event.getSource()).getText());
                                                  System.out.println("Флажок задействован + nameOfButton = " + nameOfButton);
                                              } else {
                                                  System.out.println("флажок пустой(((");
                                              }
                                          }
                                      }
        );


//        GridBagConstraints c = new GridBagConstraints();
//        c.gridx = 0;
//        c.gridy = 0;
//        c.gridwidth = 1;
//        c.gridheight = 1;
//        c.weightx = 0.0;
//        c.weighty = 0.9;
//        c.anchor = GridBagConstraints.NORTH;
//        c.fill = GridBagConstraints.HORIZONTAL;
//        //Insets insets = new Insets(2,3,4,5);//отступы от верха, левой, правой, и низа компонента
//        c.insets = new Insets(100, 0, 4, 5);
//        c.ipadx = 0;
//        c.ipady = 0;

        //или записывается так по порядку как сверху:


        //login
        frame.add(loginLabel, new GridBagConstraints(0, 0, 1, 1,
                1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(loginTextField, new GridBagConstraints(1, 0, 1, 1,
                1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(loginButton, new GridBagConstraints(0, 2, 2, 1,
                1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));


        //password

        frame.add(passwordLabel, new GridBagConstraints(0, 1, 1, 1,
                1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(passwordText, new GridBagConstraints(1, 1, 1, 1,
                1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));


        //registration

        frame.add(registrationButton, new GridBagConstraints(2, 2, 1, 1,
                1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));


        //radioB
        frame.add(radio, new GridBagConstraints(2, 0, 1, 1,
                1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));
//флажок
        frame.add(box, new GridBagConstraints(2, 1, 1, 1,
                1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));


        frame.setVisible(true);
        frame.pack();


    }


}
