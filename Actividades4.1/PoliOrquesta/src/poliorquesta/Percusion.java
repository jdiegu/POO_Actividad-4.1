package poliorquesta;
public class Percusion extends Instrumento{
    //No tiene atributos
    public Percusion(String nombre , String ruta){
        super(nombre, ruta);
    }
    
    public void afinar(){
        System.out.println("Afinando.....");
        System.out.println("Afinado");
    }
    
    @Override
    public void tocar(){ 
        System.out.println("\tToca\t"+"DO"+"\n");
    }
    
    @Override
    public void sonido() throws Exception{
        super.sonido();
    }
}
