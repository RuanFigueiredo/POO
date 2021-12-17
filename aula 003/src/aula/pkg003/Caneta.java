package aula.pkg003;
public class Caneta {
   
    public String modelo;
    public String cor;
    private Float ponta;
    protected int carga;
    private Boolean tampada;
    void status(){
        System.out.println("A caneta é "+ this.cor);
        System.out.println("Está tampada? "+ this.tampada);
        System.out.println("a ponta dessa caneta é "+this.ponta);
        System.out.println("o modelo dessa caneta é "+ this.modelo);
        System.out.println("carga é "+this.carga);
    }
    
    public void rabiscar (){
      if(this.tampada==true){
          System.out.println("caneta tampada, não rabisca, ERROR");
      }else{
          System.out.println("bora rabiscar");
      }
    }
    public void tampar(){
        this.tampada=true;
    }
    public void destampar(){
        this.tampada= false;
    }
}
