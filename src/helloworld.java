import java.util.Scanner;

public class helloworld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("hello "+ name);
        System.out.println("Pick a num");
        System.out.println(bestNumber(sc.nextInt()));
    }

    public static String bestNumber(int receive){
        if(receive==69){
            return "Hell yeah";
        }
        if(receive == 420){
            return "I like 69, but that's good too";
        }
        return "Wrong number, it's 69!!!!";
    }
}
