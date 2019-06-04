
package Escuelita;

import java.util.ArrayList;

public class main {
    
    public static void main(String[] args) {
        
        ArrayList<Productos> listaProductos = new ArrayList<Productos>();
        
        listaProductos.add(new Productos("Coca cola zero", "Litros 1.5", 20));
        listaProductos.add(new Productos("Coca cola", "Litros 1.5", 18));
        listaProductos.add(new Productos("Shampo sedal", "Contenido 500ml", 19));
        listaProductos.add(new Productos("Frutillas", "Unidad de venta: kg", 50));
        listaProductos.add(new Productos("Asado de novillo", "Unidad de venta: kg", 155));
        listaProductos.add(new Productos("Colgate", "Contenido 90ml", 35));
        listaProductos.add(new Productos("Arroz", "Contenido 500gr", 30));

        System.out.println(listaProductos);
        System.out.print("====================================================\n");
        
//        if (p.compareTo(p1) < 0 ) { System.out.println("La persona p1: es menor."); }
//
//    else if (p1.compareTo(p2) > 0 ) {System.out.println("La persona p1: es mayor."); }

        
     

      
    }
    
}
