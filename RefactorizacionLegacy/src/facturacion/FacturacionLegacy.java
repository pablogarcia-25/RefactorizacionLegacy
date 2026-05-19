package facturacion;

/**
 * Clase Legacy del sistema de facturación.
 * ADVERTENCIA: Código con alta deuda técnica. No modificar la firma del método.
 */
public class FacturacionLegacy {
    public double calcularTotal(double importe, int tipoCliente, boolean descuentoVip) {

        if (importe <= 0) {
            return 0;
        }
        if (tipoCliente == 1 && descuentoVip) {
            return importe - (importe * 0.25);
        }

        if (tipoCliente == 1) {
            return importe - (importe * 0.15);
        }

        if (tipoCliente == 2) {
            return importe - (importe * 0.05);
        }
        
        return importe;
    }
}
