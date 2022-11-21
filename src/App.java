import java.util.Locale;
import java.util.Scanner;

//problama exemplo
/*
    Fazer um programa para ler as medidas dos lados  de dois triângulo X e Y (suponha medidas válidas).
    Em seguida , mostra o valor das áreas dos dois trângulos e dizer qual dos dois triângulos possui a mior área.
        A fórmula para calcular a área de um triângulo a partir  das medidas de seus lados a, b e c é a seguinmte (fórmula de Heron):
              _________________________               a+b+c
    area =  \/ p(p - a)(p - b)(p - c)       onde p= ----------
                                                        2
*/ 
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        System.out.println("Enter the measure of triangle X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measure of triangle Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        double pX = ((xA + xB + xC) / 2.0);
        double areaX = Math.sqrt(pX * (pX - xA) * (pX- xB) * (pX - xC));
        double pY = ((yA + yB + yC) / 2.0);
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Trinagle Y area: %.4f%n", areaY);
        if(areaX > areaY){
            System.out.println("Large area: X");
        }
        else{
            System.out.println("Large area:Y");
        }
        sc.close();
    }
}
