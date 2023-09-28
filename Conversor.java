import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Conversor {
    public static void main(String[] args) {
        String[] opciones = {
            "De Peso Mexicano a Dólar",
            "De Dólar a Peso Mexicano",
            "De Peso Mexicano a Euro",
            "De Euro a Peso Mexicano",
            "De Peso Mexicano a Libra Esterlina",
            "De Libra Esterlina a Peso Mexicano",
            "De Peso Mexicano a Yen",
            "De Yen a Peso Mexicano",
            "De Peso Mexicano a Yuan Chino",
            "De Yuan Chino a Peso Mexicano",
            "De Peso Mexicano a Dólar Canadiense",
            "De Dólar Canadiense a Peso Mexicano",
            "De Peso Mexicano a Won Coreano",
            "De Won Coreano a Peso Mexicano",
            "De Peso Mexicano a Franco Suizo"
        };

        while (true) {
            // Muestra un cuadro de diálogo con un JComboBox de opciones
            JComboBox<String> comboBox = new JComboBox<>(opciones);
            int seleccion = JOptionPane.showConfirmDialog(
                null,
                comboBox,
                "Seleccione una opción de conversión:",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

            // Verifica si se eligió una conversión válida
            if (seleccion == JOptionPane.OK_OPTION) {
                String seleccionado = comboBox.getSelectedItem().toString();
                double tasaCambio = obtenerTasaDeCambio(seleccionado);

                // Solicita la cantidad a convertir
                String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad en " + obtenerOrigen (seleccionado));
                double cantidad = Double.parseDouble(cantidadStr);

                // Realiza la conversión
                double resultado = cantidad * tasaCambio;

                // Muestra el resultado en un cuadro de diálogo
                String mensaje = cantidad + " " + obtenerOrigen (seleccionado) + " es equivalentes a " + Math.floor(resultado) + " en " + obtenerDestino(seleccionado);
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
            case "De Peso Mexicano a Dólar": return 0.056;  
            case "De Dólar a Peso Mexicano": return 17.71;   
            case "De Peso Mexicano a Euro": return 0.047;   
            case "De Euro a Peso Mexicano": return 0.054; 
            case "De Peso Mexicano a Libra Esterlina": return 0.047;  
            case "De Libra Esterlina a Peso Mexicano": return 0.047; 
            case "De Peso Mexicano a Yen": return 8.43;   
            case "De Yen a Peso Mexicano": return 8.43;  
            case "De Peso Mexicano a Yuan Chino": return 0.41; 
            case "De Yuan Chino a Peso Mexicano": return 0.41; 
            case "De Peso Mexicano a Dólar Canadiense": return 0.076;  
            case "De Dólar Canadiense a Peso Mexicano": return 0.076; 
            case "De Peso Mexicano a Won Coreano": return 76.53;  
            case "De Won Coreano a Peso Mexicano": return 76.53; 
            case "De Peso Mexicano a Franco Suizo": return 0.052;  
            default: return 0.0; // Valor por defecto
        }
    }

private static String obtenerOrigen(String seleccion) {
        switch (seleccion) {
            case "De Peso Mexicano a Dólar": return "Pesos Mexicanos";  
            case "De Dólar a Peso Mexicano": return "Dolar";   
            case "De Peso Mexicano a Euro": return "Pesos Mexicanos";   
            case "De Euro a Peso Mexicano": return "Euro"; 
            case "De Peso Mexicano a Libra Esterlina": return "Pesos Mexicanos";  
            case "De Libra Esterlina a Peso Mexicano": return "Libra Esterlina"; 
            case "De Peso Mexicano a Yen": return "Pesos Mexicanos";   
            case "De Yen a Peso Mexicano": return "Yen";  
            case "De Peso Mexicano a Yuan Chino": return "Pesos Mexicanos"; 
            case "De Yuan Chino a Peso Mexicano": return "Yuan Chino"; 
            case "De Peso Mexicano a Dólar Canadiense": return "Pesos Mexicanos";  
            case "De Dólar Canadiense a Peso Mexicano": return "Dolar Canadiense"; 
            case "De Peso Mexicano a Won Coreano": return "Pesos Mexicanos";  
            case "De Won Coreano a Peso Mexicano": return "Won Coreano"; 
            case "De Peso Mexicano a Franco Suizo": return "Pesos Mexicanos";  
            default: return ""; // Valor por defecto
        }
    }
private static String obtenerDestino(String seleccion) {
        switch (seleccion) {
            case "De Peso Mexicano a Dólar": return "Dolar";  
            case "De Dólar a Peso Mexicano": return "Pesos Mexicanos";   
            case "De Peso Mexicano a Euro": return "Euro";   
            case "De Euro a Peso Mexicano": return "Pesos Mexicanos"; 
            case "De Peso Mexicano a Libra Esterlina": return "Libra Esterlina";  
            case "De Libra Esterlina a Peso Mexicano": return "Pesos Mexicanos"; 
            case "De Peso Mexicano a Yen": return "Yen";   
            case "De Yen a Peso Mexicano": return "Pesos Mexicanos";  
            case "De Peso Mexicano a Yuan Chino": return "Yuan Chino"; 
            case "De Yuan Chino a Peso Mexicano": return "Pesos Mexicanos"; 
            case "De Peso Mexicano a Dólar Canadiense": return "Dolar Canadiense";  
            case "De Dólar Canadiense a Peso Mexicano": return "Pesos Mexicanos"; 
            case "De Peso Mexicano a Won Coreano": return "Won Coreano";  
            case "De Won Coreano a Peso Mexicano": return "Pesos Mexicanos"; 
            case "De Peso Mexicano a Franco Suizo": return "Franco Suizo";  
            default: return ""; // Valor por defecto
        }
    }






}


