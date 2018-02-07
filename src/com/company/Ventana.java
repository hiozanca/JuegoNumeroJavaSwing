package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
        private JLabel etiqueta;
        private JTextField campo;
        private JButton jugar;
        private JDialog msn;
        private JLabel etiqueta2;

        public Ventana(){
            super("juegoDeNumeros");
            etiqueta = new JLabel("Dime un numero");
            campo = new JTextField(3);
            jugar = new JButton("jugar");


            msn = new JDialog(this);
            msn.setSize(200,200);


            FlowLayout f = new FlowLayout();
            etiqueta2 = new JLabel("");
            setLayout(f);
            add(etiqueta);
            add(campo);
            add(jugar);
            msn.add(etiqueta2);
            jugar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    jugar();
                }
            });
        }
        private void jugar(){
            String valor =campo.getText();
            int numero = Integer.parseInt(valor);
            numero++;
            etiqueta2.setText(numero + "   te gane");
            msn.setVisible(true);
        }

}
