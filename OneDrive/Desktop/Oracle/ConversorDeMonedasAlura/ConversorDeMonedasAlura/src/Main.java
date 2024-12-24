import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();
        int opcion = 0;

        while(opcion != 8) {
            System.out.println("****************************************\n\n" +
                    "Bienvenidos al Coversor de Monedas\n\n" +
                    "Por favor, ingresa la conversión que deseas realizar\n\n" +
                    "1. Dolar a Peso argentino\n" +
                    "2. Peso Argentino a Dolar\n" +
                    "3. Dolar a Real Brazileño\n" +
                    "4. Real Brazileño a Dolar\n" +
                    "5. Dolar a Peso Colombiano\n" +
                    "6. Peso Colombiano a Dolar\n" +
                    "7. Convertir a otra Moneda\n" +
                    "8. Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();
            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.covertirOtraMoneda(consulta, lectura);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

    }
}
