public class Pase extends Cliente{
    private static int numentradagratuita;

    public Pase(String nombre, String pelicula,String numentrada) {
        super(nombre, pelicula, numentrada);
    }

    public static void setNumentradagratuita(int numentradagratuita) {
        Pase.numentradagratuita = numentradagratuita;
    }

    public void Pagar(){
        if(numentradagratuita==0){
            importe=importenor;
            totalrecaudado+=importenor;
        }
        else{
            importe=0;
            numentradagratuita--;
        }
    }

    @Override
    public String toString() {
        return "Pase "+super.toString();
    }
    
}
