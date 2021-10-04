import java.util.Scanner;

public class Init {
    public static void main(String[] args) {
        init();
    }
    public static void init() {
        VendedorSopaipilla miVendedor =new VendedorSopaipilla(300,1000);
        VendedorSopaipilla.setCantidad(pedirCantidadSopaipillas());
        VendedorSopaipilla.darVuelto(pedirDinero());
//        System.out.println(miVendedor.getVuelto((int) cantidad,pedirDinero()));
    }
//    ingresar candidad a comprar
    public static int pedirCantidadSopaipillas(){
        System.out.println("Digite la cantidad de sopaipillas que desea ordenar: \n"+"El Stock es: "+ VendedorSopaipilla.getStock());
        return validar(VendedorSopaipilla.getStock());
    }
//    ingresas cuanto pago
    public static int pedirDinero(){
        System.out.println("Digite el dinero con el que va a pagar: \n"+"El costo es " +(int) VendedorSopaipilla.getValue()* VendedorSopaipilla.cantidad);
        return validar(1000000);
    }

//    validar
    public static int validar(int x) {
        int n = -1;
        do {
            //Scanner ponerlo dentro del DO, y dentro de una funcion
            Scanner teclado = new Scanner(System.in);
            //System.out.println("ingrese otro numero");
            try {
                n = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Error");
            }
            if (n < 0 || n > x) {
                System.out.println("ingrese un numero valido");
            }
        } while (n < 0 || n > x);
        return n;
    }
}
