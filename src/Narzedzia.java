
public class Narzedzia {
    /********************************************************
    nazwa funkcji:      zliczSamogloski
    opis funkcji:       zlicza samogloski w podanym ciagu znaków
    parametry:          tekst - ciag znaków
    zwracany typ i opis:        int - liczba samoglosek w podanym ciagu znaków
    autor: SJ10
    ********************************************************/
    public static int zliczSamogloski(String tekst){
        String samogloski="aąeęiouóyAĄEĘIOUYÓY";
        int licznik=0;
        if(!tekst.isBlank()){
            for(int x=0;x<tekst.length();x++){
                if(samogloski.indexOf(tekst.charAt(x))>=0){
                    licznik+=1;
                }
            }
        }
        else{
            return 0;
        }
        return licznik;
    }
    /********************************************************
    nazwa funkcji:      usunDuplikaty
    opis funkcji:       usuwa powtarzajace sie po sobie znakami w danym ciagu znaków
    parametry:          tekst - ciag znaków
    zwracany typ i opis: String - początkowy ciag znaków z usuniętymi powtarzającymi się po sobie znakami
    autor: SJ10
    ********************************************************/
        public static String usunDuplikaty(String tekst){
            String zmienionyTekst="";
            if(!tekst.isBlank()){
                for(int x=0;x<tekst.length()-1;x++){
                    if(tekst.charAt(x)!=tekst.charAt(x+1)){
                        zmienionyTekst+=tekst.charAt(x);
                    }
                }
            }
            else{
                return "";
            }
            return zmienionyTekst+tekst.charAt(tekst.length()-1);
        }
}
