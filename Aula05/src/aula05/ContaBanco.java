
package aula05;

public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status; 
    //métodos personalizados
    public void estadoAtual(){
        System.out.println("----------------");
        System.out.println("Conta:"+ this.getNumConta());
        System.out.println("Tipo:"+this.getTipo());
        System.out.println("Dono:"+this.getDono());
        System.out.println("Saldo:"+this.getSaldo());
        System.out.println("Status:"+this.getStatus()); 
    }
   
    public void abrirConta(String t){
       this.setTipo(t);
       this.setStatus(true);
        if (t=="cc") {
            this.setSaldo(50);
        } else if(t=="cp") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if (getSaldo()>0){
            System.out.println("conta não pode ser fechada, tem grana");
        } else if(getSaldo()<0) {
            System.out.println("conta não pode ser fechada, tem débito");
        }else{
            this.setStatus(false);
            System.out.println("conta fechada com sucess");
        }
    }
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()+v);
            System.out.println("deposito realizado na conta de"+ this.getDono());
        } else {
                System.out.println("impossível depositar em uma conta fechada");
        }
    }
    public void sacar(float v){
        if (this.getStatus()) {
            
        } else {
        }
        }
    public void pagarMensal(){
        
    }
    
// métodos especiais

    public ContaBanco() {
        this.saldo=0;
        this.status=false;
    }
    
    
    
    public int getNumConta() {
       return numConta; 
    }
    public void setNumConta(int numConta){
        this.numConta= numConta;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public String getDono(){
        return dono;
    }
    public void setDono(String dono){
        this.dono=dono;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo= saldo;
    }
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status=status;
    }
}   
    
    
    
    

