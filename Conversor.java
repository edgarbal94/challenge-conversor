import javax.swing.*;

public class Conversor {
    public static void main(String[] args) {
        String[] opciones = {
            "De Pesos Mexicano a Dólar",
            "De Dólar a Pesos Mexicano",
            "De Pesos Mexicano a Euro",
            "De Euro a Pesos Mexicano",
            "De Pesos Mexicano a Libra Esterlina",
            "De Libra Esterlina a Pesos Mexicano",
            "De Pesos Mexicano a Yen",
            "De Yen a Pesos Mexicano",
            "De Pesos Mexicano a Yuan Chino",
            "De Yuan Chino a Pesos Mexicano",
            "De Pesos Mexicano a Dólar Canadiense",
            "De Dólar Canadiense a Pesos Mexicano",
            "De Pesos Mexicano a Won Coreano",
            "De Won Coreano a Pesos Mexicano",
            "De Pesos Mexicano a Franco Suizo"
        };

        while (true) {
            // Muestra un cuadro de diálogo con un JComboBox de opciones
            JComboBox<String> comboBox = new JComboBox<>(opciones);
            int seleccion = JOptionPane.showConfirmDialog(
                null,
                comboBox,
                "Seleccione una opcion de conversion:",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

            // Verifica si se eligió una conversión válida
            if (seleccion == JOptionPane.OK_OPTION) {
                String seleccionado = comboBox.getSelectedItem().toString();
                double tasaCambio = obtenerTasaDeCambio(seleccionado);

                // Solicita la cantidad a convertir
                String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad en Pesos Mexicano:");
                double cantidad = Double.parseDouble(cantidadStr);

                // Realiza la conversión
                double resultado = cantidad * tasaCambio;

                // Muestra el resultado en un cuadro de diálogo
                String mensaje = cantidad + " Pesos Mexicanos son equivalentes a " + resultado + " Tipo de moneda seleccionada.";
                JOptionPane.showMessageDialog(null, mensaje);

                // Pregunta si desea realizar otra conversión
                int continuar = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea realizar otra conversión?",
                    "Continuar",
                    JOptionPane.YES_NO_OPTION
                );

                if (continuar != JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se seleccionó una conversión válida.");
                break;
            }
        }
    }

    private static double obtenerTasaDeCambio(String seleccion) {
        switch (seleccion) {
            case "De Pesos Mexicano a Dólar": return 0.057;  // Tasa de cambio ficticia, debes usar la tasa real
            case "De Dólar a Pesos Mexicano": return 0.057;   // Tasa de cambio ficticia, debes usar la tasa real
            case "De Pesos Mexicano a Euro": return 0.054;   // Tasa de cambio ficticia, debes usar la tasa real
            case "De Euro a Pesos Mexicano": return 18.52; // Tasa de cambio ficticia, debes usar la tasa real
            case "De Pesos Mexicano a Libra Esterlina": return 0.047;  // Tasa de cambio ficticia, debes usar la tasa real
            case "De Libra Esterlina a Pesos Mexicano": return 0.047; // Tasa de cambio ficticia, debes usar la tasa real
            case "De Pesos Mexicano a Yen": return 8.51;    // Tasa de cambio ficticia, debes usar la tasa real
            case "De Yen a Pesos Mexicano": return 8.51;  // Tasa de cambio ficticia, debes usar la tasa real
            case "De Pesos Mexicano a Yuan Chino": return 0.42;  // Tasa de cambio ficticia, debes usar la tasa real
            case "De Yuan Chino a Pesos Mexicano": return 0.42; // Tasa de cambio ficticia, debes usar la tasa real
            case "De Pesos Mexicano a Dólar Canadiense": return 0.077;  // Tasa de cambio ficticia, debes usar la tasa real
            case "De Dólar Canadiense a Pesos Mexicano": return 0.077; // Tasa de cambio ficticia, debes usar la tasa real
            case "De Pesos Mexicano a Won Coreano": return 77.00;  // Tasa de cambio ficticia, debes usar la tasa real
            case "De Won Coreano a Pesos Mexicano": return 77.00; // Tasa de cambio ficticia, debes usar la tasa real
            case "De Pesos Mexicano a Franco Suizo": return 0.052;  // Tasa de cambio ficticia, debes usar la tasa real
            default: return 0.0; // Valor por defecto
        }
    }
}
