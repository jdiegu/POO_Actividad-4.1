package figuraspoli;

class Cuadrado extends Figura{

    public Cuadrado(float b, float a) {
        super(b, a);
    }
    
 @Override
    public float getArea(){
    return super.getB()*super.getB();
}
    
  @Override
    public float getPerimetro(){
    return super.getB()*4;
}
    
    public String yoMismoSquare(){
        return "\nYO mismo soy CUADRADO";
    }
}
