// File: Student.java
    public class Student {
        private String name;
        private int id;
        private double gpa;

        // Default Constructor
        public Student() {
            this.name = "Not Assigned";
            this.id = 0;
            this.gpa = 0.0;
        }

        // Parameterized Constructor (2 parameters)
        public Student(String name, int id) {
            this.name = name;
            this.id = id;
            this.gpa = 0.0; // Default GPA if not provided
        }

        // Parameterized Constructor (3 parameters)
        public Student(String name, int id, double gpa) {
            this.name = name;
            this.id = id;
            this.gpa = gpa;
        }

        public void showInfo() {
            System.out.println("ID: " + id + " | Name: " + name + " | GPA: " + gpa);
        }

        public static void main(String[] args) {
            // Using Default Constructor
            Student s1 = new Student();

            // Using 2-parameter Constructor
            Student s2 = new Student("Bob", 101);

            // Using 3-parameter Constructor
            Student s3 = new Student("Charlie", 102, 3.85);

            s1.showInfo();
            s2.showInfo();
            s3.showInfo();
        }
    }

