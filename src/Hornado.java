public class Hornado extends ComidaTipica {
    public Hornado(String nombre, String region, double precio) {
        super(nombre, region, precio);
    }
    public void gustar(){
        System.out.println("\nMe gusta mucho el "+this.getNombre()+". Tiene un buen precio ");
    }
}
