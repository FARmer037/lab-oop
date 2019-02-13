//import java.util.*;
public class Student {
    protected int stCode; // student code 
    protected String name;  
    protected double gpa;

    public Student() { }
    public Student(int c){
        this.stCode = c;
    }

    public Student(int c, String nm, double g) {
        this.stCode = c;
        this.name = nm;
        this.gpa = g;
    }

    public int getCode() {
        return this.stCode;
    }
    
    public String getName(){
        return this.name;   
    }
    
    public double getGPA() {
        return this.gpa;
    }
    
    public void setGPA(double g) {
        this.gpa = g;
    }
    
    public void setName(String name) {
        this.name=name; 
    }
    
    public void setCode(int stCode) {
        this.stCode=stCode;   
    }
    public String toString() {
        String s = stCode + " " + name + " " + gpa;
        return s;
    } 
}




