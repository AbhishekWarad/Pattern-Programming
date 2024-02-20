/**
 * Write a class that represents real world Student and create multiple objects of it
 * Student
 */
class Student {

    String name = "Abhi";
    int age = 23;
    int marks = 88;
    void study(){
        System.out.println("Student is Studing");
    }
}

class StudentDemo{
    public static void main(String[] args) {
        Student s1;
        s1=new Student();

        Student s2;
        s2 = new Student();

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.marks);
        System.out.println(s2.name);
        System.out.println(s2.age);

        s2.name = "raj";
        s2.age = 23;
        System.out.println(s2.name);
        System.out.println(s2.age);
        s1.study();
    }
}