public class Student_part_4 {
        int rollNo;
        String name;
        int[] marks;

        Student_part_4(int rollNo, String name, int[] marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        void displayResult() {
            int total = 0;

            for (int mark : marks) {
                total += mark;
            }

            double average = (double) total / marks.length;

            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Total Marks: " + total);
            System.out.println("Average: " + average);
        }

        public static void main(String[] args) {
            int[] marks = {85, 90, 78, 92, 88};

            Student_part_4 student =
                    new Student_part_4(104, "Rohan", marks);

            student.displayResult();
        }
    }

