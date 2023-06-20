import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- MENU PRINCIPAL -----");
            System.out.println("1. Circunferencia");
            System.out.println("2. Parábola");
            System.out.println("3. Elipse");
            System.out.println("4. Hipérbola");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    circunferencia_grupo2 circunferencia = new circunferencia_grupo2();

                    System.out.print("Ingrese el radio del círculo: ");
                    float radio = scanner.nextFloat();
                    circunferencia.setRadio_cir(radio);

                    System.out.print("Ingrese el ángulo central de la circunferencia: ");
                    float angulo = scanner.nextFloat();
                    circunferencia.setAngulo_central(angulo);

                    System.out.println("Perímetro de la circunferencia: " + circunferencia.perimetro_cir());
                    System.out.println("Área de la circunferencia: " + circunferencia.area_cir());
                    System.out.println("Ángulo inscrito en la circunferencia: " + circunferencia.angulo_inscrito_cir());
                    break;

                case 2:
                    Parabola parabola = new Parabola();

                    System.out.print("Ingrese el valor de a: ");
                    float a = scanner.nextFloat();
                    parabola.setA(a);

                    System.out.print("Ingrese el valor de b: ");
                    float b = scanner.nextFloat();
                    parabola.setB(b);

                    System.out.println("Ingrese el valor de c: ");
                    float c = scanner.nextFloat();
                    parabola.setC(c);

                    float verticeX = parabola.Parabola_Equipo2_VerticeX(a, b);
                    float verticeY = parabola.Parabola_Equipo2_VerticeY(a, b, c);

                    System.out.println("El vértice de la parábola es: (" + verticeX + ", " + verticeY + ")");
                    break;
                case 3:
                    Elipse elipse = new Elipse();

                    System.out.print("Ingrese el valor del eje mayor: ");
                    double ejeMayor = scanner.nextDouble();
                    elipse.setEje_mayor(ejeMayor);

                    System.out.print("Ingrese el valor del eje menor: ");
                    double ejeMenor = scanner.nextDouble();
                    elipse.setEje_menor(ejeMenor);

                    double area = elipse.area_elipse();
                    double perimetro = elipse.perimetro_elipse();

                    System.out.println("El área de la elipse es: " + area);
                    System.out.println("El perímetro de la elipse es: " + perimetro);
                    break;

                case 4:
                    hiperbole hip = new hiperbole();

                    System.out.print("Ingrese el valor de a: ");
                    double a1;
                    a1= scanner.nextDouble();
                    hip.setA(a1);

                    System.out.print("Ingrese el valor de b: ");
                    double b1= scanner.nextDouble();
                    hip.setB(b1);

                    hip.variables();
                    break;

                case 0:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }

            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
}

