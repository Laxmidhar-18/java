public class Student_part_3 {
        int rollNo;
        String name;
        int[] marks;

        Student_part_3(int rollNo, String name, int[] marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        void display() {
            int total = 0;

            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.print("Marks: ");

            for (int i = 0; i < marks.length; i++) {
                System.out.print(marks[i] + " ");
                total += marks[i];
            }

            System.out.println("\nTotal Marks: " + total);
            System.out.println("Average: " + (total / (double) marks.length));
        }

        public static void main(String[] args) {
            int[] marks = {80, 75, 90, 85, 95};

            Student_part_3 student =
                    new Student_part_3(102, "Amit", marks);

            student.display();
        }
    }
