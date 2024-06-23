public class Course {
    private String courseName;
    private String[] students = new String[4]; // Fixed size for demonstration purposes
    private int numberOfStudents;
    
    public Course(String courseName) {
        this.courseName = courseName;
    }
  
    public void addStudent(String student) {
        if (numberOfStudents < students.length) {
            students[numberOfStudents] = student;
            numberOfStudents++;
        } else {
            System.out.println("Cannot add more students. Course is full.");
        }
    }
  
    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }  

    public String getCourseName() {
        return courseName;
    }  
  
    public void dropStudent(String student) {
        // Find the student and remove them from the array
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                // Shift remaining elements
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null; // Clear the last element
                numberOfStudents--;
                return; // Exit after removing the student
            }
        }
        System.out.println("Student " + student + " not found in the course.");
    }
}
