import java.util.Scanner;

public class helloworld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("hello "+ name);
        System.out.println("Pick a num");
        System.out.println(bestNumber(sc.nextInt()));
        System.out.println("pick another num");
        System.out.println(betterNumber(sc.nextInt()));
        System.out.println("Pick a person of fond nature");
        System.out.println(bestPerson(sc.next()));
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
    public static String betterNumber(int receive){
        if (receive==420){
            return ("Hell yea pt.2 ");
        } else {
            return "clearly that's wrong";
        }
    }

    public static String bestPerson(String person){
        if(person.equals("Anna")){
            return "Good, only correct answer";
        } else if (person.equals("Mara")){
            return "This is clearly the best answer";
        }
        else{
            return "Imagine being so wrong";
        }
    }
}
