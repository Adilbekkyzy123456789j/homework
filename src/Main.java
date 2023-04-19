import java.awt.geom.Area;

import static java.lang.Math.sqrt;
import static jdk.internal.org.jline.utils.Colors.s;

public class Main {
    public static void main(String[] args) {

        Uchburchtuk area = new Uchburchtuk();
        area.a = 5;
        area.b = 6;
        area.c = 7;



        System.out.println("Площадь треугольника " + area.a);
        System.out.println("Высота треугольника"+area.b);
        System.out.println("Длина треугольника"+area.c) ;

        double s = (area.a  + area.b + area.c )/2;

        System.out.print("Площадь треугольника" +s);

        }
    }

