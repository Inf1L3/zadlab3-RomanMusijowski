/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;
/**
 *
 * @author Asia
 */
public class Main {
    public static int potegowanie(int liczba, int potega){
        int rezult=1;
        for (int i = potega; i>0;i--){
            rezult=rezult*liczba;
            System.out.println(rezult);
        }
        return rezult;
    }

    public static int potega_rekurencja(int potega, int liczba){
            if(liczba==0){
                return 1;
            }else
            return potega* potega_rekurencja(potega, (liczba-1));
    }

    public static int fibonaczi(int liczba){
        if(liczba ==1 || liczba ==2){
            return 1;
        }else{
            return fibonaczi(liczba-1)+fibonaczi(liczba-2);
        }
    }

    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4

        Scanner scanner = new Scanner(System.in);

        //Zadanie 1.4
        System.out.println("ZAdanie 1.4");

        int zad_1_4 = -29;
        System.out.println(zad_1_4>>3);
        System.out.println(zad_1_4<<6);
        System.out.println(zad_1_4>>>3);



        //Zadanie 1.7
        System.out.println("Zadanie 1.7");

        byte a = 0b00110100;//a =52
        byte b = 0b01011011;//b = 91
        //       0b01101111   1+2+4+8+32+64 = 111
        // XOR daje jeden tylko w przypadku kiedy rone znaczenia 0 i 1czy naobrot(poznacz sie ^)

        boolean jeden = true;
        jeden = !jeden;  // Not to jest zaprzeczenie znaczenia czyli (poznacza sie !)

        System.out.println(a^b);
        System.out.println(jeden);
        System.out.println();


        //Zadanie 2.2

        System.out.println("Zadanie 2.2");
        //toCharArray
        String str1 = "Ala ma kota";
        for(char c : str1.toCharArray()){
            System.out.print(c+" ");
        }


        //getBytes
        byte[] byte_str1 = str1.getBytes();
        System.out.println("Ala ma kota = "+byte_str1);
        for(byte d : byte_str1){ //getBytes litery przeksztawcaja sie w  cyfry (czyli bajty)
            System.out.print(d+" ");
        }
        System.out.println();



        //.equals(String ...) porownoje stringi i wydaje false kiedy one zawieraja rozne znaki
        String str2 = str1;
        String str3 = "ala ma kota";
        boolean rez_str;
        rez_str = str1.equals(str2);
        System.out.println("Mabyc true - "+ rez_str);

        rez_str = str1.equals(str3);
        System.out.println("Ma byc false - "+ rez_str);



        //boolean equalsIgnoreCase(String str)
        //Porownojemy dwa stringi z roznym wilkosciami liter ta metoda ignoruje wielkosc liter
        rez_str= str1.equalsIgnoreCase(str3);
        System.out.println("Ma byc  true - "+rez_str);



        //int campareTo(String str)
        String str4 = "ala";
        int rezult = str1.compareTo(str4);

        System.out.println("Ma byc mnijsz 0 liczba "+ rezult);//kiedy wieksza ilosc znakow zwraca wiekszy 0

        rezult = str4.compareTo(str1);
        System.out.println("Ma byc wieksza  0 liczba "+ rezult);//kiedy mniejsza ilosc znakow zwraca wiekszy 0

        rezult = str4.compareTo(str4);
        System.out.println("Ma byc 0 - "+ rezult); //kiedy jednakowe zwraca 0
        System.out.println();



        //int campareToIgnoreCase(String str) -   Ta motoda ignoroje wielkosc liter
        rezult = str1.compareTo(str4);
        System.out.println("Ma byc mnijsz 0 liczba "+ rezult);//kiedy wieksza ilosc znakow zwraca wiekszy 0

        rezult = str4.compareTo(str1);
        System.out.println("Ma byc wieksza  0 liczba "+ rezult);//kiedy mniejsza ilosc znakow zwraca wiekszy 0

        rezult = str4.compareTo(str4);
        System.out.println("Ma byc 0 - "+ rezult); //kiedy jednakowe zwraca 0


        //int indexOf(String str)
        //Metoda zwraca indeks podanej litery
        System.out.println("Indeks litery "+ str4.indexOf("a"));


        //int indexOf(int ch)
        //Metoda zwraca indeks podanej litery
        System.out.println("Indeks litery (podany w unicode)"+ str4.indexOf(108));//108 to litera l w unicode


        //int lastIndexOf(Sring str)
        //Zwraca indeks pierwszego znaku z podanego ciagu (jezeli takiego nie ma zwroci -1)
        System.out.println("Ilosc znakow za podanym ciagiem  "+str3.lastIndexOf("ma"));




        //int lastIndexOf(int ch)
        //Zwraca indeks odtatniego  znaku podanego w unikod (jezeli takiego nie ma zwroci -1)
        System.out.println("indeks podanego zaku "+str3.lastIndexOf(97));



        //String substring(int startString)
        //Od pewnego indeksu znaku do konca lancuchu
        System.out.println("substring "+str3.substring(4));



        //String substring(int startString, int stopString)
        //wyswietla lancch po indeksam
        System.out.println("Substring "+str3.substring(4,6));



        /* String replace(char orginal, char zamiennik)
        Zwraca nowy string juz z zamiana znakow
         */
        String rezult1 = "welkom to polska";
        System.out.println(rezult1.replace("to","my"));



        //String trim()
        //Zwraca kopię ciągu znaków z pominiętymi początkowymi i końcowymi spacji
        String trim_ = " trim _ ";
        System.out.println("Bez specji - "+trim_.trim());



        //String toLowerCase()
        //wszystkie z maej
        String wielkie = "ToLoWerCAsE";
        System.out.println(wielkie.toLowerCase());


        //String toUpperCase()
        System.out.println(wielkie.toUpperCase());



        //String[] split(String regex, int limit)
        String Str = new String("Welcome-to-Tutorialspoint.com");
        for (String retval: Str.split("-", 3)) {
            System.out.println(retval);
        }


        //String[] split(String regex)
        for (String retval: Str.split("-")) {
            System.out.println(retval);
        }

        //Zadanie 3.3
        //iteracja
        System.out.println("zadane 3.3");

        int liczba, potega;
        System.out.println("Podaj liczbe");
        liczba = scanner.nextInt();
        System.out.println("Podaj potege");
        potega = scanner.nextInt();

        int rezulu = potegowanie(liczba,potega);


        //petegowanie rekurencyjne
        System.out.println("Podaj liczbe");
        liczba = scanner.nextInt();
        System.out.println("Podaj potege");
        potega = scanner.nextInt();

        System.out.println(potega_rekurencja(liczba,potega));


        //Zadanie 3.4
        System.out.println("Zadanie 3.4");
        //rekurencja
        int liczba_fib;
        System.out.println("jeke liczbe fibonaczjego chcesz ?");
        liczba_fib = scanner.nextInt();
        System.out.println(fibonaczi(liczba_fib));


    }
}
