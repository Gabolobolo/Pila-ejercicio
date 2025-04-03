import javax.swing.*;
import java.util.Stack;

public class Pila {
    private Stack<String> arreglo;
    public Pila() {
        arreglo = new Stack<String>();
    }
    public void apilar(String dato){
            arreglo.push(dato);
    }
    public String desapilar() throws Exception{
        if (arreglo.isEmpty()) {
                throw new Exception("Error al desapilar. La pila esta vacia.");
        }
        return arreglo.pop();

    }
    public String cima() throws Exception{
        if (arreglo.isEmpty()) {
            throw new Exception("Error al mostrar el ultimo elemento. La pila esta vacia.");
        }
        return arreglo.peek();
    }

    public String mostrar(){
        StringBuilder cadena = new StringBuilder();
        for(int indice= arreglo.size() - 1; indice >= 0; indice--){
            cadena.append(arreglo.get(indice)+"\n");
        }
        return cadena.toString();
    }
}
