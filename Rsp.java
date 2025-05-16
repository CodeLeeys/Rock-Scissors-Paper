import java.util.Scanner;
import java.util.Random;
public class Rsp{    
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("1/2/3 중에서 숫자 하나를 선택해서 입력하세요.:");
        int user_num = s.nextInt();
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