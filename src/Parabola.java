

public class Parabola {
    //Variables
    private float ejex; //eje x coordenadas
    private float ejey; //eje y coordenadas
    private float a; //parametro a
    private float b; //parametro b
    private float c; //parametro c


    //Constructores
    public Parabola() {
        this.ejex = ejex;
        this.ejey = ejey;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método calcular el vertice X, ingresar manualmente los valores de a y b
    public float Parabola_Equipo2_VerticeX(float a, float b){
        return this.ejex = (b/(2*a));
    }
    // Método calcular el vertice Y ingresar manualmente los valores a y b y c
    public float Parabola_Equipo2_VerticeY(float a, float b, float c){
        return this.ejey = (a*(ejex)*(ejex)+b*(ejex)+c);
    }
    public void Parabola_Equipo2_ImpVer(){
        System.out.println("La coordenada del vértice es: "+"("+this.ejex+","+this.ejey+")");
    }


    //Setters y getters
    public float getEjex() {
        return ejex;
    }

    public void setEjex(float ejex) {
        this.ejex = ejex;
    }

    public float getEjey() {
        return ejey;
    }

    public void setEjey(float ejey) {
        this.ejey = ejey;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
}
