import java.util.Scanner;

/**
 * Created by KPS on 7/18/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = scanner.nextInt();
        if (number == 0){
            System.out.println("Zero!!");
        }else if (number>=0 && number<=1){
            System.out.println("POSITIVE ABER SMALL");
        }else if (number>=0 && number>=10000){
            System.out.println("POSITIVE LARGE");
        }else if (number<0){
            System.out.println("NEGATIVE");
        }else {
            System.out.println("POSITIVE");
        }
    }
}
