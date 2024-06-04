package vista;
//Esta clase se encarga de gestionar los tipos de cuentas
public class TipoCuenta {

   private int nroCuenta;
    private double saldo;
    private String tipoMoneda;
//En el constructor se asignan e inicializan las variables
    public TipoCuenta(int nroCuenta, String tipoMoneda,double saldo) {
        this.nroCuenta=nroCuenta;
        this.saldo = saldo;
        this.tipoMoneda = tipoMoneda;
    }
    //Este metodo obtiene el numero de cuenta del usuario
    public int getNroCuenta() {
        return nroCuenta;
    }
//Este metodo obtiene el saldo de alguna de las cuentas que usuario el usuaqrio haya seleccionado
    public double getSaldo() {
        return saldo;
    }
//Este metodo obtiene el tipo de moneda de la cuenta del usuario
    public String getTipoMoneda() {
        return tipoMoneda;
    }
//Este metodo setea el saldode alguna de las cuentas que el usuario haya seleccionado
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//Este metodo setea el tipo de moneda de la cuenta que el usuario haya seleccionado
    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
    
}
