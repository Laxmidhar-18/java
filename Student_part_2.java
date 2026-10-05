public class Student_part_2 {
    
        int rollNo;
        String name;
        int[] marks;

        Student_part_2(int rollNo, String name, int[] marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        void display() {
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.print("Marks: ");

            for (int i = 0; i < marks.length; i++) {
                System.out.print(marks[i] + " ");
            }
        }

        public static void main(String[] args) {
            int[] marks = {85, 90, 78, 88, 92};

            Student_part_2 s = new Student_part_2(101, "Rahul", marks);
            s.display();
        }

}
