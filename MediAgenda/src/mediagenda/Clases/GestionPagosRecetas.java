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
public class GestionPagosRecetas {
    
    public static Pago pagos[] = new Pago[100];
    public static int contadorPagos = 0;
    public static Receta recetas[] = new Receta[100];
    public static int contadorRecetas = 0;

    public GestionPagosRecetas() {
    }

    public static void mostrarMenu() {
        
        String opciones[] = {
        "Procesar Pago/Factura",
        "Consultar Facturas",
        "Generar Receta Médica",
        "Ver Recetas",
        "Volver"};
        
        int seleccion = 0;
        do {
            seleccion = JOptionPane.showOptionDialog(
                null,
                "Módulo de Pagos y Recetas",
                "MediAgenda - Pagos y Recetas",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);

        switch (seleccion) {
            case 0:
                procesarPago();
                break;
            case 1:
                consultarFacturas();
                break;
            case 2:
                generarRecetaMedica();
                break;
            case 3:
                consultarRecetas();
                break;
        }
    } while (seleccion != 4 && seleccion != -1);
}
    

    public static void procesarPago() {
        if (contadorPagos < pagos.length) {
            int idPago = contadorPagos + 1;
            int idCita = Integer.parseInt(JOptionPane.showInputDialog("ID de la cita que se va a cobrar:"));

            String numeroFactura = "MEDIFAC-" + idPago;

            String metodos[] = {"Efectivo", "Tarjeta", "Sinpe Movil", "Transferencia"};
            int seleccionMetodo = JOptionPane.showOptionDialog(null, "Seleccione el método de pago", "Procesar Pago",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    metodos,
                    metodos[0]);

            if (seleccionMetodo == -1) {
                return;
            }
            String metodoPago = metodos[seleccionMetodo];

            double monto = Double.parseDouble(JOptionPane.showInputDialog("Monto a cobrar:"));

            pagos[contadorPagos] = new Pago(idPago, idCita, numeroFactura, metodoPago, monto, "Pendiente");
            pagos[contadorPagos].registrarPago();
            contadorPagos++;

            JOptionPane.showMessageDialog(null, "Pago procesado correctamente\n\n" + pagos[contadorPagos - 1].imprimirFactura());
        } else {
            JOptionPane.showMessageDialog(null, "Capacidad maxima de pagos alcanzada");
        }
    }
    

    public static void consultarFacturas() {
        if (contadorPagos == 0) {
            JOptionPane.showMessageDialog(null, "No hay facturas registradas");
            return;
        }

        String opciones[] = {"Ver todas las facturas", "Buscar factura por numero"};
        
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de consulta", "Consultar Facturas",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        switch (opcion) {
            case 0:
                String reporte = "=== LISTA DE FACTURAS ===\n\n";
                for (int i = 0; i < contadorPagos; i++) {
                    reporte += pagos[i].imprimirFactura() + "\n\n";
                }
                JOptionPane.showMessageDialog(null, reporte);
                break;

            case 1:
                String numeroBuscado = JOptionPane.showInputDialog("Número de factura (ej. FAC-1):");
                Pago encontrado = null;

                for (int i = 0; i < contadorPagos; i++) {
                    if (pagos[i].getNumeroFactura().equalsIgnoreCase(numeroBuscado)) {
                        encontrado = pagos[i];
                        break;
                    }
                }

                if (encontrado != null) {
                    JOptionPane.showMessageDialog(null, encontrado.imprimirFactura());
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró una factura con ese número");
                }
                break;
        }
    }
    
    

    public static void generarRecetaMedica() {
        if (contadorRecetas < recetas.length) {
            int idReceta = contadorRecetas + 1;
            int idConsulta = Integer.parseInt(JOptionPane.showInputDialog("ID de la consulta medica ya realizada:"));

            String medicamento = JOptionPane.showInputDialog("Medicamento a recetar:");
            String dosis = JOptionPane.showInputDialog("Dosis:");
            String indicaciones = JOptionPane.showInputDialog("Indicaciones adicionales:");

            recetas[contadorRecetas] = new Receta(idReceta, idConsulta, medicamento, dosis, indicaciones);
            contadorRecetas++;

            JOptionPane.showMessageDialog(null, recetas[contadorRecetas - 1].generarReceta());
        } else {
            JOptionPane.showMessageDialog(null, "Capacidad máxima de recetas alcanzada");
        }
    }
    
    
    public static void consultarRecetas() {
        if (contadorRecetas == 0) {
            JOptionPane.showMessageDialog(null, "No hay recetas registradas");
            return;
    }

    String reporte = "=== LISTA DE RECETAS ===\n\n";
        for (int i = 0; i < contadorRecetas; i++) {
            reporte += recetas[i].generarReceta() + "\n\n";
        }
            JOptionPane.showMessageDialog(null, reporte);
    }
    
    
    
    
}
