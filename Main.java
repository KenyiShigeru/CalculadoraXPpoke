import java.util.*;
public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap valoresMap = new HashMap();
        for(Integer i = 1; i <= 100; i++)
        {
            int numero = (6*(int)Math.pow(i, 3)) / 5 - (15*(int)Math.pow(i,2)) + (100 * i ) - 140;
            valoresMap.put(i, numero);
        }

        System.out.println("Digita un nivel que requieres saber");
        int objetivo = sc.nextInt();
        System.out.println("Digita un nivel que estas actualmente");
        int actual = sc.nextInt(); 
        System.out.println("Para ese nivel se ocupa "+((int)valoresMap.get(objetivo) - (int)valoresMap.get(actual)) + " de experiencia");
    }
}