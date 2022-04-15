import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre de la nave: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce la matrícula de la nave: ");
        String matricula = sc.nextLine();
        System.out.print("Introduce la aceleración de la nave: ");
        float aceleracion = sc.nextFloat();
        System.out.print("Inotroduce el número maximo de containers: ");
        int maximoContenedores = sc.nextInt();
        SpaceShip nave = new SpaceShip(nombre, matricula, aceleracion);
        Cargo cargo = new Cargo(nombre, matricula, aceleracion,maximoContenedores);
    }
}
