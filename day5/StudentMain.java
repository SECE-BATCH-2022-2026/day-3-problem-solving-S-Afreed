import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Objects;

class Student {

    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}


public class StudentMain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Student> studentSet = new HashSet<>();
        
        // Assuming the first line of input is N (number of students)
        int n = Integer.parseInt(br.readLine()); 

        int rollNo;
        String name;
        Student s;

        for (int i = 0; i < n; i++) {
            // Assuming input format is: RollNo on one line, Name on the next
            rollNo = Integer.parseInt(br.readLine());
            name = br.readLine();
            
            s = new Student(rollNo, name);
            studentSet.add(s);
        }

        // Displaying all unique students
        System.out.println("Student Details:");
        for (Student student : studentSet) {
            student.display();
        }
    }
}