package boletin19;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import sun.awt.X11.XConstants;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Buzon {
    ArrayList <Correo> listaCorreos = new ArrayList();
    
    public int numeroDeCorreos(){
        int numCorreos = listaCorreos.size();
        System.out.println("Numero de correos: "+numCorreos);
        return numCorreos;
        
    }
    
    public void engade(Correo c){
        listaCorreos.add(c);
    }
    
    public boolean porLer(){
        int cont=0;
        for (int i=0;i<listaCorreos.size();i++){
            if (listaCorreos.get(i).isLeido()==false)
                cont++;
        
        }
        if (cont>0){
            System.out.println("Hay "+cont+" sin leer");
            return true;
        }   
        else{
            System.out.println("No hay correos sin leer.");
            return false;
        }
            
    }
    
    public String muestraPrimeroNoLeido(){
        String texto="";
        for (int i=0;i<listaCorreos.size();i++){
            if (listaCorreos.get(i).isLeido()==false){
                texto=texto + listaCorreos.get(i).getContenido();
                i = listaCorreos.size();
            }
        }
        System.out.println("Primer mensaje sin leer: "+texto);
        return texto;
    }
    
       public String amosar(int k){
           String texto = listaCorreos.get(k).getContenido();
           System.out.println("Contenido del mensaje deseado: "+texto);
           return texto;
           
       }
       
       public void eliminar(int k){
           listaCorreos.remove(k);
           System.out.println("---Eliminamos o correo da posicion "+k+" ---");
       }
}
