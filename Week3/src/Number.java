import java.util.ArrayList;
import java.util.Random;

public class Number{
    public static int x;
    public static int size;

    public Number(int x,  int size) {
        this.x = randomLoc();

        this.size = randomSize();
    }
    public static int randomSize (){
        int min = 1;
        int max = 2;
        Random r = new Random();
        int rand = r.nextInt(max)+min;
        return rand;

    }
    public static int randomLoc(){
        int min = 1;
        int max = board.size;
        Random r = new Random();
        int rand = r.nextInt(max)+min;
        return rand;

    }
}

class board {
    public static int size = 3;
    public static ArrayList<Number> numbers;

    public static void fillArray(ArrayList<Number> num) {
        Random r = new Random();
        int rand = r.nextInt(10) + 5;
        numbers = new ArrayList<Number>(rand);
        System.out.println("random =" + rand);
        for (int i = 0; i < rand; i++) {


            numbers.add(new Number(Number.x, Number.size));

            System.out.println(i + ". " + numbers.get(i).x + numbers.get(i).size);
            //fills normaly
        }
        num.addAll(numbers);
        System.out.println("aaaaa" + num.get(0).x);
        //why same values?
        System.out.println("fillArray circles= " + num.get(0).x +  " " + num.get(1).x);
    }

    public static void main(String[] args) {
        fillArray(numbers);
    }
}


