class Student {
    int rollNumber;
    String studentName;
    int marks[] = new int[3];

    // Constructor
    public Student(int roll, String name, int[] m) {
        this.rollNumber = roll;
        this.studentName = name;
        this.marks = m;
    }

    // Validate marks 0–100
    void validateMarks() throws InvalidMarksException {
        for (int i = 0; i < 3; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                throw new InvalidMarksException("Invalid marks for subject " + (i + 1) + ": " + marks[i]);
            }
        }
    }

    // Calculate average
    double calculateAverage() {
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }

    // Display student result
    void displayResult() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks[0] + "  " + marks[1] + "  " + marks[2]);

        double avg = calculateAverage();
        System.out.println("Average: " + avg);

        if (avg >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}
