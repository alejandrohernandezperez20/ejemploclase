import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class App {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String nombre,pelicula,entrada;
        Vector<Cliente> cliente=new Vector<Cliente>();
        Vector<Taquilla> taquilla=new Vector<Taquilla>();
        int numcant,opc,tipo,ncl=0,pagcol=0,sala;
        boolean disponible;
        sc.useLocale(Locale.ENGLISH);
        taquilla.add(new Taquilla());
        do{
        System.out.println("Anota numero entradas gratis para el cliente pase:");
        numcant=sc.nextInt();
        }while(numcant>=40);
        Pase.setNumentradagratuita(numcant);
        do{
        System.out.println("1.Alta al cliente");
        System.out.println("2.Comprar entrada");
        System.out.println("3.Mostrar informacion del cine");
        System.out.println("4.Salir");
        opc=sc.nextInt();
       
        switch (opc) {
            case 1:
                sc.nextLine();
                System.out.print("Anota nombre de la persona: ");
                nombre=sc.nextLine();
                System.out.print("Anota pelicula: ");
                pelicula=sc.nextLine();
                System.out.print("Anota numero de entrada: ");
                entrada=sc.nextLine();
                do{
                System.out.println("Eres cliente \n 1.Normal\n 2.Socio\n 3.Pase");
                tipo=sc.nextInt();
                }while(tipo<1 || tipo>3);
                if(tipo==1){
                    Cliente clien=new Normal(nombre, pelicula, entrada);
                    cliente.add(clien);
                    taquilla.get(0).llegarCola(clien);
                }
                if(tipo==2){
                    sc.nextLine();
                    System.out.print("Anota carnet: ");
                    String carnet=sc.nextLine();
                    Cliente clien=new Socio(nombre, pelicula, entrada, carnet);
                    cliente.add(clien);
                    taquilla.get(ncl).llegarCola(clien);
                }
                if(tipo==3){
                    Cliente clien=new Pase(nombre, pelicula, entrada);
                    cliente.add(clien);
                    taquilla.get(0).llegarCola(clien);
                }
                ncl++;
                break;
            case 2:
            if(ncl==0){
                System.out.println("No hay gente haciendo espera en la cola");
            }
            else{
            do{
               System.out.print("Sala en la que quieres estar: ");
                sala=sc.nextInt();
            }while(sala<0 || sala>1);
                disponible=Cliente.Sala(sala);
               if(disponible==false){
                System.out.println("Esta sala esta llena");
               }
               else{
               cliente.get(pagcol).Pagar();
               System.out.println(cliente.get(pagcol).getImporte());
               pagcol++;
               taquilla.get(0).SalirCola();
               ncl--;
               }
            }
                break;
            case 3:
               System.out.println(taquilla.toString());
               Cliente.Salas1();
               Cliente.Salas2();
               System.out.println(Cliente.getTotalrecaudado());
                break;
            case 4:
                System.out.println("Fin del programa");
                break;
            default:
            System.out.println("Error");
                break;
        }
    }while(opc!=4);
    }
}
