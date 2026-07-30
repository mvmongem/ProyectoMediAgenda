/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediagenda.Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author monge
 */
public class GestionPacientes {
    public static Paciente[] pacientes = new Paciente[100];
    public int contadorPacientes=0;
    public static ExpedienteClinico[] expedientes = new ExpedienteClinico[100];
    public int contadorExpedientes=0;
    
    
    public void mostrarMenu() {
        String[] opciones = {
            "Registrar Paciente", 
            "Consultar Pacientes", 
            "Crear Expediente", 
            "Ver Expedientes", 
            "Volver"};
        int seleccion = 0;
        do {
            seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Módulo de Gestión de Pacientes y Expedientes",
                    "MediAgenda - Pacientes",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (seleccion) {
                case 0:
                    registrarPaciente();
                    break;
                case 1:
                    consultarPaciente();
                    break;
                case 2:
                    CrearExpediente();
                    break;
                case 3:
                    consultarExpedientes();
                    break;
            }
        } while (seleccion != 4 && seleccion != -1);
    
    }    
    
    
    public void registrarPaciente(){
        if (contadorPacientes < pacientes.length) {
            int id = contadorPacientes + 1;
            String nombre = JOptionPane.showInputDialog("Nombre completo del paciente:");
            if (nombre == null) return;
            String cedula = JOptionPane.showInputDialog("Cédula:");
            String fecha = JOptionPane.showInputDialog("Fecha Nacimiento (DD/MM/AAAA):");
            String correo = JOptionPane.showInputDialog("Correo electrónico:");

            pacientes[contadorPacientes] = new Paciente(id, nombre, fecha, cedula, correo);
            contadorPacientes++;

            JOptionPane.showMessageDialog(null, "¡Paciente registrado con éxito! ID asignado: " + id);
        } else {
            JOptionPane.showMessageDialog(null, "El sistema alcanzó la capacidad máxima de pacientes.");
        }
    }
    
    
    public void consultarPaciente(){
        if (contadorPacientes == 0) {
            JOptionPane.showMessageDialog(null, "No hay pacientes registrados en el sistema.");
        } else {
            String reporte = "=== LISTA DE PACIENTES ===\n";
            for (int i = 0; i < contadorPacientes; i++) {
                reporte += "ID: " + pacientes[i].getIdPaciente() + 
                           "\n | Nombre: " + pacientes[i].getNombre() + 
                           "\n | Cédula: " + pacientes[i].getCedula() + "\n";
            }
            JOptionPane.showMessageDialog(null, reporte);
        }
    }
    
    
    public void CrearExpediente(){
        if (contadorPacientes == 0) {
            JOptionPane.showMessageDialog(null, "Primero debe registrar al menos un paciente.");
            return;
        }

        String idStr = JOptionPane.showInputDialog("Ingrese el ID del paciente para crear expediente:");
        if (idStr == null) return;

        int idBuscado = Integer.parseInt(idStr);
        Paciente pacienteEncontrado = null;

        for (int i = 0; i < contadorPacientes; i++) {
            if (pacientes[i].getIdPaciente() == idBuscado) {
                pacienteEncontrado = pacientes[i];
                break;
            }
        }

        if (pacienteEncontrado != null) {
            String enf = JOptionPane.showInputDialog("Enfermedades/Padecimientos:");
            String ant = JOptionPane.showInputDialog("Antecedentes médicos:");
            String obs = JOptionPane.showInputDialog("Observaciones iniciales:");

            expedientes[contadorExpedientes] = new ExpedienteClinico(contadorExpedientes + 1, pacienteEncontrado, enf, ant, obs);
            contadorExpedientes++;

            JOptionPane.showMessageDialog(null, "¡Expediente creado correctamente!!");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún paciente con ese ID.");
        }
    }
    
    
    public void consultarExpedientes(){
        if (contadorExpedientes == 0) {
            JOptionPane.showMessageDialog(null, "No hay expedientes clínicos registrados.");
        } else {
            for (int i = 0; i < contadorExpedientes; i++) {
                JOptionPane.showMessageDialog(null, expedientes[i].toString());
            }
        }
    }
}
