package facturacion;

/**
 * Clase Legacy del sistema de facturación.
 * ADVERTENCIA: Código con alta deuda técnica. No modificar la firma del método.
 */

public class FacturacionLegacy {
    /**
     * Este método calcula el método dependiendo el importe.
     * @param importe parametro que nos pasa el usuario del precio
     * @param tipoCliente Perfil del cliente vip o estandar.
     * @param descuentoVip  descuentoVip True si es VIP Premium.
     * @return Importe final
     */
    public double calcularTotal(double importe, int tipoCliente, 
            boolean descuentoVip) {
//Entorno
    float DESCUENTO_VIP_PREMIUM=0.25f;
    float DESCUENTO_VIP=0.15f;
    float DESCUENTO_CLIENTE_ESTANDAR=0.05f;
//Algoritmo
        if (importe <= 0) {
            return 0;
        }
        if (tipoCliente == 1 && descuentoVip) {
            return importe - (importe * DESCUENTO_VIP_PREMIUM);
        }

        if (tipoCliente == 1) {
            return importe - (importe * DESCUENTO_VIP);
        }

        if (tipoCliente == 2) {
            return importe - (importe * DESCUENTO_CLIENTE_ESTANDAR);
        }
        
        return importe;
    }//Fin Método
}
