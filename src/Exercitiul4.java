import java.util.Scanner;
public class Exercitiul4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce-ti primul numar: ");
        int primulNumer = scanner.nextInt();
        System.out.println("Introduce-ti al doilea numar: ");
        int alDoileaNumar = scanner.nextInt();
        System.out.println("Introduce-ti al treilea numar: ");
        int alTreileaNumar = scanner.nextInt();

        if(primulNumer == alDoileaNumar && alDoileaNumar == alTreileaNumar){
            System.out.println("Numerele sunt egale");
        } else if (primulNumer != alDoileaNumar && alDoileaNumar != alTreileaNumar) {
            System.out.println("Numerele sunt diferite");
        }

    }
}
