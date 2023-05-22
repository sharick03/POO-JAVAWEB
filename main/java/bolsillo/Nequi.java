package bolsillo;

public class Nequi extends Bolsillo{
    private int recargar;
    private int dinero;
    private int retiro;

    public Nequi(){
    }

    public Nequi(int recargar, int dinero, int retiro) {
        this.recargar = recargar;
        this.dinero = dinero;
        this.retiro = retiro;
    }

    public int getRecargar() {
        return recargar;
    }

    public void setRecargar(int recargar) {
        this.recargar = recargar;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }

    @Override
    public int consultarSaldo(){
        return dinero;
    }

    public int recargarCuenta(){
        dinero=recargar+dinero;
        return dinero;
    }

    public int retirarDinero(){
        dinero=retiro-dinero;
        return dinero;
    }

}
