import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char arrChN[]={'0','1','2','3','4','5','6','7','8','9'};
        char arrChBL[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char arrChLL[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char arrChO[]={'_'};
        int len;
        String str;

        
        System.out.println("Input a password: ");
        str = scan.next();
        len = str.length();

        int containsn = 0;
        int containsbl= 0;
        int containsll= 0;
        int containso= 0;

            for (int i=0;i<len;i++){
            char cc =str.charAt(i);
            for (char c : arrChN) {if (c == cc) {containsn +=1;}}
            for (char c : arrChLL) {if (c == cc) {containsbl +=1;}}
            for (char c : arrChBL) {if (c == cc) {containsll +=1;}}
            for (char c : arrChO) {if (c == cc) {containso +=1;}}
            }

            if (containsbl+containsll+containsn+containso>=8 && containsbl*containsll*containsn!=0){
            System.out.println("password is good");
            }else{
            System.out.println("password is bad");}
            }

    }
