import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Homework8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> IDPW = new HashMap<String,String>();
        IDPW.put("myid","myPass");
        IDPW.put("myid2","myPass2");
        IDPW.put("myid3","myPass3");
        boolean answer = true;
        String id;
        String pw;
        while(answer){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            id = scanner.nextLine();
            if (IDPW.containsKey(id) == true){
                System.out.print("password : ");
                pw = scanner.nextLine();
                if (IDPW.get(id).equals(pw)){
                    System.out.println("id와 비밀번호가 일치합니다.");
                    answer= false;
                }
                else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                }

            }
            else{
                System.out.print("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n\n");
            }
        }
    }
}