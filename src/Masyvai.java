import java.util.Arrays;

public class Masyvai {
    public static void main(String[] args) {
        int[] skaiciai = {3, 5, 8};
        System.out.println("Arrays.toString(skaiciai) = " + Arrays.toString(skaiciai));

        // isvedu pirma masyvo elementa
        System.out.println("skaiciai[1] = " + skaiciai[1]);

        // isvedu masyva su savo funkcija
        isvestiMasyva(skaiciai);

        // suskaiciuou ir isvedu suma
        int suma = masyvosuma(skaiciai);
        System.out.println("suma = " + suma);

    }

    /**
     * funcija isveda masyvo skaicius i ta pacia eilute atskirais kableliais
     * @param masyvas skaiciu masyvas
     */
    public static void isvestiMasyva(int[] masyvas){
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + ", ");
        }
        System.out.println();
    }

    public static int masyvosuma( int[] masyvas){
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            suma += masyvas[i];
        }
        return suma;
    }
}
