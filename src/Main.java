import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int radio=0;
        float divisor;
        double resultado;
        System.out.println("Ingrese el radio de la esfera: favor de tener en cuenta que debe ser mayor a 0");
        Scanner numero=new Scanner(System.in);
        radio=numero.nextInt();

        System.out.println("gracias por ingresar datos,");
        System.out.println("La superficie de la esfera es:"+ (3.14 * radio * radio));
        System.out.println((float)4/3);
        divisor =(float) 4/3;
        resultado = (3.14 * (divisor) * (radio * radio * radio));

        System.out.println("EL volumen de la esfera es:" + resultado);
        numero.close();
    }
}