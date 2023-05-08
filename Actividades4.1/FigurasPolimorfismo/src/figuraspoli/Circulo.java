package figuraspoli;

public class Circulo extends Figura {
 
    public Circulo(float radio){
        super(radio , radio);
    }
        
    public float getArea(){
        return (float)3.1416 * (super.getB()*super.getB());
    }
        
    public float getPerimetro(){
        return (float) (2 * 3.1415) * super.getB();
    }
    
    public String soyCirculo(){
        return "\nEl es un circulo";
    }
}
