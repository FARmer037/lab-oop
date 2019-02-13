import java.util.ArrayList;
public class StudentList {
    private ArrayList<Student> stList;
    private int numberOfStudent;
  
    public StudentList(){  
        stList = new ArrayList<Student>();  
        numberOfStudent=0;
    }
    public void addStudent(Student students){  
        stList.add(students); 
    }
    public void removeStudentBystCode(int stCode){
        if ((stCode >= 0) && (stCode < stList.size())) {
            stList.remove(stCode);
        }
    }
    public void showAllStudentInfo() {
        for (Student st: stList) {
            System.out.println(st);
        }
    }

    public int getNumberOfStudent (){  
        return numberOfStudent;  
    }

    public int number () {  
        return stList.size();    
    }  
    public Student searchStudentBystCode(int stCode) {
        Student st=null;
        if ((stCode >= 0)&&(stCode < stList.size())) { // if a valid note number
            st = stList.get(stCode);
            System.out.println(stList.get(stCode) );
    }
    return st;
    // System.out.println(stList.get(stCode) );
  
    }
}  