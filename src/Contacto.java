import java.util.*;
public class Contacto {
        private String NombreP;
        private String NombreS;
        private int Codigo;
    private int Precio;
    private int Stock;

    
    public String getNombreP() {
        return NombreP;
    }
    public void setNombre(String NombreP) {
        this.NombreP = NombreP;
    }
     public String getNombreS() {
        return NombreS;
    }
    public void setNombreS(String NombreS) {
        this.NombreS = NombreS;
    }
   
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    
    public int getPrecio() {
        return Precio;
    }

   
    public void setPrecio(int precio) {
        this.Precio = precio;
    }
    
  public int getStock() {
        return Stock;
    }

   
    public void setStock(int Stock) {
        this.Stock = Stock;
    }
}
