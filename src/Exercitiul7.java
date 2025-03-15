public class Exercitiul7 {
    public static void main(String[] args) {

        String test = "    Programare Java      ";
        System.out.println(test);
        String rezultat = test.replaceAll("\\s", "");
        System.out.println(rezultat);


    }
}
