public class Kula extends punkt {

    private                                 //dodanie potrzebnego parametru
    double promien;

    public Kula() {                         //konstruktor domyślny
        masa = 1;
        promien = 1;
    }

    public Kula (double r, double m) {      //konstruktor z parametrami
        super(m);

        if (r > 0)                          //warunek uniemożlwiający nadanie niedodatniego promienia
            promien = r;
        else
            System.out.println("\nPromień nie może być ujemny");

        if (m > 0)                        //warunek uniemożlwiający nadanie niedodatniej masy
            masa = m;
        else
            System.out.println("\nMasa nie może być ujemna");
    }

    public void zmianaPromienia(double r) {     //metoda zmieniająca długość promienia z podobnym warunkiem (akcesor)
        if (r > 0)
            promien = r;
        else
            System.out.println("\nPromień nie może być ujemny");
    }

    public void obliczGmom()            //obliczenie głównego momentu bezwładności kuli
    {
        Gmom=0.4*masa*promien*promien;
    }

    public void opis()                  //metoda opisująca kulę
    {
        System.out.println("\nKula");
    }

    public void pelnyOpis()             //metoda przedstawiająca wszystkie parametry walca
    {
        System.out.println("\nKula\nMasa kuli wynosi " +masa+ ", jej promień " +promien+
                ", a jej główny moment bezwładności " +Gmom);
    }
}
