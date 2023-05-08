package poliorquesta;
public class Viento extends Instrumento{
    //No tiene atributos
    public Viento(String nombre , String ruta){
        super(nombre,ruta);
    }
    
    public void probando(){
        System.out.println("Probando.....  listo");
    }
    
    @Override
    public void tocar(){
        System.out.println("\tToca\t"+"RE"+"\n");
    }
    
    @Override
    public void sonido() throws Exception{
        super.sonido();
    }
}