import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();


        frutas.add("Maçã");
        frutas.add("banana");
        frutas.add("uva");
        frutas.add("morango");
        frutas.remove("uva");
        frutas.set(1, "abacaxi");



        System.out.println(frutas.size());
        System.out.println(frutas.get(0));
        System.out.println(frutas);
        System.out.println(frutas.contains("Maçã"));
        System.out.println(frutas.contains("bamnana"));

        for(int i = 0; i  < frutas.size(); i++){
            System.out.println(frutas.get(i));
        }
    }
}