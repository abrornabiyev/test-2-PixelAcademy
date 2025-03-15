public class Exercitiul1 {
    public static void main(String[] args) {

        convertire();

    }
    static public void convertire(){
        byte b = 10;
        int i = 235;
        long l = 15686L;

        short s = (short)b;
        System.out.println("Byte " + b + " convertit in short " + s);

        double d = (double)i;
        System.out.println("Int " + i + " convertit in double " + d);

        int i1 = (int)l;
        System.out.println("Long " + l + " convertit in int " + i1);

    }
}
