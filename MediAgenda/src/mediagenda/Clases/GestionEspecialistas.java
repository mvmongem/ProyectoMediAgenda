/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediagenda.Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Steven
 */
public class GestionEspecialistas {
    
    public static Especialista especialistas[] = new Especialista[100];
    public static int contadorEspecialistas = 0;
    public static Horario horarios[] = new Horario[100];
    public static int contadorHorarios = 0;

    public GestionEspecialistas() {
    }

    public static void mostrarMenu() {
        
        String opciones[] = {
            "Registrar Especialista",
            "Consultar Especialistas",
            "Asignar Horario",
            "Ver Horarios",
            "Volver"};
        int seleccion = 0;
        do {
            seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Módulo de Especialistas y Horarios",
                    "MediAgenda - Especialistas",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (seleccion) {
                case 0:
                    registrarEspecialista();
                    break;
                case 1:
                    consultarEspecialistas();
                    break;
                case 2:
                    asignarHorario();
                    break;
                case 3:
                    verHorarios();
                    break;
            }
        } while (seleccion != 4 && seleccion != -1);
    }

    public static void registrarEspecialista() {
        
        if (contadorEspecialistas < especialistas.length) {
            int idEspecialista = contadorEspecialistas + 1;
            String nombre = JOptionPane.showInputDialog("Nombre completo del especialista:");
            String especialidad = JOptionPane.showInputDialog("Especialidad:");
            String correo = JOptionPane.showInputDialog("Correo electronico:");

            especialistas[contadorEspecialistas] = new Especialista(idEspecialista, nombre, especialidad, correo);
            contadorEspecialistas++;

            JOptionPane.showMessageDialog(null, "Especialista registrado con exito! ID asignado: " + idEspecialista);
            
        } else {
            JOptionPane.showMessageDialog(null, "Capacidad maxima de especialistas alcanzada");
        }
    }

    public static void consultarEspecialistas() {
        
        if (contadorEspecialistas == 0) {
            JOptionPane.showMessageDialog(null, "No hay especialistas registrados");
        } else {
            String reporte = "=== LISTA DE ESPECIALISTAS ===\n\n";
            for (int i = 0; i < contadorEspecialistas; i++) {
                reporte += especialistas[i].toString() + "\n\n";
            }
            JOptionPane.showMessageDialog(null, reporte);
        }
    }

    public static void asignarHorario() {
        
        if (contadorEspecialistas == 0) {
            JOptionPane.showMessageDialog(null, "Primero debe registrar al menos un especialista.");
            return;
        }

        if (contadorHorarios < horarios.length) {
            int idBuscado = Integer.parseInt(JOptionPane.showInputDialog("ID del especialista para asignar horario:"));
            Especialista especialistaEncontrado = null;

            for (int i = 0; i < contadorEspecialistas; i++) {
                if (especialistas[i].getIdEspecialista() == idBuscado) {
                    especialistaEncontrado = especialistas[i];
                    break;
                }
            }

            if (especialistaEncontrado == null) {
                JOptionPane.showMessageDialog(null, "No se encontro ningun especialista con ese ID.");
                return;
            }

            String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
            int seleccionDia = JOptionPane.showOptionDialog(null, "Seleccione el dia de la semana", "Asignar Horario",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    dias, dias[0]);

            if (seleccionDia == -1) {
                return;
            }
            String diaSemana = dias[seleccionDia];

            String horaInicio = JOptionPane.showInputDialog("Hora de inicio (ej. 08:00):");
            String horaFin = JOptionPane.showInputDialog("Hora de fin (ej. 12:00):");

            String opcionesDisponible[] = {"Disponible", "No Disponible"};
            int seleccionDisponible = JOptionPane.showOptionDialog(null, "Estado del bloque de horario", "Asignar Horario",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    opcionesDisponible, opcionesDisponible[0]);

            if (seleccionDisponible == -1) {
                return;
            }
            boolean disponible = seleccionDisponible == 0;

            int idHorario = contadorHorarios + 1;
            horarios[contadorHorarios] = new Horario(idHorario, especialistaEncontrado, diaSemana, horaInicio, horaFin, disponible);
            contadorHorarios++;

            JOptionPane.showMessageDialog(null, "Horario asignado correctamente!");
        } else {
            JOptionPane.showMessageDialog(null, "Capacidad maxima de horarios alcanzada");
        }
    }

    public static void verHorarios() {
        if (contadorHorarios == 0) {
            JOptionPane.showMessageDialog(null, "No hay horarios registrados");
        } else {
            String reporte = "=== LISTA DE HORARIOS ===\n\n";
            for (int i = 0; i < contadorHorarios; i++) {
                reporte += horarios[i].toString() + "\n\n";
            }
            JOptionPane.showMessageDialog(null, reporte);
        }
    }
    
    
    
}
