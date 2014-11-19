package newpackage;
import java.util.HashMap;
import newpackage.esd;
/**
 *
 * @author Administrador
 */
public class es {
     public HashMap<Integer, String> ListaPalabras = new HashMap<Integer, String>();
    
     public es () {
        ListaPalabras.put(2, "Skirt");
        ListaPalabras.put(3, "Cheese");
        ListaPalabras.put(4, "people");
        ListaPalabras.put(5, "Answer");
        ListaPalabras.put(6, "Dictionary");
        ListaPalabras.put(7, "Glass");
        ListaPalabras.put(8, "Dance");
        ListaPalabras.put(9, "Horse");
        ListaPalabras.put(10, "Mouse");
        ListaPalabras.put(11, "Kiss");
    }

    public String buscador(int index) {
        return ListaPalabras.get(index);
    }
}
