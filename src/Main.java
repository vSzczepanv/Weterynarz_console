import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner wejscie= new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków do sprawdzenia: ");
        String ciag=wejscie.next();
        System.out.println("Liczba samogłosek w łańcuchu: "+ Narzedzia.zliczSamogloski(ciag));
        System.out.println("Łańcuch po usunięciu duplikatów: "+ Narzedzia.usunDuplikaty(ciag));
    }
}

