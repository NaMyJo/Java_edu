import java.util.Scanner;

class gcdwork{
    int gcd(int m, int n){
        if (m==0){return m;}
        else if(m%n ==0){return n;}
        else{
            m = m%n;
            return gcd(n,m);
        }
    }
    int gcd2(int i, int j){
        int num = i%j;
        while (num !=0){
            num = i%j;
            if(i>j){
                i = num;
            }
            else if(i==j){return i;}
            else{
                int k =i;
                i =j;
                j =k;
                }
            }
        return j;
    }
}
public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요.");
        String nums = sc.nextLine();
        String[] numarray = nums.split(" ");
        int a= Integer.parseInt(numarray[0]);
        int b =Integer.parseInt(numarray[1]);
        gcdwork makegcd = new gcdwork();
        int answer = makegcd.gcd(a,b);
        int answer2 = makegcd.gcd2(a,b);
        System.out.printf("두 수의 최대 공약수는%d입니다.\n",answer);
        System.out.printf("반복문: 두 수의 최대공약수는%d입니다.",answer2);

    }
}