public class Encocado extends ComidaTipica{

    public Encocado(String nombre, String region, double precio) {
        super(nombre, region, precio);
    }
    public void favor(){
        System.out.println("\nMi plato favorito es el "+this.getNombre()+" Cuesta "+this.getPrecio());
    }
}

