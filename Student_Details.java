

public class Student_Details {
    public static void main(String[] args) {
        String name = "Riya";
        String program = "BCA";
        int semester = 2;
        String[] courses = {"Math", "Java", "DBMS"};
        int[] marks = {75, 35, 85};

        System.out.println("Name: " + name + ", Program: " + program + ", Semester: " + semester);
        System.out.println("Courses with marks < 40:");
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 40) {
                System.out.println(courses[i] + ": " + marks[i]);
            }
        }
    }
}



