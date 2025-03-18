import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 월
        int y = sc.nextInt(); // 일
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int sumDay = month[x-1]; // 1월은 한 달이 다 안지났으니 -1
        sumDay += y-1; // 일자를 더함 (0번째 인덱스부터 시작하니 -1해줌)
        String day = days[sumDay%7];
        System.out.println(day);
    }
}