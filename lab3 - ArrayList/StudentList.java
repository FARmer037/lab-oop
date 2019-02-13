import java.util.ArrayList;
public class StudentList {
    private ArrayList<Student> stdList;
    private int numberOfStudent;

    public StudentList() {
        stdList = new ArrayList<Student>();
        numberOfStudent = 0;
    }

    public void addStudent(Student theStudent) {
        stdList.add(theStudent);
    }

    public void removeStudentByCode(int stCode) {
        if ((stCode >= 0) && (stCode < stdList.size())) {
            stdList.remove(stCode);
        }
    }

    public void showAllStudentInfo() {
        for (Student student : stdList) {
            System.out.println(student);
        }
    }

    public int getNumberOfStudent() {
        return this.numberOfStudent;
    }  
    public int number() {
        return stdList.size();    
    }

    public Student searchStudentBystCode(int stCode) {
        Student std = null;
        if ((stCode >= 0)&&(stCode < stdList.size())){ // if a valid note number
            std = stdList.get(stCode);
            System.out.println(stdList.get(stCode) );
        }
    return std;
    // System.out.println(stList.get(stCode) );
    }
}