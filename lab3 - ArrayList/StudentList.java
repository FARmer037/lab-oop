import java.util.ArrayList;
public class StudentList {
    private ArrayList<Student> stdList;
    private int numberOfStudent;
  
    public StudentList(){  
        stdList = new ArrayList<Student>();  
        numberOfStudent=0;
    }
    public void addStudent(Student students){  
        stdList.add(students); 
    }
    public void removeStudentBystCode(int stCode){
        if ((stCode >= 0) && (stCode < stdList.size())) {
            stdList.remove(stCode);
        }
    }
    public void showAllStudentInfo() {
        for (Student st: stdList) {
            System.out.println(st);
        }
    }

    public int getNumberOfStudent (){  
        return numberOfStudent;  
    }

    public int number () {  
        return stdList.size();    
    }  
    public Student searchStudentBystCode(int stCode) {
        Student st=null;
        if ((stCode >= 0)&&(stCode < stdList.size())) { // if a valid note number
            st = stdList.get(stCode);
            System.out.println(stdList.get(stCode) );
    }
    return st;
    }
}  