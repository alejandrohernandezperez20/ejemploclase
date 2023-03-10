import java.util.Vector;

public class Taquilla {
    private Vector<Cliente> cola;

    public Taquilla() {
        cola=new Vector<Cliente>();
    }

    public void llegarCola(Cliente c){
        cola.add(c);
    }
    
    public void SalirCola(){
        cola.remove(0);
    }

    @Override
    public String toString() {
        return "Taquilla [cola=" + cola + "]";
    }
    
    
}
