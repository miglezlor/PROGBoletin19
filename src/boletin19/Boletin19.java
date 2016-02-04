package boletin19;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buzon lista = new Buzon();
        
        lista.engade(new Correo ("blabla", false));
        lista.engade(new Correo ("ASDASADASD", true));
        lista.engade(new Correo ("klwkdoodk", false));
        lista.engade(new Correo ("qwqreqeqe", false));
        lista.engade(new Correo ("dwjdiwjdijwwji", true));
        
        lista.numeroDeCorreos();
        lista.porLer();
        lista.muestraPrimeroNoLeido();
        lista.amosar(2);
        lista.eliminar(3);
        lista.numeroDeCorreos();
        
    }
    
}
