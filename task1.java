import java.util.Scanner;
public class task1{
    public static void main(String[] args) {
        int day;
        int month;
        int year;
        int len;
        String str;
        Scanner scan = new Scanner(System.in);
        int hello = 1;
        int year_hi = 0;

        while (true) {
            System.out.println("Input a date (dd/mm/yyyy): ");
            str = scan.next();
            len = str.length();
            if (len==10){
            char arrCh[]={'0','1','2','3','4','5','6','7','8','9'};
            int contains = 0;
            for (int i=0;i<10;i++){
                if (i==2 || i==5){
                    continue;
                }

            char cc =str.charAt(i);
            for (char c : arrCh) {
                if (c == cc) {
                    contains +=1;
                }

            }}
            if (len==10 && str.charAt(2)=='/' && str.charAt(5)=='/' && contains==8)
            {

                day = str.charAt(0)-'0';
                day= day*10;
                int t_i = str.charAt(1)-'0';
                day=day+t_i;

                month= str.charAt(3) - '0';
                month= month*10;
                t_i = str.charAt(4) - '0';
                month=month+t_i;

                year = str.charAt(6)-'0';
                year= year*1000;
                t_i = str.charAt(7)-'0';
                year=year+t_i*100;
                t_i = str.charAt(8)-'0';
                year=year+t_i*10;
                t_i = str.charAt(9)-'0';
                year=year+t_i;
                

                if (year % 4 == 0) {
                    if ((year % 100 != 0) || (year % 400 == 0)) {
                        year_hi=1;
                    }
                }
                
                if (year<1900 || year >9999) {hello=100;}
                if (month<1 || month>12){hello=100;}

                switch(month){

                    case 2: if (1<=day && day<=28+year_hi){break;}{hello=100;};
                    
                    case 4:
                    case 6:
                    case 9:
                    case 11:if (1<=day && day<=30){break;}{hello=100;};

                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: if (1<=day && day<=31){break;}{hello=100;};

                }

                break;
            }
            else
            {System.out.println("ERROR INPUT! REPEAT! ");continue;}}
            else
            {System.out.println("ERROR INPUT! REPEAT! ");continue;}
        }




        
        if (hello==1)
        {System.out.println("Date correct");}
        else
        {System.out.println("Date incorrect");}
        scan.close();
        


    }
}