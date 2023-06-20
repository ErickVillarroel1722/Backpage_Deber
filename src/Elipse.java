
public class Elipse {
    // Creacion de los atributos

    private double eje_mayor;
    private  double eje_menor;

    // Generar el constructor
    public Elipse() {

        this.eje_mayor = eje_mayor;
        this.eje_menor = eje_menor;
    }


    public double getEje_mayor() {
        return eje_mayor;
    }

    public void setEje_mayor(double eje_mayor) {
        this.eje_mayor = eje_mayor;
    }

    public double getEje_menor() {
        return eje_menor;
    }

    public void setEje_menor(double eje_menor) {
        this.eje_menor = eje_menor;
    }

    public double area_elipse(){
        double area = Math.PI*this.eje_mayor*this.eje_menor;
        return area;
    }

    public double perimetro_elipse(){
        double perimetro = (Math.PI * 3*(this.eje_mayor + this.eje_menor) - Math.sqrt((3*this.eje_mayor+this.eje_menor)*(this.eje_mayor+ (3*this.eje_menor))));
        return perimetro;
    }
}
