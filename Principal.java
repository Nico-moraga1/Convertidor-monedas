import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion=0;
        while (opcion != 0){
            System.out.println("*********************\n"+
                    "Bienvenidos al mejor conversor de monedas \n\n"+
                    "1. Dollar a peso Chileno\n"+
                    "2. Peso  Argentino a Chileno\n"+
                    "3. Dollar a Real Brasilero\n"+
                    "4. Real Brasilero a Dollar\n"+
                    "5. Dollar a Peso Colombiano\n"+
                    "6. Peso Colombiano a Dollar\n"+
                    "7. Convertir otra moneda\n"+
                    "8. Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConsultarMoneda.convertir( monedaBase)
            }
        }
    }
}
