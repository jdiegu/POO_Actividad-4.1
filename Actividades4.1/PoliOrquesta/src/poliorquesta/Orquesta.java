package poliorquesta;

public class Orquesta {
    public Percusion generaPercusion(String nombre , String ruta){
        return new Percusion(nombre, ruta);
    }
    
    public Viento generaViento(String nombre, String ruta){
        return new Viento(nombre, ruta);
    }
    
    public static void main(String[] a) throws Exception{
        Orquesta objOrquesta = new Orquesta();
        Instrumento orques[] = new Instrumento[3];
        
        orques[0] = objOrquesta.generaPercusion("Timbal", "./src/poliorquesta/timbal.wav");
        orques[1] = objOrquesta.generaViento("Trompeta", "./src/poliorquesta/trompeta.wav");
        orques[2] = objOrquesta.generaPercusion("Platillo", "./src/poliorquesta/platillo.wav");
        
        for( Instrumento inst : orques){
            
            inst.queEs();
            inst.tocar();
            
            if( inst.getClass() == Percusion.class){
                Percusion per = (Percusion) inst;
                per.afinar();
                per.sonido();
                
            }else{
                Viento vie = (Viento) inst;
                vie.probando();
                vie.sonido();
            }
            System.out.println();
        }
        
    }
    
    
}
