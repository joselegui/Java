
package Escuelita;

public class Productos {


    public String nombredeproducto;
    public String capacidaddelproducto;
    public int precioproducto;
    
    
    
    public Productos(String nombredeproducto, String capacidaddelproducto, int precioproducto) {
        this.nombredeproducto = nombredeproducto;
        this.capacidaddelproducto = capacidaddelproducto;
        this.precioproducto = precioproducto;
    }
    
        public String getNombredeproducto() {
        return nombredeproducto;
    }

    public void setNombredeproducto(String nombredeproducto) {
        this.nombredeproducto = nombredeproducto;
    }

    public String getCapacidaddelproducto() {
        return capacidaddelproducto;
    }

    public void setCapacidaddelproducto(String capacidaddelproducto) {
        this.capacidaddelproducto = capacidaddelproducto;
    }

    public int getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(int precioproducto) {
        this.precioproducto = precioproducto;
    }

    @Override
    public String toString() {
        return "Productos: "  + nombredeproducto + " /// " + capacidaddelproducto + " /// Precio: $" + precioproducto+"\n";
    }
    
   // 
//    public int compareTo(Productos pro) {
//
//        int resultado=0;
//
//        if (this.precioproducto < pro.precioproducto) {   resultado = -1;      }
//
//       else if (this.precioproducto > pro.precioproducto) {    resultado = 1;      }
//
//        return resultado;
//    }
//    public class producto implements Comparable<Productos>{
//
//        @Override
//        public int compareTo(Productos t) {
//            
//            return t.precioproducto;
//        }

    
}
