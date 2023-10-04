
//get, set은 어떻게 하는지 모르겠습니다...
import java.util.Scanner;
class Student{
    String stuNum; String stuName; String stuMajor;String stuPhone;
    }
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");
        String stu1 = sc.nextLine();
        String[] student1 = stu1.split(" ");
        Student std1 = new Student();
        std1.stuNum = student1[0];std1.stuName = student1[1];
        std1.stuMajor = student1[2]; std1.stuPhone = student1[3];


        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");
        String stu2 = sc.nextLine();
        String[] student2 = stu2.split(" ");
        Student std2 = new Student();
        std2.stuNum = student2[0];std2.stuName = student2[1];
        std2.stuMajor = student2[2]; std2.stuPhone = student2[3];


        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");
        String stu3 = sc.nextLine();
        String[] student3 = stu3.split(" ");
        Student std3 = new Student();
        std3.stuNum = student3[0];std3.stuName = student3[1];
        std3.stuMajor = student3[2]; std3.stuPhone = student3[3];


        System.out.println("첫번째 학생: "+std1.stuNum +" "+ std1.stuName +" "+ std1.stuMajor+ " "
                +std1.stuPhone.substring(0,3)+"-"+std1.stuPhone.substring(3,7)+"-"+std1.stuPhone.substring((7)));
        System.out.println("두번째 학생: "+std2.stuNum +" "+ std2.stuName +" "+ std2.stuMajor+ " "
                +std2.stuPhone.substring(0,3)+"-"+std2.stuPhone.substring(3,7)+"-"+std2.stuPhone.substring((7)));
        System.out.println("세번째 학생: "+std3.stuNum +" "+ std3.stuName +" "+ std3.stuMajor+ " "
                +std3.stuPhone.substring(0,3)+"-"+std3.stuPhone.substring(3,7)+"-"+std3.stuPhone.substring((7)));

    }
}
















