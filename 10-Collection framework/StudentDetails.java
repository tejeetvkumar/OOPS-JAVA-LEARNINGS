class Student{
    String name;
    int rollNo;
    int marks;
    Student(String name,int rollNo,int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Marks: "+marks);
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        Student s1=new Student("John",101,85);
        Student s2=new Student("Alice",102,90);
        Student s3=new Student("Bob",103,78);
        s1.display();
        s2.display();
        s3.display();
    }
}