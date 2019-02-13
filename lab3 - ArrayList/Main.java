import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        testList();
        System.out.println(" ");
        //Iterator
        StudentList st = new StudentList();
        st.addStudent(new Student(10, "janejira", 2.58));
        st.addStudent(new Student(11, "kamonnet", 3.90));
        st.addStudent(new Student(12, "kratai", 2.82));
            System.out.println("addStudent:");  
        st.showAllStudentInfo();
            System.out.println("number of Student:" +st.number());
            System.out.println(" ");
            System.out.println(" removeStudent [0]: ");
        st.removeStudentBystCode(0);
        st.showAllStudentInfo();
            System.out.println("number of Student:" +st.number());
            System.out.println(" ");
            System.out.println("searchStudent[1]:");
        st.searchStudentBystCode(1);
            System.out.println(" ");
    }

    public static void testList(){
        ArrayList<Student> students = new ArrayList<Student>();

        Student std1 = new Student();
        std1.setName("keerati");
        std1.setCode(111);
        std1.setGPA(3.20);
        students.add(std1);

        Student std2 = new Student();
        std2.setName("janjira");
        std2.setCode(220);
        std2.setGPA(2.80);
        students.add(std2);

        Student std3 = new Student();
        std3.setName("penpan");
        std3.setCode(121);
        std3.setGPA( 3.50);
        students.add(std3);

        for (Student st: students) {   //forech
            System.out.println(st);
        }
        System.out.println("number of Student:" +students.size()); 
        System.out.println(" ");
        students.remove(std2);
        /* Student get1 = students.get(1);    
        System.out.println(get1);
        */ 
        Iterator<Student> it = students.iterator();    //Iterator
            while(it.hasNext()) {
                 Student obj = (Student)it.next();
                 System.out.println(obj);    
                } System.out.println("number of Student:" +students.size());      
    }  
}