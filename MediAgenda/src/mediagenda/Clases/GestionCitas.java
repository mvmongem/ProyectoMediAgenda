/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediagenda.Clases;
import javax.swing.JOptionPane;


/**
 *
 * @author home
 */
public class GestionCitas {
    
    public static Cita[] citas = new Cita[100];
    public int contadorCitas = 0;
    
    public static Consulta[] consultas = new Consulta[100];
    public int contadorConsultas = 0;
    
    public void mostrarMenu() {
        String[] opciones = {
            "Agendar Cita",
            "Cancelar/Modificar Cita",
            "Registrar Consulta Medica",
            "Volver"
                
        };
        int seleccion = 0;
        do {
            seleccion = JOptionPane.showOptionDialog(null,
                    "Modulo de Gestion de Citas y Consultas",
                    "MediAgenda - Citas", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
                    opciones,
                    opciones[0]);
            
            switch (seleccion) {
                case 0:
                    agendarCita();
                    break;
                case 1:
                    cancelarModificarCita();
                    break;
                case 2:
                    registrarConsultaMedica();
                    break;
                            
            }
        } while (seleccion != 3 && seleccion != -1);
    }
    
    
    public void agendarCita() {
        if (contadorCitas >= citas.length) {
            JOptionPane.showMessageDialog(null, "Maximo de citas alcanzado.");
            return;
        }
        
        int idPaciente = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del paciente: "));
        Paciente pacienteEncontrado = null;
        for (int i = 0; i < GestionPacientes.pacientes.length; i++) {
            if (GestionPacientes.pacientes[i] != null && GestionPacientes.pacientes[i].getIdPaciente() == idPaciente) {
                pacienteEncontrado = GestionPacientes.pacientes[i];
            }
        }
        
        if (pacienteEncontrado == null) {
            JOptionPane.showMessageDialog(null, "No se encontro ningun paciente con el ID indicado. Por favor registrelo primero en el Modulo de Pacientes");
            return;
        }
        
        int idEspecialista = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del especialista:"));
        String nombreEspecialista = JOptionPane.showInputDialog("Ingrese el nombre del especialista:");
        String especialidad = JOptionPane.showInputDialog("Ingrese la especialidad:");
        String correoEspecialista = JOptionPane.showInputDialog("Ingrese el correo del especialista:");
        Especialista especialistaSeleccionado = new Especialista(idEspecialista, nombreEspecialista, especialidad, correoEspecialista);

        int idCita = contadorCitas + 1;
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la cita (DD/MM/AAAA): ");
        String hora = JOptionPane.showInputDialog("Ingrese la hora de la cita: ");
        String motivo = JOptionPane.showInputDialog("Ingrese el motivo de la cita: ");
        
        Cita citaNueva = new Cita(idCita, pacienteEncontrado, especialistaSeleccionado, fecha, hora, motivo);
        citaNueva.agendarCita();
        
        citas[contadorCitas] = citaNueva;
        contadorCitas++;
        
        JOptionPane.showMessageDialog(null, "Cita agendada con exito. ID asignado a la cita: " + idCita + "\n\n" + citaNueva.toString());        
    }
    
    public void cancelarModificarCita() {
        if (contadorCitas == 0) {
            JOptionPane.showMessageDialog(null, "No hay citas registradas.");
            return;
        }
        
        int idBuscado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la cita a cancelar/modificar:"));
        Cita citaEncontrada = null;
        for (int i = 0; i < contadorCitas; i++) {
            if (citas[i].getIdCita() == idBuscado) {
                citaEncontrada = citas[i];
            }
        }
        
        if (citaEncontrada == null) {
            JOptionPane.showMessageDialog(null, "No se encontro una cita con ese ID.");
            return;
        }
        
        citaEncontrada.cancelarCita();
        JOptionPane.showMessageDialog(null, "Cita cancelada exitosamente. \n\n" + citaEncontrada.toString());
    }
    
    public void registrarConsultaMedica() {
        if (contadorCitas == 0) {
            JOptionPane.showMessageDialog(null, "No hay citas registradas.");
            return;
        }
        if (contadorConsultas >= consultas.length) {
            JOptionPane.showMessageDialog(null, "Capacidad maxima de consultas alcanzadas.");
            return;
        }
        
        
        int idCitaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la cita a atender: "));
        Cita citaEncontrada = null;
        for (int i = 0; i < contadorCitas; i++) {
            if (citas[i].getIdCita() == idCitaBuscada) {
                citaEncontrada = citas[i];
            }
        }
        
        if (citaEncontrada == null) {
            JOptionPane.showMessageDialog(null, "No se encontro una cita con ese ID.");
            return;
        }
        
        int idExpediente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del expediente clinico:"));
        ExpedienteClinico expedienteEncontrado = null;
        for (int i = 0; i < GestionPacientes.expedientes.length; i++) {
            if (GestionPacientes.expedientes[i] != null && GestionPacientes.expedientes[i].getIdExpediente() == idExpediente) {
                expedienteEncontrado = GestionPacientes.expedientes[i];
            }
        }
        
        if (expedienteEncontrado == null) {
            JOptionPane.showMessageDialog(null, "No se encontro un expediente con ese ID. Debe crearlo primero en el Modulo de Pacientes");
            return;
        }
        
        int idConsulta = contadorConsultas + 1;
        String motivoConsulta = JOptionPane.showInputDialog("Ingrese el motivo de la consulta: ");
        String diagnostico = JOptionPane.showInputDialog("Ingrese el diagnostico: ");
        String tratamiento = JOptionPane.showInputDialog("Ingrese el tratamiento: ");
        
        Consulta consultaNueva = new Consulta(idConsulta, citaEncontrada, expedienteEncontrado, motivoConsulta, diagnostico, tratamiento);
        consultaNueva.registrarConsulta();
        
        consultas[contadorConsultas] = consultaNueva;
        contadorConsultas++;
        
        JOptionPane.showMessageDialog(null, "Consulta registrada exitosamente. \n\n" + consultaNueva.toString());
    }
}
