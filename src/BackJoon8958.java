import javax.annotation.processing.SupportedSourceVersion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BackJoon8958 {
    public static void main(String[] args) throws IOException {
       // exam1();
        exam2();
    }

        private static void exam1(){

            Scanner sc = new Scanner(System.in);

            //nextLine으로 받아 형변환해서 엔터까지 한번에 처리하기
            int n = Integer.parseInt(sc.nextLine());


            // 입력 받은 n개의 개수만큼 반복문 구현하기
            for(int i = 1; i <= n; i++ ){
                //반복문 내부에서 OX퀴즈 문자열 입력받기
                String rs = sc.nextLine();


                int score = 0;
                int initNum = 0;

                for(int j = 0; j < rs.length(); j ++){
                    //문자열에서 문자 가져오기
                    if(rs.charAt(j) == 'O'){
                        initNum ++;
                        score += initNum;
                    }else {
                        initNum = 0;
                    }

                }
                System.out.println(score);

            }





            sc.close();

        }

        private static void exam2() throws IOException {
        //최적화된 방식
            BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
            StringBuilder sb = new StringBuilder();

            int n = Integer.parseInt(br.readLine());
            while (n -- > 0){
                char[] rs = br.readLine().toCharArray(); //입력받은 문자열을 문자 배열로 변경
                // ['O', 'X' , 'O', 'O', ... 이렇게 들어오게 됨]

                int score = 0;
                int initNum = 0;

                for(char c : rs ){
                    if(c == 'O'){
                        score += ++initNum;
                        // score = score + (++initNum) 전위증감
                    }else {
                        initNum = 0;
                    }
                }
                sb.append(score).append('\n');
            }
            System.out.println(sb);
            br.close();

        }



    }





/*
int score = 0;
int initNum = 0;

OOXXOXXOOO

1회차 : O == O
initNum ++ ; 0 -> 1이됨
score += initNum -> score = score + initNum;
score:1

2회차 : O == O
initNum ++ ; 1 -> 2 됨
score += initNum -> score = 1 + 2
score:3

3회차 : O == X
initNum = 0;
score += initNum -> 3 + 0;
score:3

 */