import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇개의 수를 입력할 예정인가요?");
        int i = sc.nextInt();

        Integer arr[] = new Integer[i];
        sc.nextLine(); //다음 nextline의 오류를 없애기 위해
        System.out.print("수를 입력하세요.");
        String num = sc.nextLine();
        String[] numarr = num.split(" ");

        for (int a = 0; a < numarr.length; a++){
            arr[a] = Integer.parseInt(numarr[a]);
        }
        int maxnum = arr[0];
        int minnum = arr[0];
        for(int k =0; k< arr.length; k++){
            if (maxnum < arr[k]){
                maxnum = arr[k];
            }
            if(minnum > arr[k]){
                minnum = arr[k];
            }
        }
        System.out.print("최댓값: " + maxnum);
        System.out.print("최소값: "+ minnum);
    }
}