package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import static java.awt.Color.*;

 class gui extends JFrame {

     JPanel p = new JPanel();
     JButton abrt = new JButton("ABORT");
     JComboBox tx = new JComboBox();

    public gui(){
        tx.addItem("15 min");tx.addItem("30 min");
        tx.addItem("1 hr");tx.addItem("2 hr");

        add(p);
        p.add(tx);
        abrt.setBackground(red); abrt.setForeground(white);
        p.add(abrt);

        gui.abort listener2 = new gui.abort();
        abrt.addActionListener(listener2);

       gui.check listener3 = new gui.check();
        tx.addItemListener(listener3);
    }

    class check implements ItemListener{
        public void itemStateChanged(ItemEvent arg0){
            try {
                String s = tx.getSelectedItem().toString();
                String min_15 = "15 min";String min_30 = "30 min";
                String hr_1 = "1 hr";String hr_2 = "2 hr";
                if(s.equals(min_15)){
                    String cmd = "shutdown /s /t 900";
                    Runtime.getRuntime().exec(cmd);
                }
                if(s.equals(min_30)){
                    String cmd = "shutdown /s /t 1800";
                    Runtime.getRuntime().exec(cmd);
                }
                if(s.equals(hr_1)){
                    String cmd = "shutdown /s /t 3600";
                    Runtime.getRuntime().exec(cmd);
                }
                if(s.equals(hr_2)){
                    String cmd = "shutdown /s /t 7200";
                    Runtime.getRuntime().exec(cmd);
                }
            }catch (Exception f){}
        }
    }

    class abort implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try{

                if (e.getSource() == abrt){
                    String cmd = "shutdown /a ";
                    Runtime.getRuntime().exec(cmd);
                }
            }catch(Exception f){}
        }
    }
}
