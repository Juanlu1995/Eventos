package com.Juanlu.Email;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        add(etiqueta);
        add(cajaTexto);
        add(boton);
    }
}
