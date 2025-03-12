package seven.observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObserverDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Observer Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton newspaperButton = new JButton("Newspaper Publishing");

        Pretplatnik pretplatnik = new Pretplatnik();
        MrzovoljniPretplatnij mrzovoljniPretplatnij = new MrzovoljniPretplatnij();
        OpasniPretplatnik opasniPretplatnik = new OpasniPretplatnik();

        newspaperButton.addActionListener(pretplatnik);
        newspaperButton.addActionListener(mrzovoljniPretplatnij);
        newspaperButton.addActionListener(opasniPretplatnik);

        panel.add(newspaperButton);

        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
    private static class Pretplatnik implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Primio sam novine i baš mi je drago što sam pretplatnik");
        }
    }
    private static class MrzovoljniPretplatnij implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Mrzovoljni pretplatnik je primio novine i nije mu drago");
        }
    }
    private static class OpasniPretplatnik implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("AAAAAAAAAAAAAAAAAA");
        }
    }
}
