public class SopaipletoSeller {
    private static double value;
    private static int stock;

    public SopaipletoSeller(double value, int stock) {
        SopaipletoSeller.value = value;
        SopaipletoSeller.stock = stock;
    }
    protected boolean isStock(int stock){
        return SopaipletoSeller.stock -stock >= 0;
    }

    protected boolean enoughMoney(int cantidadPedido, double amount){
        return amount>=(cantidadPedido* value);
    }
    //en caso de que no hay stock return 0
    //en caso de que no alcanza el dinero return -1
    //en caso de que ni dinero ni stock return -2
    //nunca va a devolver e ultimo caso
    public double getVuelto(int a,double amount){
        if(isStock(a)&&enoughMoney(a,amount)){
            return amount-(a* value);
        }else if(!isStock(a)&&enoughMoney(a,amount)){
            return 0;
        }else if(!enoughMoney(a, amount)&&isStock(a)) {
            return -1;}
        else if(!enoughMoney(a, amount)&&!isStock(a)){
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


}
