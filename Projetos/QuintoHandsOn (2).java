import java.util.LinkedList;
import java.util.Queue;
public class QuintoHandsOn {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();        
        String atendido;
        fila.add("Ana");        
        fila.add("Bruno");        
        fila.add("Carla");
        fila.add("João"); 
        fila.add("Luiz");         

        System.out.println("Fila: " + fila);        
        
        System.out.println("Proximo a ser atendido: " + fila.peek());
        atendido = fila.poll();        
        
        System.out.println("Atendido: " + atendido);        
        System.out.println("Fila atual: " + fila);
        
        System.out.println("Proximo a ser atendido: " + fila.peek());
        
        atendido = fila.poll();
        System.out.println("Atendido: " + atendido);
    }
}
