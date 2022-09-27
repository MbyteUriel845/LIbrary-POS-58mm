public class Imprimir {
    public String checkoutPrint () {
            EscPosInterface.getInstance().printReceipt(
                    "\n"+(char)27+(char)112+(char)0+(char)10+(char)100+"Coshmex Microsystems \n"+
                    "Cholula\n"+
                    "TELS: 2222222222\n"+
                    "\n"+
                    "FOLIO: 123 \n"+
                    "VENDIDO A: MOSTRADOR\n"+
                    "\n"+
                    "DESCRIP   CANT.  PRECIO  IMPORTE\n"+
                    "================================\n"+
                    "Cerveza Corona\n"+
                    "Whisky\n"+
                    "================================\n"+
                    "SUBTOTAL: $ 95\n"+
                    "TOTAL:   $ 95\n"+
                    "RECIBIDO:$ 100\n"+
                    "CAMBIO:  $ 5\n"+
                    "\n"+
                    "(NOVENTA Y CINCO PESOS MXN) M.N\n\n"+
                    "       GRACIAS POR SU COMPRA\n\n"+
                    "Atendido por:COSHMEX\n"+
                    "Expedido en CHOLULA 27/09/22\n"
                    + "\n\n\n\n ");
        return null;
    }
}
