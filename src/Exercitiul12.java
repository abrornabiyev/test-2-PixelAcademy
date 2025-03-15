import javax.swing.*;

public class Exercitiul12 {

    private int notaMate;
    private int notaEngleza;
    private int notaGeo;
//    private double medie;

    Exercitiul12( int notaMate, int notaGeo, int notaEngleza){
        this.notaEngleza = notaEngleza;
        this.notaGeo = notaGeo;
        this.notaMate = notaMate;
    }

    int getNotaMate(){
        return notaMate;
    }

    int getNotaEngleza(){
        return notaEngleza;
    }

    int getNotaGeo(){
        return notaGeo;
    }
    void setNotaMate(int notaMate){
        this.notaMate = notaMate;
    }
    void setNotaEngleza(int notaEngleza){
        this.notaEngleza = notaEngleza;
    }
    void setNotaGeografie(int notaGeo){
        this.notaGeo = notaGeo;
    }
    double medie(){
        return (notaMate + notaEngleza + notaGeo) / 3.0;
    }



}
class Run extends Exercitiul12{
    // mostenirea parametrilor constructorului din clasa parinte
    Run(int notaMate, int notaGeo, int notaEngleza) {
        super(notaMate, notaGeo, notaEngleza);
    }

    public static void main(String[] args) {
        Run abror = new Run(8, 9, 7);
        // le voi seta prin metodele setter

       abror.setNotaEngleza(5);
       abror.setNotaGeografie(8);
       abror.setNotaMate(7);

        System.out.println("Nota la Matematica: " + abror.getNotaMate());
        System.out.println("Nota la Geografie: " + abror.getNotaGeo());
        System.out.println("Nota la Engleza: " + abror.getNotaEngleza());


        System.out.println("Media: " + abror.medie());
    }

}



