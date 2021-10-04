import java.util.Scanner;

public class Init {
    private static double cantidad;
    public static void main(String[] args) {
        init();
    }
    public static void init() {
        SopaipletoSeller es =new SopaipletoSeller(100,1000);
        cantidad = pedirCantidadSopaipillas();
        System.out.println(es.getVuelto((int) cantidad,pedirDinero()));
    }
//    ingresar candidad a comprar
    public static int pedirCantidadSopaipillas(){
        System.out.println("Digite la cantidad de sopaipillas que desea ordenar: \n"+"El Stock es: "+SopaipletoSeller.getStock());
        return validar(SopaipletoSeller.getStock());
    }
//    ingresas cuanto pago
    public static int pedirDinero(){
        System.out.println("Digite el dinero con el que va a pagar: \n"+"El costo es " +(int)SopaipletoSeller.getValue()*cantidad);
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
