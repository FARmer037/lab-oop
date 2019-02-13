import java.util.ArrayList;
import java.util.Iterator;

public class Main{
    public static void main(String args[]) {
        testList();
        System.out.println(" ");
        //Iterator
        StudentList st = new StudentList();
        st.addStudent(new Student(10,"janejira",2.58));
        st.addStudent(new Student(11,"kamonnet",3.90));
        st.addStudent(new Student(12,"kratai",2.82));
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

        Student mhoo = new Student();
        mhoo.setName("keerati");
        mhoo.setCode(111);
        mhoo.setGPA(3.20);
        students.add(mhoo);

        Student nam = new Student();
        nam.setName("janjira");
        nam.setCode(220);
        nam.setGPA(2.80);
        students.add(nam);

        Student kwang = new Student();
        kwang.setName("penpan");
        kwang.setCode(121);
        kwang.setGPA( 3.50);
        students.add(kwang);

        for (Student st: students) {   //forech
            System.out.println(st);  
        }
        System.out.println("number of Student:" +students.size()); 
        System.out.println(" ");
        students.remove(nam);
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