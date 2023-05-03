package Graphic;

import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame{
    public MainForm(){
        super("Контактная информация");
        super.setBounds(700, 500, 250, 100);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));

        JLabel name = new JLabel("Введите имя: ");
        JTextField name_field = new JTextField("", 1);
        JLabel email = new JLabel("Введите имя: ");
        JTextField email_field = new JTextField("@", 1);

        container.add(name);
        container.add(name_field);
        container.add(email);
        container.add(email_field);
    }
}
