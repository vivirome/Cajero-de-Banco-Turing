package cajeroturing;
import vista.Inicio;

//Esta es la clase principal que se encarga de inicializar todo el programa/sistema
public class CajeroTuring {
//Este es el método principal del programa que inicializa la ventana de inicio del cajero (ventana de selección de idioma)
    public static void main(String[] args) {
        Inicio formInicio = new Inicio();
        formInicio.setVisible(true);
    }
    
}
