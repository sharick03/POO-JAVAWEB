package bolsillo;

public class Daviplata extends Bolsillo {
    private int dinero;
    private int retiro;
    private int recargar;

    public Daviplata() { /*Metodo constructor sin parametros */
    }

    public Daviplata(int dinero, int retiro, int recargar) { /*Metodo constructor con parametros */
        this.dinero = dinero;      /*Metodo constructor con nombres iguales */
        this.retiro = retiro;
        this.recargar = recargar;
    }

    /*Metodos getter y setter*/
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

    public int getRecargar() {
        return recargar;
    }

    public void setRecargar(int recargar) {
        this.recargar = recargar;
    }

    @Override
    public int consultarSaldo(){
        return dinero;
    }

    public int recargarCuenta(){
        dinero=dinero+recargar;
        return dinero;
    }

    public int retirarDinero(){
        dinero=dinero-retiro;
        return dinero;
    }
    
    
}
