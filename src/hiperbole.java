
public class hiperbole {
    private double a_hip,b_hip, c_hip ,Lr_hip;//Variables

    //Punto a,b
    public hiperbole() {
        double a=0,b = 0;
        this.a_hip = a;
        this.b_hip = b;
    }
//SETTERS y GETTERS//

    public void setA(double a) {
        this.a_hip = a;
    }

    public void setB(double b) {
        this.b_hip = b;
    }

    public void variables(){
        a_hip = Math.sqrt(this.a_hip);
        b_hip = Math.sqrt(this.b_hip);
        c_hip = Math.sqrt((this.a_hip*this.a_hip)+(this.b_hip*this.b_hip));
        Lr_hip = ((2*(this.b_hip*this.b_hip))/this.a_hip);
        //Mensaje de coordenadas tomadas
        System.out.println("Se toma en cuenta el centro (0,0)");
        System.out.println("En el eje Y tanto hacia arriba y abajo: " + this.a_hip);
        System.out.println("En el eje x tanto hacia derecha e izquierda: " + this.b_hip);
        System.out.println("Con estas coordenadas se dibuja un rectangulo donde se generan las asintotas al momento de trazar una cruz entre los vertices contrarios");
        System.out.println("Se traza una linea horizontal desde el punto (-" + (this.Lr_hip/2) + "," + (this.c_hip) + ") hasta (" + (this.Lr_hip/2) + "," + (this.c_hip) + ")");
    }
}
