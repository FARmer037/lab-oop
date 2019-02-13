import java.util.ArrayList;
import java.util.Iterator;

public class Main{
    public static void main(String args[]) {
        testList();
        System.out.println(" ");
        //Iterator
        StudentList st = new StudentList();
        st.addStudent(new Student(1020,"Muhammadsoreen",2.58));
        st.addStudent(new Student(1122,"Madsoffee",2.90));
        st.addStudent(new Student(1202,"Affan",3.00));
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
        std1.setName("Mustofa");
        std1.setCode(1412);
        std1.setGPA(2.25);
        students.add(std1);

        Student std2 = new Student();
        std2.setName("Usman");
        std2.setCode(1521);
        std2.setGPA(2.30);
        students.add(std2);

        Student std3 = new Student();
        std3.setName("Asmeen");
        std3.setCode(1565);
        std3.setGPA( 2.50);
        students.add(std3);

        for (Student st: students) {   //forech
            System.out.println(st);  
        }
        System.out.println("number of Student:" +students.size()); 
        System.out.println(" ");
        students.remove(std2);
         
        Iterator<Student> it = students.iterator();    //Iterator
            while(it.hasNext()) {
                Student obj = (Student)it.next();
                System.out.println(obj);    
            } System.out.println("number of Student:" +students.size());      
    }  
}