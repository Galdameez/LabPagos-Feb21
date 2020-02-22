package Entidades;

public class Cliente {
    private String id;
    private double monto;
    
    public void restarSaldo(double saldo){
        if(this.monto - saldo < 0){
            
        }
        else{
               this.monto -= saldo;
        }
     
    }
    
    public Cliente(String id, double monto) {
        this.id = id;
        this.monto = monto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
