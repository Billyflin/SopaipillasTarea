public class VendedorSopaipilla {
    protected static int cantidad;
    private static double value;
    private static int stock;

    public static void setCantidad(double cantidad) {
        VendedorSopaipilla.cantidad = (int) cantidad;
    }

    public VendedorSopaipilla(double value, int stock) {
        VendedorSopaipilla.value = value;
        VendedorSopaipilla.stock = stock;
    }
    protected static boolean isStock(int stock){
        return VendedorSopaipilla.stock -stock >= 0;
    }

    protected static boolean enoughMoney(int cantidadPedido, double amount){
        return amount>=(cantidadPedido* value);
    }
    //en caso de que no hay stock return 0
    //en caso de que no alcanza el dinero return -1
    //en caso de que ni dinero ni stock return -2
    //nunca va cantidad devolver e ultimo caso
    protected static double getVuelto(int cantidad,double amount){
        if(isStock(cantidad)&&enoughMoney(cantidad,amount)){
            return amount-(cantidad* value);
        }else if(!isStock(cantidad)&&enoughMoney(cantidad,amount)){
            return 0;
        }else if(!enoughMoney(cantidad, amount)&&isStock(cantidad)) {
            return -1;}
        else if(!enoughMoney(cantidad, amount)&&!isStock(cantidad)){
            return -2;
        }
        return amount;
    }

    public static double getValue() {
        return (int)value;
    }

    public static int getStock() {
        return stock;
    }
    public static void darVuelto(int amount){
        var a=cantidad;
        double totalVuelto=getVuelto(a,amount);
        if(totalVuelto>0){
            System.out.println("su vuelto es $"+totalVuelto);
        }else if(totalVuelto==0){
            System.out.println("Stock insuficiente");
        }else if(totalVuelto==-1){
            System.out.println("Dinero insuficiente");
        }else if(totalVuelto==-2){
            System.out.println("Ni dinero, ni stock suficiente");
        }

    }


}
