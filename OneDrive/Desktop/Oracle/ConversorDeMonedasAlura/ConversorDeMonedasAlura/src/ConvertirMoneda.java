import java.util.Scanner;

public class ConvertirMoneda {
    public ConvertirMoneda() {
    }

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La Tasa de conversión para hoy\n " + monedaBase + " = " + monedas.conversion_rate() + " " + monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase);
        double cantidad = Double.parseDouble(lectura.nextLine());
        double cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedas.target_code());
    }

    public static void covertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("Ingrese el código de la moneda base, por favor: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo, por favor: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}

