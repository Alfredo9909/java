import java.util.*;
public class Agenda {
   Contacto Ag[];
    int pos;
   
    Agenda(){
    Ag=new Contacto[50];
    pos=-1;
    }
    
    void GuardarContacto(String N, String V, int C, int P, int S)
    {
       Contacto temp=new Contacto(); 
      pos++;
      
      temp.setNombre(N);
      temp.setNombreS(V);
      temp.setCodigo(C);
      temp.setPrecio(P);
      temp.setStock(S);
      Ag[pos]=temp;
      
    }

    void Buscar(String N){
    if(pos>=0){
        for(int x=0;x<=pos;x++){
          if (Ag[x].getNombreP().equals(N))
          { System.out.println ("Nombre del producto:"+Ag[x].getNombreP()+Ag[x].getNombreS());
            /*System.out.println(""+Ag[x].getNombreS());*/
            System.out.println ("Codigo:"+Ag[x].getCodigo());
            System.out.println ("Precio:"+Ag[x].getPrecio());
            System.out.println ("Stock:"+Ag[x].getStock());
          }
          }//for
    }else
        System.out.println("La agenda esta vacia");
    }//buscar

    void listar(){
      if(pos>=0){
        for(int x=0;x<=pos;x++){
          System.out.println("*********************************");
           System.out.println ("Nombre:"+Ag[x].getNombreP()+Ag[x].getNombreS());
            System.out.println ("codigo:"+Ag[x].getCodigo());
            System.out.println ("precio:"+Ag[x].getPrecio());
            System.out.println ("stock:"+Ag[x].getStock());
          
          }//for
    }else
        System.out.println("La agenda esta vacia");
    }
 
}
