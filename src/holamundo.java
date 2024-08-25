import java.util.Scanner;
public class holamundo {
    public static void main(String[] args) {
        int numeroA = 0;
        int numeroB = 0;

        System.out.println("ingrese un numeroA cualquiera");
        Scanner NumeroIngresadoA = new Scanner(System.in);
        numeroA = NumeroIngresadoA.nextInt();

        System.out.println("ingrese un numeroB cualquiera");
        Scanner NumeroIngresadoB = new Scanner(System.in);
        numeroB = NumeroIngresadoB.nextInt();

        System.out.println("la suma de A y B es:" + (numeroA+numeroB));

        System.out.println("la resta de A menos B es=" + (numeroA - numeroB));

        System.out.println("El producto de A por B es=" + (numeroA * numeroB));

        System.out.println("la division entera de A por B es=" + (numeroA / numeroB));

        NumeroIngresadoA.close();
        NumeroIngresadoB.close();

    }
}
