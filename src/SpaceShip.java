public class SpaceShip {
    private String nombre;
    private String matricula;
    private float aceleracion;
    private float velocidadX;
    private float velocidadY;
    private int coordenadaX;
    private int coordenadaY;
    private int direccionX;
    private int direccionY;
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";

    public SpaceShip(String nombre, String matricula, float aceleracion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.aceleracion = aceleracion;
        this.velocidadX = 0;
        this.velocidadY = 0;
        this.coordenadaX = 0;
        this.coordenadaY = 0;
        this.direccionX = 1;
        this.direccionY = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }

    public float getVelocidadX() {
        return velocidadX;
    }

    public void setVelocidadX(float velocidadX) {
        this.velocidadX = velocidadX;
    }

    public float getVelocidadY() {
        return velocidadY;
    }

    public void setVelocidadY(float velocidadY) {
        this.velocidadY = velocidadY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getDireccionX() {
        return direccionX;
    }

    public void setDireccionX(int direccionX) {
        this.direccionX = direccionX;
    }

    public int getDireccionY() {
        return direccionY;
    }

    public void setDireccionY(int direccionY) {
        this.direccionY = direccionY;
    }
    public void speedUp(){
        velocidadX += this.aceleracion;
        System.out.println("Velocidad en X: " + velocidadX);

        //velocidadY += this.aceleracion;
        //System.out.println("Velocidad en Y: " + velocidadY);

        coordenadaX += velocidadX;
        System.out.println("Posicón en X: " + coordenadaX);

        //coordenadaY += velocidadY;
        //System.out.println("Posicón en X: " + coordenadaY);
    }

    public void brake(){
        if (velocidadX > 0){
            velocidadX -= this.aceleracion;
        }else{
            velocidadX = 0;
        }
        System.out.println("Velocidad en X: " + velocidadX);

        //if (velocidadY > 0){
        //    velocidadY -= this.aceleracion;
        //}else{
        //    velocidadY = 0;
        //}
        //System.out.println("Velocidad en Y: " + velocidadY);
        if (coordenadaX > 0) {
            coordenadaX += velocidadX;
        }else{
            coordenadaX = 0;
        }
        System.out.println("Posicón en X: " + coordenadaX);

        /*if (coordenadaY > 0) {
            coordenadaY += velocidadX;
        }else{
            coordenadaY = 0;
        }
        System.out.println("Posicón en Y: " + coordenadaY);*/
    }

    public void emergencyStop(){
        velocidadX = 0;
        System.out.println("Velocidad en X: " + velocidadX);
        //velocidadY = 0;
        //System.out.println("Velocidad en Y: " + velocidadY);
    }

    @Override
    public String toString() {
        return "Nombre de la nave: " + nombre + "\n"+ "Matricula de la nave: " + matricula + "\n" + "Nave: \n" +
        RED + "                   `. ___\n" +
                "                    __,' __`.                _..----....____\n" +
                "        __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\n" +
                "  _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\n" +
                ",'________________                          \\`-._`-','\n" +
                " `._              ```````````------...___   '-.._'-:\n" +
                "    ```--.._      ,.                     ````--...__\\-.\n" +
                "            `.--. `-`                       ____    |  |`\n" +
                "              `. `.                       ,'`````.  ;  ;`\n" +
                "                `._`.        __________   `.      \\'__/`\n" +
                "                   `-:._____/______/___/____`.     \\  `\n" +
                "                               |       `._    `.    \\\n" +
                "                               `._________`-.   `.   `.___\n" +
                "                                                  `------'`";
    }
}
