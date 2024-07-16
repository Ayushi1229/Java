import java.io.*;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setName(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Lab11_1 {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 21);

        writeStudentToFile(student1);
        writeStudentToFile(student2);

        readStudentsFromFile();
    }

    private static void writeStudentToFile(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(student.getName() + "," + student.getAge() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readStudentsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                Student student = new Student(name, age);
                // Process the student object as needed (e.g., print it)
                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}