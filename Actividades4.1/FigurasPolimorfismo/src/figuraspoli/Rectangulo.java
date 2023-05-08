package figuraspoli;

class Rectangulo extends Figura{

    public Rectangulo(float b, float a) {
        super(b, a);
    }
    
    @Override
    public float getArea(){
    return super.getB()*super.getA();
}
    
  @Override
    public float getPerimetro(){
    return super.getA()*2 + super.getB()*2;
}
    
    public int tuMismoRectangle(){
        System.out.println("Tu eres rectangulo");
        return 1;
    }
}