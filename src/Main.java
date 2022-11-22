import com.cuong.demo.console.MorseCodeConverter;

public class Main {
    public static void main(String[] args) {
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
        morseCodeConverter.encode("nguyenchicuong");
        System.out.println();
        morseCodeConverter.decode("-. --. ..- -.-- . -. -.-. .... .. -.-. ..- --- -. --.");
    }
}