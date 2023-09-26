import javax.swing.JOptionPane;

public class Conversor {
    public static void main(String[] args) {
        String[] opciones = { "Dólar a Euro", "Euro a Dólar" };

        // Muestra un cuadro de diálogo con un menú desplegable de opciones
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una conversión:",
                "Conversor de Moneda",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        double tasaCambio = 0.0;
        String monedaOrigen = "";
        String monedaDestino = "";

        // Comprobar la opción seleccionada y configurar las monedas y la tasa de cambio
        if (seleccion == 0) { // Dólar a Euro
            monedaOrigen = "dólares";
            monedaDestino = "euros";
            tasaCambio = 0.85; // Tasa de cambio ficticia, debes usar la tasa real
        } else if (seleccion == 1) { // Euro a Dólar
            monedaOrigen = "";
            monedaDestino = "dólares";
            tasaCambio = 1.18; // Tasa de cambio ficticia, debes usar la tasa real
            
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó una conversión válida.");
            System.exit(0);
        }

        // Solicita la cantidad a convertir
        String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad en " + monedaOrigen + ":");
        double cantidad = Double.parseDouble(cantidadStr);

        // Realiza la conversión
        double resultado = cantidad * tasaCambio;

        // Muestra el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, cantidad + " " + monedaOrigen + " son " + resultado + " " + monedaDestino + ".");
    }
}
