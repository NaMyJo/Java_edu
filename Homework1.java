import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int add = 0;

        /*사용자로부터 num받기*/

        System.out.println("정수를 입력하세요: ");
        int num = sc.nextInt();
        arr[0] = num;
        add = add+ num;
        System.out.printf("현재까지 입력한 정수의 합은 %d입니다.\n",add);


        System.out.println("정수를 입력하세요: ");
        int num2 = sc.nextInt();
        arr[1] = num2;
        add= add+ num2;
        System.out.printf("현재까지 입력한 정수의 합은 %d입니다.\n",add);


        System.out.println("정수를 입력하세요: ");
        int num3 = sc.nextInt();
        arr[2] = num3;
        add= add+ num3;
        System.out.printf("현재까지 입력한 정수의 합은 %d입니다.\n",add);


        System.out.println("정수를 입력하세요: ");
        int num4 = sc.nextInt();
        arr[3] = num4;
        add= add+ num4;
        System.out.printf("현재까지 입력한 정수의 합은 %d입니다.\n",add);


        System.out.println("정수를 입력하세요: ");
        int num5 = sc.nextInt();
        arr[4] = num5;
        add= add+ num5;
        System.out.printf("현재까지 입력한 정수의 합은 %d입니다.\n",add);

    }
}
