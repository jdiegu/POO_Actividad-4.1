package figuraspoli;

import jopi.JOPI;


public class CreaFiguras {
    public Cuadrado creaCuadrado(){
        float base;
        base=JOPI.flotante("cual es la medida del lado del cuadrado");
        return new Cuadrado(base,0F);
    }
    
     public Rectangulo creaRectangulo(){
        float base, altura;
        base=JOPI.flotante("cual es la medida base del rectangulo");
        altura=JOPI.flotante("cual es la medida altura del rectangulo");
        return new Rectangulo(base,altura);   
    }
     
     public Circulo creaCirculo(){
         float radio;
         radio = JOPI.flotante("Cual es la medida del radio del circulo");
         return new Circulo(radio);
     }
    
}
