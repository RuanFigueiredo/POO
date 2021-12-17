
package aula.pkg04;


class Caneta {
    public String modelo;
    private float ponta;
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void status(){
        System.out.println("sobre a caneta");
        System.out.println("modelo é "+ this.modelo);
        System.out.println("a ponta é "+this.ponta);
    }
    
}
