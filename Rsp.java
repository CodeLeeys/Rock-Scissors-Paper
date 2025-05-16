import java.util.Scanner;
import java.util.Random;
public class Rsp{    
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int user_num = 0;
        while (true) {
            System.out.print("1(가위) /2(바위) /3(보) 중에서 숫자 하나를 선택해서 입력하세요.:");
            user_num = s.nextInt();
            if (user_num >= 1 && user_num <= 3) {
            break;
            } else {
                System.out.println("잘못된 입력입니다. 1(가위) /2(바위) /3(보) 중에서 숫자 하나를 입력해야 합니다.");
            }
        }
        System.out.println("User가 입력한 값 :"+user_num);
        Random random = new Random();
        int cpu_num = random.nextInt(3) + 1; 
        System.out.println("CPU가 고른 숫자: " + cpu_num);
        if ((user_num == 1 && cpu_num == 3) || 
            (user_num == 2 && cpu_num == 1) || 
            (user_num == 3 && cpu_num == 2)) {
            System.out.println("User 승리!");
        } else if (user_num == cpu_num){
            System.out.println("비김");
        } else {
            System.out.println("CPU 승리!");
        }
        s.close();
    }
}