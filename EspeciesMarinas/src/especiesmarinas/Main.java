/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package especiesmarinas;

import especiesmarinas.Clases.Gestion;
import javax.swing.JOptionPane;

/**
 *
 * @author monge
 */
public class Main {
    
    public static void main(String[] args) {
        Gestion gestiones = new Gestion();
        int opcion;

        do {

            String menu[] = {
                "Agregar especie",
                "Mostrar especies",
                "Buscar especie",
                "Editar especie",
                "Salir"
            };

            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Sistema de Gestión de Especies Marinas",
                    "Menú",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    menu,
                    menu[0]);

            switch (opcion) {

                case 0:
                    Gestion.agregar();
                    break;

                case 1:
                    Gestion.mostrar();
                    break;

                case 2:
                    Gestion.buscar();
                    break;

                case 3:
                    Gestion.editar();
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null,
                            "Hasta luego.");
                    break;
            }

        } while (opcion != 4);
    }
}