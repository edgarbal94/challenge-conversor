import javax.swing.*;

public class Conversor {
    public static void main(String[] args) {
        String[] opciones = {
            "De Pesos a Dólar",
            "De Dólar a Pesos",
            "De Pesos a Euro",
            "De Euro a Pesos",
            "De Pesos a Libras",
            "De Libras a Pesos",
            "De Pesos a Yen",
            "De Yen a Pesos",
            "De Pesos a Won Coreano",
            "De Won Coreano a Pesos",
            "De Pesos a Libra Esterlina",
            "De Libra Esterlina a Pesos",
            "De Pesos a Dólar Canadiense",
            "De Dólar Canadiense a Pesos",
            "De Pesos a Yuan Chino",
            "De Yuan Chino a Pesos"
        };

        // Muestra un cuadro de diálogo con un JComboBox de opciones
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        int seleccion = JOptionPane.showConfirmDialog(
            null,
            comboBox,
            "Elija la conversión de moneda:",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        // Verifica si se eligió una conversión válida
        if (seleccion == JOptionPane.OK_OPTION) {
            String seleccionado = comboBox.getSelectedItem().toString();
            double tasaCambio = obtenerTasaDeCambio(seleccionado);

            // Solicita la cantidad a convertir
            String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad en Pesos:");
            double cantidad = Double.parseDouble(cantidadStr);

            // Realiza la conversión
            double resultado = cantidad * tasaCambio;

            // Muestra el resultado en un cuadro de diálogo
            String mensaje = cantidad + " Pesos son equivalentes a " + resultado + " en la moneda seleccionada.";
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó una conversión válida.");
        }
    }

    private static double obtenerTasaDeCambio(String seleccion) {
        switch (seleccion) {
            case "De Pesos a Dólar": return 0.050;
            case "De Dólar a Pesos": return 20.0;
            case "De Pesos a Euro": return 0.043;
            case "De Euro a Pesos": return 23.2558;
            case "De Pesos a Libras": return 0.036;
            case "De Libras a Pesos": return 27.7778;
            case "De Pesos a Yen": return 5.61;
            case "De Yen a Pesos": return 0.1785;
            case "De Pesos a Won Coreano": return 0.059;
            case "De Won Coreano a Pesos": return 16.9492;
            case "De Pesos a Libra Esterlina": return 0.032;
            case "De Libra Esterlina a Pesos": return 31.25;
            case "De Pesos a Dólar Canadiense": return 0.065;
            case "De Dólar Canadiense a Pesos": return 15.3846;
            case "De Pesos a Yuan Chino": return 0.13;
            case "De Yuan Chino a Pesos": return 7.6923;
            default: return 0.0; // Valor por defecto
        }
    }
}
