import java.util.Scanner;


public class Ejecutable {
    public static void maim(){
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el radio :");
        float r = inputValue.nextFloat()
        float resultadoLongitud = Circulo.calcularLongitud(r);
        float resultadoArea = Circulo.calcularLongitud(r);
        System.out.println("La longitud de la circunferencia es: " + resultadoLongitud);
        System.out.println("El área de la circunferencia es: " + resultadoArea);
        Circulo uncirculo = new Circulo(10);
        System.out.println("La longitud es :" +Circulo.calcularLongitud(float r);
        System.out.println("El área es :" + Circulo.calcularArea(float r));




    }
}
