
package aula.pkg02;
public class Caneta {
   
    String modelo;
    String cor;
    Float ponta;
    int carga;
    Boolean tampada;
    void status(){
        System.out.println("A caneta é "+ this.cor);
        System.out.println("Está tampada? "+ this.tampada);
        System.out.println("a ponta dessa caneta é "+this.ponta);
        System.out.println("o modelo dessa caneta é "+ this.modelo);
    }
    
    void rabiscar (){
      if(this.tampada==true){
          System.out.println("error");
      }else{
          System.out.println("bora rabiscar");
      }
    }
    void tampar(){
        this.tampada=true;
    }
    void destampar(){
        this.tampada= false;
    }
}
