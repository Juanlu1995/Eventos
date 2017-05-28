package com.Juanlu.Email;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by juanl on 26/05/2017.
 */
public class ValidateEmail{
    public static void main(String[] args) {
        VentanaEmail ventanaEmail = new VentanaEmail();
    }
}

class VentanaEmail extends JFrame{
    public VentanaEmail(){
        setTitle("Validando Email");
        setBounds(200,200,500,550);

        Capa capa = new Capa();
        add(capa);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Capa extends JPanel{
    public Capa(){
        JLabel etiqueta = new JLabel("Email");
        JTextField cajaTexto = new JTextField(30);
        JButton boton = new JButton("Validar");

        boton.addActionListener(new AccionBoton(cajaTexto.getText()));

        add(etiqueta);
        add(cajaTexto);
        add(boton);

    }

    class AccionBoton implements ActionListener{
        String email;

        public AccionBoton(String e){
            email = e;
        }

        @Override
        public void actionPerformed(ActionEvent e){
            if (isEmail(email)){
                System.out.println("El email es valido");
            }else{
                System.out.println("El email es invalido");
            }
        }
        private boolean isEmail(String correo) {
            Pattern pat = null;
            Matcher mat = null;
            pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
            mat = pat.matcher(correo);
            if (mat.find()) {
                System.out.println("[" + mat.group() + "]");
                return true;
            }else{
                return false;
            }
        }

    }
}


