import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner miVariable=new Scanner(System.in);
        ArrayList<String> Comidas=new ArrayList<String>();
        Repe r1=new Repe("Repe","Loja",2.15);
        Encebollado ceb1=new Encebollado("Encebollado","Guayas",3.25);
        Hornado hor1=new Hornado("Hornado","Pichincha",2.25);
        Encocado coc1=new Encocado("Encocado ","Esmeraldas",1.50);
        ComidaTipica com1=new ComidaTipica("Tigrillo","El Oro",1.50);

        Comidas.add(r1.nombre);
        Comidas.add(r1.region);
        Comidas.add(ceb1.nombre);
        Comidas.add(ceb1.region);
        Comidas.add(hor1.nombre);
        Comidas.add(hor1.region);
        Comidas.add(coc1.nombre);
        Comidas.add(coc1.region);
        Comidas.add(com1.nombre);
        Comidas.add(com1.region);


        System.out.println("Elementos del array: ");
        for (int i=0; i<10;i++){
            System.out.println(Comidas.get(i));
        }


        try{
            System.out.println("\nIngrese la calificación para: "+ceb1.getNombre());
            double calEn= miVariable.nextDouble();
            ceb1.setCalificacion(calEn);
        }
        catch (Exception e){
            System.out.println("Ingresaste un valor incorrecto ");
        }
        finally {
            System.out.println("Gracias por usar el programa ");
        }


        System.out.println("\nResultados de algunos getters y metodos: ");

        System.out.println(hor1.getNombre());
        System.out.println(coc1.getPrecio());
        System.out.println(com1.getRegion());
        if (ceb1.getCalificacion()!=0.0) {
            System.out.println(ceb1.getCalificacion());

        }
        r1.comer();
        hor1.gustar();
        coc1.favor();
        if (ceb1.getCalificacion()!=0.0) {
            ceb1.cali();
        }

    }
}
