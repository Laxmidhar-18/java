
    class Student_part_5{
        int rollNo;
        String name;
        int[] marks;

        Student_part_5(int rollNo, String name, int[] marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        void display() {
            int total = 0;

            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);

            for (int mark : marks) {
                total += mark;
            }

            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + (total / (double) marks.length));
        }

        public static void main(String[] args) {
            int[] marks = {85, 90, 80, 75, 95};

            Student_part_5 s = new Student_part_5(105, "Rahul", marks);

            s.display();
        }
    }

