public class Cargo extends SpaceShip{
    private int cargaMaxima;
    private int contenedor;

    public Cargo(String nombre, String matricula, float aceleracion, int cargaMaxima) {
        super(nombre, matricula, aceleracion);
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getContenedor() {
        return contenedor;
    }

    public void setContenedor(int contenedor) {
        this.contenedor = contenedor;
    }

    public void load(){
        if (contenedor >= cargaMaxima){
            System.out.println("No se puede añadir mas contenedores, capacidad máxima alcanzada");
        }else{
            contenedor++;
        }
    }
    public void unload(){
        if (contenedor <= 0){
            System.out.println("No hay mas contenedores que quitar ");
        }else{
            contenedor--;
        }
    }
}
