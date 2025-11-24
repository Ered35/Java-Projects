import java.util.Random;
import java.util.Scanner;

public class SimplePasswortGenerator {
    public static void main(String[] args) {

        SimplePasswortGenerator simplePasswortGenerator = new SimplePasswortGenerator();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Passwort legnth: ");
        String number = scanner.nextLine();
        int convertNumber = 0;
        try {
           convertNumber = Integer.parseInt(number);
        }catch (NumberFormatException e) {
            System.out.println("Not a valid input!");
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < convertNumber; i++) {
            int randomNumber = simplePasswortGenerator.randomNumber(random);
            char randomChar = simplePasswortGenerator.randomChar(randomNumber);
            sb.append(randomChar);
        }

        String passwort = sb.toString();
        System.out.println(passwort);
        
    }

    private int randomNumber(Random random) {
        int randomNumber = random.nextInt(94);
        return randomNumber;
    }

    private char randomChar(int randomNumber) {
        final char[] CHARS = { '^','°','1','!','2','"','3','§','4','$','5','%','6','&','7','/','8','(','9',')','0','=','ß','?','´','`',
                'q','Q','w','W','e','E','r','R','t','T','z','Z','u','U','i','I','o','O','p','P','ü','Ü','+','*',
                'a','A','s','S','d','D','f','F','g','G','h','H','j','J','k','K','l','L','ö','Ö','ä','Ä','#','<','>','y','Y','x','X',
                'c','C','v','V','b','B','n','N','m','M',',',';','.',':','-','_' };
        char randomChar = CHARS[randomNumber];
        return randomChar;
    }
}
