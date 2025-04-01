public class statickey {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolname="JVM";
        Student s2=new Student();
        System.out.println(s2.schoolname);
    }
    
}
class Student{
    String name;
    int rollno;

    static String schoolname;

    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
}
