class Studen{
    void student_details(){
        int age=20;
        String name="prasanna";
        int student_id=23451;
        String Department="AI&DS";
        System.out.println("student details");
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("student_id:"+ student_id);
        System.out.println("Department"+Department);
    }
}
class Faculty extends Studen{
    void Faculty_details(){
        int age=25;
        String name="anshika";
        int Faculty_id=23451;
        String Department="AI&DS";
        System.out.println("faculty details");
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("Faculty_id:"+Faculty_id);
        System.out.println("Department"+Department);
    }
}
public class student{
    public static void main(String[] args)
    {
        Faculty f=new Faculty();
        f.student_details();
        f.Faculty_details();
    }
}
