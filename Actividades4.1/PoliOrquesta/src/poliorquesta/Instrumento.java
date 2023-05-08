package poliorquesta;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

abstract class Instrumento {
    //Esta clase base es abstracta
    //Pues contiene un metodo que no se ha implementado
    private String n , ruta;
    
    public Instrumento (String n , String ruta){
        this.n=n;
        this.ruta=ruta;
    }
    
    public String getn(){
        return n;
    }
    
    public void queEs(){
        System.out.println("Instrumento\t"+getn());
    }
    
    public void sonido() throws Exception{
        File sound= new File(ruta);
        AudioInputStream audio = AudioSystem.getAudioInputStream(sound);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);
        clip.start();
        Thread.sleep(clip.getMicrosecondLength()/1000);
    }
    
    public abstract void tocar();//metodo abstracto que no tiene codigo
                                //se implementara hasta cada una de las clases derivadas
}