
package com.zonajava.registraralumnos;

import Vista.GUI;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class RegistrarAlumnos {

    public static void main(String[] args) {
        try {
            // Establecer el look and feel McWin para la interfaz gráfica
            UIManager.setLookAndFeel(new McWinLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Crear e iniciar la interfaz gráfica (GUI)
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);  // Muestra la ventana principal del registro de alumnos
            }
        });
    }
}
