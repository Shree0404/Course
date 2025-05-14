public class Pink {

    // Course class
    public static class Course {
        private String courseName;
        private int courseCode;

        public Course(String courseName, int courseCode) {
            this.courseName = courseName;
            this.courseCode = courseCode;
        }

        public String getCourseName() {
            return courseName;
        }

        public int getCourseCode() {
            return courseCode;
        }
    }

    // Student class
    public static class Student {
        private String name;
        private String program;
        private String semester;
        private Course[] courses;
        private int[] marks;

        public Student(String name, String program, String semester, Course[] courses, int[] marks) {
            this.name = name;
            this.program = program;
            this.semester = semester;
            this.courses = courses;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public String getProgram() {
            return program;
        }

        public String getSemester() {
            return semester;
        }

        public Course[] getCourses() {
            return courses;
        }

        public int[] getMarks() {
            return marks;
        }

        // Method to retrieve students with marks less than 40
        public void checkLowMarks() {
            System.out.println("Student: " + name);
            for (int i = 0; i < marks.length; i++) {
                if (marks[i] < 40) {
                    System.out.println("Course: " + courses[i].getCourseName() + ", Marks: " + marks[i]);
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        // Creating courses
        Course course1 = new Course("Mathematics", 101);
        Course course2 = new Course("Science", 102);
        Course course3 = new Course("History", 103);

        // Course array
        Course[] courses = { course1, course2, course3 };
        // Marks array for the student
        int[] marks = { 30, 45, 39 }; // Example marks for the student

        // Creating a student with the courses and marks
        Student student = new Student("Harikanta", "Computer Science", "Semester 52", courses, marks);

        // Retrieving student information
        System.out.println("Student Name: " + student.getName());
        System.out.println("Program: " + student.getProgram());
        System.out.println("Semester: " + student.getSemester());
        for (Course course : student.getCourses()) {
            System.out.println("Course Registered: " + course.getCourseName());
        }

        // Checking for marks below 40
        student.checkLowMarks();
    }
}