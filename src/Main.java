import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = "";
        int contador = 0;
        SpaceShip nave = null;
        while (!menu.equals("Q")){
            System.out.println("1.      Creación de la nave");
            System.out.println("2.      Representación de la nave");
            System.out.println("3.      Acelerar la nave");
            System.out.println("4.      Frenar la nave");
            System.out.println("5.      Parar la nave");
            System.out.println("Q   Para salir");
            System.out.print("Introduzca una opción: ");
            menu = sc.nextLine();
            switch (menu){
                case "1":
                    if (contador >= 1){
                        System.out.println("-------------------------------");
                        System.out.println(SpaceShip.RED +"NO HAY MAS ESPACIO EN EL HANGAR" + SpaceShip.RESET);
                        System.out.println("-------------------------------");
                    }else {
                        System.out.print("Introduce el nombre de la nave: ");
                        String nombre = sc.nextLine();
                        System.out.print("Introduce la matrícula de la nave: ");
                        String matricula = sc.nextLine();
                        System.out.print("Introduce la aceleración de la nave: ");
                        float aceleracion = sc.nextFloat();
                        sc.nextLine();
                        nave = new SpaceShip(nombre, matricula, aceleracion);
                        contador++;
                        System.out.println("-------------------------------");
                        System.out.println(SpaceShip.RED +"NAVE CREADA CON ÉXITO" + SpaceShip.RESET);
                        System.out.println("-------------------------------");
                    }
                    break;
                case "2":
                    if(contador <= 0){
                        System.out.println(SpaceShip.RED + "------------------");
                        System.out.println("No hay nave creada");
                        System.out.println("------------------" + SpaceShip.RESET);
                    }else{
                        System.out.println(nave);
                    }
                    break;
                case "3":
                    if(contador <= 0){
                        System.out.println(SpaceShip.RED + "------------------");
                        System.out.println("No hay nave creada");
                        System.out.println("------------------" + SpaceShip.RESET);
                    }else{
                        nave.speedUp();
                    }
                    break;
                case "4":
                    if(contador <= 0){
                        System.out.println(SpaceShip.RED + "------------------");
                        System.out.println("No hay nave creada");
                        System.out.println("------------------" + SpaceShip.RESET);
                    }else{
                        nave.brake();
                    }
                    break;
                case "5":
                    if(contador <= 0){
                        System.out.println(SpaceShip.RED + "------------------");
                        System.out.println("No hay nave creada");
                        System.out.println("------------------" + SpaceShip.RESET);
                    }else{
                            nave.emergencyStop();
                            System.out.println(SpaceShip.RED + "PARADA DE EMERGENCIA REALIZADA");
                        System.out.println("-----------------------------------------------------" + SpaceShip.RESET);
                    }
                    break;
                case "Q":
                    System.out.println("Saliendo de la nave...");
                    break;
                default:
                    System.out.println(SpaceShip.RED + "------------------");
                    System.out.println("VALOR INCORRECTO");
                    System.out.println("------------------" + SpaceShip.RESET);
                    break;
            }
        }
    }
}
