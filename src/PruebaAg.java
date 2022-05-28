import java.util.*;
public class PruebaAg {
        public static void main(String args[]){
      Scanner leer=new Scanner (System.in);
      Scanner lee=new Scanner (System.in);
      int opc,c,p,s;
      String n,v;
      Agenda a1=new Agenda();
      do{
        System.out.println("\n 1. Agregar producto");
        System.out.println("\n 2. Buscar producto");
        System.out.println("\n 3. Listar producto");
        System.out.println("\n 4. Salir");
        opc=leer.nextInt();
        switch (opc){
            case 1:
                   System.out.println("Codigo:");
                    c=leer.nextInt();
                    System.out.println("Nombre del prodcuto:");
                    n=leer.next();
                    v=leer.nextLine();
                   System.out.println("Precio:");
                    p=leer.nextInt();
                    System.out.println("Stock:");
                    s=leer.nextInt();
                    a1.GuardarContacto(n,v,c,p,s);
                break;
            case 2:System.out.println("Nombre:");
                    n=leer.next();
                    v=leer.nextLine();
                  a1.Buscar(n);
                break;
            case 3: a1.listar();
                   break;
        }
      }while(opc<4);
      
    }

}
