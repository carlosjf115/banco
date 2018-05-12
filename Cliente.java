
package entidad;

public class Cliente {
    private int Idcliente;
    private String nombrecliente;
    private String nit;

    public Cliente() {
    }

    public Cliente(int Idcliente, String nombrecliente, String nit) {
        this.Idcliente = Idcliente;
        this.nombrecliente = nombrecliente;
        this.nit = nit;
    }

    public int getIdcliente() {
        return Idcliente;
    }

    public void setIdcliente(int Idcliente) {
        this.Idcliente = Idcliente;
    }
    
        
}
