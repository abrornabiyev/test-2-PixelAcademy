abstract class Exercitiul13Vehicul {
    private String culoare;
    private String model;
    private String an;

    Exercitiul13Vehicul(String culoare, String model, String an){
        this.culoare = culoare;
        this.model = model;
        this.an = an;
    }
    abstract void accelereaza();
    abstract  void frineaza();

    String getAn(){
        return an;
    }
    String getCuloare (){
        return culoare;
    }
    String getModel(){
        return model;
    }
    // va putea seta numai culoare, celelalte parametri le va putea numai vizualiza, dupa dorinta
    void setCuloare(String culoare){
        this.culoare = culoare;
    }
}
class Masina extends Exercitiul13Vehicul{
    private int kmParcursi;
    Masina(String culoare, String model, String an, int KmParcursi){
        super(culoare, model, an);  // Se apelează constructorul clasei parinte
        this.kmParcursi = kmParcursi; // parametru adaugat de mine
    }

    @Override
    void accelereaza() {
        System.out.println("Masina s-a pornit");
    }
    void frineaza() {
        System.out.println("Masina frineaza");
    }
    public void afiseazaKmParcursi(int kmParcursi){
        System.out.println("Km parcursi = " + kmParcursi);
    }

}
 class RunEx13 {
    public static void main(String[] args) {
        // Crearea unui obiect de tip Masina
        Masina masina1 = new Masina("Rosu", "BMW", "2021", 15000);


        System.out.println("Modelul masinii: " + masina1.getModel());
        System.out.println("Anul fabricatiei: " + masina1.getAn());
        System.out.println("Culoarea masinii: " + masina1.getCuloare());


        masina1.accelereaza();
        masina1.frineaza();


        masina1.afiseazaKmParcursi(50000);



    }
}

