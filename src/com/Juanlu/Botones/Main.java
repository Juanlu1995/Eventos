package com.Juanlu.Botones;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
            Ventana miVentana = new Ventana();
        }
    }

class Ventana extends JFrame {
    public Ventana() {
        setTitle("Ejemplos sobre eventos");
        setBounds(300, 300, 500, 500);
        setLocationRelativeTo(null);


        Botonera boton1 = new Botonera();
        Botonera boton2 = new Botonera();

        add(boton1);
        add(boton2);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class Botonera extends JPanel {

    public Botonera() {
        JButton boton1 = new JButton("Azul");
        boton1.setPreferredSize(new Dimension(100, 50));
        JButton boton2 = new JButton("Rojo");
        boton2.setPreferredSize(new Dimension(100, 50));

        boton1.addActionListener(new AccionBoton(Color.BLUE));
        boton2.addActionListener(new AccionBoton(Color.red));

        add(boton1);
        add(boton2);

    }

    class AccionBoton implements ActionListener {
        Color colorcito;

        public AccionBoton(Color c){
            colorcito = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorcito);
        }
    }
}