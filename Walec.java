public class Walec extends punkt {

    private                               //dodanie potrzebnego parametru
    double promien;

    public Walec() {                      //konstruktor domyślny
        masa = 1;
        promien = 1;
    }

    public Walec(double r, double m) {    //konstruktor z parametrami
        super(m);

        if (r > 0)                        //warunek uniemożlwiający nadanie niedodatniego promienia
            promien = r;
        else
            System.out.println("\nPromień nie może być ujemny");
    }

    public void zmianaPromienia(double r) {     //metoda zmieniająca długość promienia z podobnym warunkiem (akcesor)
        if (r > 0)
            promien = r;
        else
            System.out.println("\nPromień nie może być ujemny");
    }

    public void obliczGmom()            //obliczenie głównego momentu bezwładności walca
    {
        Gmom=0.5*masa*promien*promien;
    }

    public void opis()                  //metoda opisująca walec
    {
        System.out.println("\nWalec");
    }

    public void pelnyOpis()             //metoda przedstawiająca wszystkie parametry walca
    {
        System.out.println("\nWalec\nMasa walca wynosi " +masa+ ", jego promień " +promien+
                ", a jego główny moment bezwładności " +Gmom);
    }
}