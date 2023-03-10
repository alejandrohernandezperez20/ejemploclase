public class Socio extends Cliente{
    private String carnet;
    private final double descuento=20;
    private static int maximodescuento=0;

    public Socio(String nombre, String pelicula, String numentrada,String carnet) {
        super(nombre, pelicula, numentrada);
        this.carnet = carnet;
    }

    public void Pagar() {
        if(maximodescuento>=4){
            importe=importenor;
            totalrecaudado+=importe;
        }
        else{
            importe=importenor-((importenor*descuento)/100);
            totalrecaudado+=importe;
        }
          maximodescuento++;
    }


    @Override
    public String toString() {
        return "Socio carnet="+carnet+" "+super.toString();
    } 

}
