
abstract class Exercitiul8 {
    String primulCopil = "Cristinel";
    String alDoileaCopil = "Cristinuta";
    String magazin1 ;
    String magazin2;
    String magazin3;

    Exercitiul8(String magazin1, String magazin2, String magazin3){
        this.magazin1 = magazin1;
        this.magazin2 = magazin2;
        this.magazin3 = magazin3;
    }

    abstract void urcareInCamion();
    // am utilizat metoda abstracta, pentru ca ea sa fie obligatorie de implementat in clasa copil
}
 class Transportare extends Exercitiul8{

    Transportare(String magazin1, String magazin2, String magazin3){
        super(magazin1, magazin2, magazin3);
    }

     @Override
     void urcareInCamion() {
         System.out.println("Urca " + primulCopil);
         System.out.println("Urca " + alDoileaCopil);
         System.out.println("Copii au urcat, se poate de plecat");
         System.out.println("Plecam spre " + magazin1 + "," + magazin2 + " si " + magazin3);

     }
 }
 class Test{
     public static void main(String[] args) {
         Transportare magaz = new Transportare("Nr1", "Linella", "Metro");
         magaz.urcareInCamion();
     }
 }
