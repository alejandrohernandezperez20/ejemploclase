public class Cliente{
    private String nombre,pelicula,numentrada;
    protected final double importenor=10;
    protected double importe;
    private static int salas[]={40,40};
    protected static double totalrecaudado;

    public Cliente(String nombre, String pelicula, String numentrada) {
        this.nombre = nombre;
        this.pelicula = pelicula;
        this.numentrada = numentrada;
    }

    public void Pagar(){
        
    }

    public static void Salas1(){
        int sala1=salas[0];
            System.out.println("Sala 1 tiene:"+sala1+" personas");
    }

    public static void Salas2(){
        int sala2=salas[1];
            System.out.println("Sala 2 tiene:"+sala2+" personas");
    }

    public static double getTotalrecaudado() {
        return totalrecaudado;
    }

    public double getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", pelicula=" + pelicula + ", numentrada=" + numentrada + ", importe="
                + importe + "]";
    }

    public static boolean Sala(int s){
        if(salas[s]>=1){
            salas[s]--;
            return true;
        }
        else
            return false;
    }
    
}
