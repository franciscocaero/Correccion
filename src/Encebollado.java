public class Encebollado extends ComidaTipica{
    double calificacion;
    public Encebollado(String nombre, String region, double precio) {
        super(nombre, region, precio);
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void cali(){
        System.out.println("Mi calificación del "+this.getNombre()+" es de: "+this.getCalificacion());
    }
}
