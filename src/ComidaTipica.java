public class ComidaTipica {
    public String nombre;
    public String region;
    public double precio;

    public ComidaTipica(String nombre, String region, double precio) {
        this.nombre = nombre;
        this.region = region;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void comer (){
        System.out.println("Estoy comiendo "+this.getNombre()+". Es un plato de "+this.getRegion());
    }
    public void precioComida(){
        System.out.println("El plato "+this.getNombre()+" me costó "+this.getRegion());
    }
}
