
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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
   
      
}
