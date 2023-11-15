class Course{
    protected String code;
    protected String name;
    Course(String code, String name){
        this.code = code;
        this.name = name;
    }
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
}
class OfflineCourse extends Course{
    OfflineCourse(String code, String name){
        super(code, name);
    }
    @Override
    public String toString(){
        String msg = "Code: " + code + ", Name: " + name + ", Type: Offline";
        return msg;
    }

}
class OnlineCourse extends Course{
    OnlineCourse(String code, String name){
        super(code, name);
    }
    @Override
    public String toString(){
        String msg = "Code: " + code + ", Name: " + name + ", Type: Online";
        return msg;
    }

}

public class Homework6 {
    public static void main(String[] args) {
    OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
    OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
    course1.toString();
    course2.toString();

    System.out.println (course1);
    System.out.println (course2);
    }
}