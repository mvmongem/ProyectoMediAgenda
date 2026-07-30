/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediagenda.Clases;

/**
 *
 * @author Steven
 */
public class Pago {
    
    private int idPago;
    private int idCita;
    private String numeroFactura;
    private String metodoPago;
    private double monto;
    private String estado;

    public Pago() {
    }

    public Pago(int idPago, int idCita, String numeroFactura, String metodoPago, double monto, String estado) {
        this.idPago = idPago;
        this.idCita = idCita;
        this.numeroFactura = numeroFactura;
        this.metodoPago = metodoPago;
        this.monto = monto;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public void registrarPago(){
        this.estado = "Pagado";
    }
    
    public String imprimirFactura() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "--- FACTURA MEDIAGENDA ---\n"
                + "N. Factura: " + this.numeroFactura + "\n"
                + "ID Pago: " + this.idPago + "\n"
                + "N. Cita: " + this.idCita + "\n"
                + "Metodo de Pago: " + this.metodoPago + "\n"
                + "Monto: ₡" + this.monto + "\n"
                + "Estado: " + this.estado;
    }

       
    
   
}
