package application;
import java.util.Locale;
import java.util.Scanner;

import application.entities.Triangle;

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
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Enter the measure of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measure of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        System.out.printf("Triangle X area: %.4f%n", x.area());
        System.out.printf("Trinagle Y area: %.4f%n", y.area());
        if(x.area() > y.area()){
            System.out.println("Large area: X");
        }
        else{
            System.out.println("Large area:Y");
        }
        sc.close();
    }
}
