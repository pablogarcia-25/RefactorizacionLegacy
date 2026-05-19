package facturacion;

/**
 * Clase Legacy del sistema de facturación.
 * ADVERTENCIA: Código con alta deuda técnica. No modificar la firma del método.
 */
public class FacturacionLegacy {
    public double cT(double m, int tC, boolean dV) {

        if (m <= 0) {
            return 0;
        }
        if (tC == 1) {
            return dV ? (m - (m * 0.25)) : (m - (m * 0.15));
        }

        if (tC == 2) {
            return m - (m * 0.05);
        }

        return m;
    }
}
