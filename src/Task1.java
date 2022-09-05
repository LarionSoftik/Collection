import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        System.out.println(number);
        System.out.println(number.get(3));
        number.set(2, 15);
        System.out.println(number);
        System.out.println("Размер листа - " + number.size());
        System.out.println("Если ли в списке 15? - " + number.contains(15));

    }
}
