package figuraspoli;

import java.util.Random;

public class FigurasPoli {
    public Figura vFig[];
    
    public FigurasPoli(){
        vFig=new Figura[5];
    }
  
    public void llena(){
         CreaFiguras objCreador=new CreaFiguras();
         Random r=new Random();
         for (int i = 0; i < vFig.length; i++) {
             int op=(int) r.nextInt(3)+1;
             System.out.println("se genero: "+op+"\n");
             switch(op){
                 case 1:vFig[i]=objCreador.creaCuadrado();break;
                 case 2:vFig[i]=objCreador.creaRectangulo();break;
                 case 3:vFig[i]=objCreador.creaCirculo();break;
             }
            
        }
         
    }
    
    public void muestra() { 
        try{
            for (Figura vFig1 : vFig) {
                String s="Los datos";
                if (vFig1.getClass().getSimpleName().equals("Cuadrado")) {
                    Cuadrado cuad = (Cuadrado) vFig1;
                    s=s+cuad.yoMismoSquare();
                } else {
                
                    if( vFig1.getClass() == Rectangulo.class ){
                        Rectangulo rect = (Rectangulo) vFig1;
                        int a = rect.tuMismoRectangle();
                    }
                    else
                    {
                        Circulo cir = (Circulo) vFig1;
                        s+=cir.soyCirculo();
                    }
                }
                
                s += "\n"+vFig1.getArea() + "   " + vFig1.getPerimetro() + "\n";
                System.out.println(s);
            }
                
        }
        catch(NullPointerException e){
            System.out.println("El elemento no se almaceno en el vector");
        }
    }
    
    /*
    public void muestra() {
        String s="Los datos \n";
        try{
            for (int i=0; i<vFig.length; i++) {
                if (vFig[i] instanceof Cuadrado) {
                    //Cuadrado cuad = (Cuadrado) vFig[1];
                    s=s+ vFig[i].yoMismoSquare(); 
                } else {
                   // Rectangulo rect = (Rectangulo) vFig[1];
                    s=s+ vFig[i].tuMismoRectangle();
                }
                s += " " + vFig[i].getArea() + "   " + vFig[i].getPerimetro() + "\n";
                System.out.println(s);
            }
                
        }
        catch(NullPointerException e){
            System.out.println("El elemento no se almaceno en el vector");
        }
    }
    */
    public static void main(String[] args) {
       FigurasPoli objPoli= new FigurasPoli();
       objPoli.llena();
       objPoli.muestra();
    }
    
}
