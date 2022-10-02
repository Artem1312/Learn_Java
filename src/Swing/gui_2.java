package Swing;

import javax.swing.*;
import java.awt.*;

class gui_2 {
    public static void main(String args[]) {

        // Создание каркаса
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);

        // Создание панели меню и добавление компонентов
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Settings");
        JMenu m3 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        JMenuItem m11 = new JMenuItem("Открыть");
        JMenuItem m22 = new JMenuItem("Сохранить как");
        JMenuItem m33 = new JMenuItem("About us");
        m1.add(m11);
        m1.add(m22);
        m3.add(m33);

        // Создание панели внизу и добавление компонентов
        JPanel panel = new JPanel(); // панель не видна при выводе
        JLabel label = new JLabel("Введите текст");
        JTextField tf = new JTextField(10); // принимает до 10 символов
        JButton send = new JButton("Отправить");
        JButton reset = new JButton("Сброс");
        panel.add(label); // Компоненты, добавленные с помощью макета Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Текстовая область по центру
        JTextArea ta = new JTextArea();

        // Добавление компонентов в рамку.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}