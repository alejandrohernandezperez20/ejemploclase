public class Normal extends Cliente{

    public Normal(String nombre, String pelicula,String numentrada) {
        super(nombre, pelicula, numentrada);
    }
    
    public void Pagar() {
        importe=importenor;
        totalrecaudado+=importe;
    }

    @Override
    public String toString() {
        return "Normal "+super.toString();
    }
    
}
