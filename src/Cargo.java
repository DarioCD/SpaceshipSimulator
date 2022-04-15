public class Cargo extends SpaceShip{
    private int cargaMaxima;

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
}
