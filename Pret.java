public class Pret extends punkt {

    private                                 //dodanie potrzebnego parametru
    double dlugosc;

    public Pret() {                         //konstruktor domyślny
        masa = 1;
        dlugosc = 1;
    }

    public Pret(double l, double m) {       //konstruktor z parametrami
        super(m);

        if (l > 0)                          //warunek uniemożlwiający nadanie niedodatniej długości
            dlugosc = l;
        else
            System.out.println("\nDługość nie może być ujemna");

        if (m > 0)                        //warunek uniemożlwiający nadanie niedodatniej masy
            masa = m;
        else
            System.out.println("\nMasa nie może być ujemna");
    }

    public void zmianaDlugosci(double l) {          //metoda zmieniająca długość pręta z podobnym warunkiem (akcesor)
        if (l > 0)
            dlugosc = l;
        else
            System.out.println("\nPromień nie może być ujemny");
    }

    public void obliczGmom()            //obliczenie głównego momentu bezwładności pręta
    {
        Gmom = masa*dlugosc*dlugosc/12;
    }

    public void opis()                  //metoda opisująca pręt
    {
        System.out.println("\nPręt");
    }

    public void pelnyOpis()             //metoda przedstawiająca wszystkie parametry pręta
    {
        System.out.println("\nPręt\nMasa pręta wynosi " +masa+ ", jego długość " +dlugosc+
                ", a jego główny moment bezwładności " +Gmom);
    }
}
