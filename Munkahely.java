public class Munkahely {
    static int lepcsozes(int[] viragok, int viragszam, int lepcsoszam) {
        int osszeg = 0;
        for (int i =0; i < viragszam; i++){
            osszeg += viragok[i];
        }

        return osszeg * lepcsoszam * 2;
    }
}
