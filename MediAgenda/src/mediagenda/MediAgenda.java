/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediagenda;

import javax.swing.JOptionPane;
import mediagenda.Clases.GestionPacientes;
import mediagenda.Clases.GestionPagosRecetas;

/**
 *
 * @author monge
 */
public class MediAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionPacientes moduloPacientes = new GestionPacientes();
        GestionPagosRecetas moduloPagos = new GestionPagosRecetas();
        
        String[] opcionesMenu = {
            "1. Pacientes y Expedientes",
            "2. Especialistas y Horarios",
            "3. Citas y Consultas",
            "4. Pagos y Recetas",
            "5. Salir"
        };
        int seleccion = 0;

        do {
            seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione el módulo al que desea ingresar:",
                    "Sistema MediAgenda - Menú Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcionesMenu,
                    opcionesMenu[0]);

            switch (seleccion) {
                case 0:
                    moduloPacientes.mostrarMenu(); // Llamada al módulo de Mónica
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Módulo de Especialistas y Horarios");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Módulo de Citas y Consultas");
                    break;
                case 3:
                    moduloPagos.mostrarMenu();
                    break;
                case 4:
                case 5:
                    JOptionPane.showMessageDialog(null, "¡Gracias por utilizar MediAgenda!", "Salida", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

        } while (seleccion != 4 && seleccion != 5);
    }
    
 }
    

