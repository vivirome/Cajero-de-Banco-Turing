package vista;
/* Esta libreria en general se encargara de las listas de tipo arraylist */
import java.util.ArrayList;
/* Esta clase se encarga de represengtar un cuenta de usuario con sus respectivos datos */
public class Cuenta {
    private String nombre ;
     private int nroCuenta;
    private String apellido  ;
    private String login;
    private String contraseña ;
    private ArrayList <TipoCuenta> listaTipoCuenta;
/* En el constructor de la clase se asignan e inicializan las variables y se crea una lista de tipo arraylist
    denominada listaTipoCuenta*/
    public Cuenta(String nombre,String apellido,int nrocuenta,  String login, String contraseña) {
        this.nombre = nombre;
        this.nroCuenta=nrocuenta;
        this.apellido = apellido;
        this.login = login;
        this.contraseña = contraseña;
        listaTipoCuenta = new ArrayList<TipoCuenta>();
    }

//Con este método se obtiene el numero de cuenta
    public int getNroCuenta() {
        return nroCuenta;
    }
    //Este metodo inicia sesion comparando los datos ingresados con los datos ya registrados
    public boolean iniciarSesion(String loginn,String pass){
        return contraseña.equals(pass)&&login.equals(loginn);
    }
    //Este metodo anade una moneda a un tipo de cuenta creado y lo anade a la lista de tipo de cuenta
    public void añadirMoneda(String moneda){
        TipoCuenta añadirmoneda=new TipoCuenta(0,moneda,0);
        listaTipoCuenta.add(añadirmoneda);
    }
    //Este metodo obtiene el nombre del usuarioi
    public String getNombre() {
        return nombre;
    }
//Este metodo obtiene el apellido del usuario
    public String getApellido() {
        return apellido;
    }
//Este metodo obtiene el login o nombre de usuario del cliente
    public String getLogin() {
        return login;
    }
//Este metodo obtiene la contrasenia del usuario
    public String getContraseña() {
        return contraseña;
    }
//Este metodo obtiene la lista de tipo de cuenta
    public ArrayList<TipoCuenta> getListaTipoCuenta() {
        return listaTipoCuenta;
    }
//Este metodo setea el nombre del usuario
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//Este metodo setea el apellido del usuario
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
//Este metodo setea el login o nombre de usuario del cliente
    public void setLogin(String login) {
        this.login = login;
    }
//Este metodo setea la contrasenia del usuario
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
//Este metodo setea la lista de tipo de cuenta
    public void setListaTipoCuenta(ArrayList<TipoCuenta> listaTipoCuenta) {
        this.listaTipoCuenta = listaTipoCuenta;
    }
}
