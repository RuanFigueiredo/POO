
package ultraemojicombate;


public class UltraEmojicombate {

   
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0]= new Lutador("Pretty boy", "França", 31, 1.75f, 68.9f,11,2,1);
         l[1]= new Lutador("taty girl", "Jamaica", 21, 1.49f, 77.9f,11,2,1);
          l[2]= new Lutador("juninho play", "Dinamarca", 32, 1.44f, 48.9f,11,2,1);
           l[3]= new Lutador("furacão katrina", "Alemanha", 33, 1.80f, 108.9f,11,2,1);
            l[4]= new Lutador("tempestade", "Brasil", 36, 1.74f, 111.9f,11,2,1);
             l[5]= new Lutador("Cyclope", "Mongólia", 21, 1.79f, 80.9f,11,2,1);
             
        
        l[3].status();
       
        
    }
    
}
