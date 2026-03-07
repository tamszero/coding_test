import java.io.IOException;
import java.util.Scanner;

public class BackJoon9498 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        int sco = score / 10 ;
        char grade;


        if( 0 <= score || score <= 100){

            switch(sco){
                case 10:
                    grade = 'A';
                    break;
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';

            }
            System.out.println(grade);



        }

    }
}
