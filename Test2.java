public class Test2 {
    public static void main(String[] args)
    {
        Walec w1 = new Walec(2, 2);             //utworzenie obiektów z poszczególnych klas pochodnych
        Kula k1 = new Kula(2, 3);
        Pret p1 = new Pret(5, 1);

        w1.obliczGmom();                              //obliczenie głównych momentów bezwładności utworzonych obiektów
        k1.obliczGmom();
        p1.obliczGmom();

        w1.pelnyOpis();                               //wyświetlenie informacji o obiektach
        k1.pelnyOpis();
        p1.pelnyOpis();

        punkt tablica[] = new punkt [6];              //utworzenie tablicy obiektów

        for (int i=0; i<6; i++)                       //uzupełnienie tablicy obiektami różnych klas
        {
            if (i%3==1)
                tablica[i]=new Walec(0.5*(i+1), 2*(i+1));

            else if (i%3==2)
                tablica[i]=new Kula(0.5*(i+1), 2*(i+1));

            else
                tablica[i]=new Pret(0.5*(i+1), 2*(i+1));

            tablica[i].obliczGmom();                   //obliczenie głównych momentów bezwładności
            tablica[i].pelnyOpis();                    //i wyświetlenie ich opisów

            tablica[i].obliczSmom(2);               //obliczenie momentów bezwładności względem osi oddalonej o 2
            System.out.println("A moment względem osi oddalonej o " +tablica[i].odl+ " wynosi " +tablica[i].Smom);
        }

    }
}
