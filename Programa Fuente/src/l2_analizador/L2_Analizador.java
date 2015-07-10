package l2_analizador;

public class L2_Analizador {
    
    public static void main(String[] args)throws Exception{
        System.out.println("ANALIZADOR LEX-SIN-SEM:");
        System.out.println("-----------------------");
        System.out.println("\nCadena Analizada:");       
      try{
        parser instancia=new parser();
        instancia.cargar("entrada.txt");
      }catch (Exception e) {
        System.out.println("\n\nResultado: Error en la Gramatica");
      }
    }
    
}
