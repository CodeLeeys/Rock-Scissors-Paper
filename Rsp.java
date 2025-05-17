import java.util.Scanner;
import java.util.Random;
public class Rsp{    
    public static void main(String[]args){
        boolean play = true;
        Scanner s = new Scanner(System.in);
        while (play) {
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
            String user_choice;
            switch (user_num) {
                case 1: user_choice = "가위"; break;
                case 2: user_choice = "바위"; break;
                default : user_choice = "보"; break;
            }
            System.out.println("User가 입력한 값 :"+user_num + "->" + user_choice);
            Random random = new Random();
            int com_num = random.nextInt(1,4);
            String com_choice;
            switch (com_num) {
                case 1: com_choice = "가위"; break;
                case 2: com_choice = "바위"; break;
                default: com_choice = "보"; break;
            }
            System.out.println("CPU가 고른 숫자: " + com_num + "->" + com_choice);
            if ((user_num == 1 && com_num == 3) || 
                (user_num == 2 && com_num == 1) || 
                (user_num == 3 && com_num == 2)) {
                System.out.println("User 승리!");
            } else if (user_num == com_num){
                System.out.println("비김");
            } else {
                System.out.println("COM 승리!");
            }
            while (true) {
                System.out.print("게임을 계속 하시겠습니까? (y/n) : ");
                String user_answer = s.next();
                if (user_answer.equalsIgnoreCase("y")) {
                break;
                } else if (user_answer.equalsIgnoreCase("n")) {
                play = false;
                break;
                } else {
                    System.out.println("잘못된 입력입니다. y/n 중에서 하나를 입력해주세요.");
                }
            }
        }
        s.close();
        System.out.println("게임을 종료합니다.");
        
    }
}