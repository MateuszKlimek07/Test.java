package kalkulator;
import java.util.Scanner;

    public class Main {

        /* Prosty kalkulator wykonujący operacje dodawania, odejmowania, mnożenia
         * dzielenia oraz operację modulo w zależności od wyboru użytkownika
         */

        public static void main(String[] args)
        {
            int pierwsza_l;  // dwie liczby, na których będziemy wykonywać operację
            int druga_l;
            char znak;      // zmienna przechowująca symbol operacji do wykonania
            Scanner wej = new Scanner(System.in);   // wczytywanie zmiennych
            System.out.println("Podaj pierwszą liczbę:"); // przy pomocy Scanner
            pierwsza_l = wej.nextInt();
            System.out.println("Podaj drugą liczbę:");
            druga_l = wej.nextInt();

            System.out.println("Dodawanie dwóch liczb - wciśnij +");
            System.out.println("Odejmowanie dwóch liczb - wciśnij -");
            System.out.println("Mnożenie dwóch liczb - wciśnij *");
            System.out.println("Dzielenie dwóch liczb - wciśnij /");
            System.out.println("Operacaja modulo - wciśnij %");

            znak = wej.next().charAt(0);  // pobieramy symbol operacji od użytkownika
            switch(znak)     // w zależności od wyboru wykonujemy daną operację
            {
                case '+':    // dodawanie dwóch zmiennych
                {
                    System.out.println(pierwsza_l + druga_l);
                    break;
                }
                case '-':    // odejmowanie dwóch zmiennych
                {
                    System.out.println(pierwsza_l - druga_l);
                    break;
                }
                case '*':    // mnożenie dwóch zmiennych
                {
                    System.out.println(pierwsza_l * druga_l);
                    break;
                }
                case '/':   // sprawdzenie, czy druga zmienna nie jest zerem oraz
                {           // dzielenie dwóch zmiennych
                    if(druga_l !=0)
                    {
                        System.out.println(pierwsza_l / druga_l + "oraz reszty: " +
                                pierwsza_l % druga_l);
                    }
                    else
                    {
                        System.out.println("Nie dzielimy przez zero!!!");
                    }
                    break;
                }
                case '%':  // jw. ale tym razem operacja modulo
                {
                    if(druga_l !=0)  // również sprawdzenie warunku dzielenia przez 0
                    {
                        System.out.println(pierwsza_l % druga_l);
                    }
                    else
                    {
                        System.out.println("Nie dzielimy przez zero!!");
                    }
                }

            }

        }
    }