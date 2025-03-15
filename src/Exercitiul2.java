import java.util.Scanner;
public class Exercitiul2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Intruduce-ti un numar");
        int variabilaTest = scanner.nextInt();
        if(variabilaTest % 2 == 0) {
            System.out.println("Numarul este par");
        }
        else {
            System.out.println("Numarul este impar");
        }


    }
}
