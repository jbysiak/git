public class punkt
{
    protected
    double masa, Gmom, Smom, odl;          //zadeklarowanie parametrów punktu materialnego

    public punkt()                      //konstruktor domyślny
    {
        masa=1;
    }

    public punkt(double m)                 //konstruktor z parametrem
    {
        if (m>0)                        //warunek uniemożlwiający nadanie niedodatniej masy
            masa=m;
        else
            System.out.println("\nMasa nie może być ujemna");
    }

    public void zmianaMasy(double ma)      //metoda zmieniająca masę z podobnym warunkiem (akcesor)
    {
        if (ma>0)
            masa=ma;
        else
            System.out.println("\nMasa nie może być ujemna");
    }

    public void obliczGmom()            //obliczenie głównego momentu bezwładności punktu
    {
        Gmom=0;
    }

    public void obliczSmom(double d)       //obliczenie momentu bezwładności punktu ze znaną odległością od osi obrotu
    {
        if (d>0)
        {
            odl=d;
            Smom=Gmom + masa*odl*odl;
        }
        else
        {
            System.out.println("\nOdległość nie może być ujemna");
        }
    }

    public void opis()                  //metoda opisująca punkt materialny
    {
        System.out.println("\nPunkt materialny");
    }

    public void pelnyOpis()             //metoda przedstawiająca wszystkie parametry punktu
    {
        System.out.println("\nPunkt materialny\nMasa punktu wynosi " +masa+ ", jego główny moment bezwładności " +Gmom+
        " a moment względem osi oddalonej o " +odl+ " wynosi " +Smom);
    }
}