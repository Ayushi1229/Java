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

public class Lab11_4 {
    private static final String FILE_NAME = "students.dat";

    public static void main(String[] args) {

        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 21);

        writeStudentToFile(student1);
        writeStudentToFile(student2);

        readStudentsFromFile();
    }

    private static void writeStudentToFile(Student student) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(FILE_NAME, true))) {
            outputStream.writeUTF(student.getName());
            outputStream.writeInt(student.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readStudentsFromFile() {
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (inputStream.available() > 0) {
                String name = inputStream.readUTF();
                int age = inputStream.readInt();
                Student student = new Student(name, age);
                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}