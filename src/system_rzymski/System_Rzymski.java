package system_rzymski;
import java.util.*;

public class System_Rzymski {

    public static final int liczby_arab[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static final String liczby_rzym[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    
    public static String zapis_rzym(int number){
        String zapis_rzym = "";
        while(number > 0){
            if(number >= liczby_arab[0]){
                number = number - liczby_arab[0];
                zapis_rzym = zapis_rzym + liczby_rzym[0];
            }
            else if(number >= liczby_arab[1]){
                number = number - liczby_arab[1];
                zapis_rzym = zapis_rzym + liczby_rzym[1];
            }
            else if(number >= liczby_arab[2]){
                number = number - liczby_arab[2];
                zapis_rzym = zapis_rzym + liczby_rzym[2];
            }
            else if(number >= liczby_arab[3]){
                number = number - liczby_arab[3];
                zapis_rzym = zapis_rzym + liczby_rzym[3];
            }
            else if(number >= liczby_arab[4]){
                number = number - liczby_arab[4];
                zapis_rzym = zapis_rzym + liczby_rzym[4];
            }
            else if(number >= liczby_arab[5]){
                number = number - liczby_arab[5];
                zapis_rzym = zapis_rzym + liczby_rzym[5];
            }
            else if(number >= liczby_arab[6]){
                number = number - liczby_arab[6];
                zapis_rzym = zapis_rzym + liczby_rzym[6];
            }
            else if(number >= liczby_arab[7]){
                number = number - liczby_arab[7];
                zapis_rzym = zapis_rzym + liczby_rzym[7];
            }
            else if(number >= liczby_arab[8])
            {
                number = number - liczby_arab[8];
                zapis_rzym = zapis_rzym + liczby_rzym[8];
            }
            else if(number >= liczby_arab[9])
            {
                number = number - liczby_arab[9];
                zapis_rzym = zapis_rzym + liczby_rzym[9];
            }
            else if(number >= liczby_arab[10])
            {
                number = number - liczby_arab[10];
                zapis_rzym = zapis_rzym + liczby_rzym[10];
            }
            else if(number >= liczby_arab[11])
            {
                number = number - liczby_arab[11];
                zapis_rzym = zapis_rzym + liczby_rzym[11];
            }
            else
            {
                number = number - liczby_arab[12];
                zapis_rzym = zapis_rzym + liczby_rzym[12];
            }
        }
        return zapis_rzym;
    }
    public static void main(String[] args) {
        List<String> rzym = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String R1 = zapis_rzym(1997);
        String R2 = zapis_rzym(777);
        String R3 = zapis_rzym(1492);
        String R4 = zapis_rzym(1683);
        String R5 = zapis_rzym(in.nextInt());
        String R6 = zapis_rzym(in.nextInt());
        
        System.out.println();
        
        rzym.add(R1);
        rzym.add(R2);
        rzym.add(R3);
        rzym.add(R4);
        rzym.add(R5);
        rzym.add(R6);
        
        for(int i = 0; i < rzym.size(); i++)
        {
            System.out.println(rzym.get(i));
        }
    }
    
}
