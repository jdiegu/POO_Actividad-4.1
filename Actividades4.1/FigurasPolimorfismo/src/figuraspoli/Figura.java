package figuraspoli;

abstract class  Figura{
    protected float b,a;

    public Figura(float b, float a) {
        this.b = b;
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }
    
public abstract float getArea();
public abstract float getPerimetro();
}

