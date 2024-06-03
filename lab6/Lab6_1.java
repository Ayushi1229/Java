import java.util.Scanner;
import java.lang.*;
class student {
    int id_no=101;
    int no_of_subjects_registered=6;
    String[] subject_code = {"Maths","c","physics","df","es","ic"};
    int[] subject_credits = {6,6,5,5,2,2};
    String[] grade_obtained = {"A+","A","B","A+","A","A"};
    double spi;

    student(int id_no, int no_of_subjects_registered) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        this.spi = spi;
    }

    void calculate_spi() {
        double total_credits = 0;
        double total_mark = 0;

        for (int i=0;i<no_of_subjects_registered;i++) {
            total_credits += subject_credits[i];
        }

        spi = total_mark / total_credits;
    }

    void display() {
        System.out.println("Student ID: " + id_no);
        System.out.println("SPI: " + spi);
    }
}
public class Lab6_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of student :");
        int n = Integer.parseInt(args[0]);
        student[] students = new student[n];

        for (int i = 1; i < n; i++) {
            System.out.println("enter student ID :");
            int id_no = sc.nextInt();
            System.out.println("enter number of subjects_registered :");
            int no_of_subjects_registered = sc.nextInt();
            student s = new student(id_no, no_of_subjects_registered);

            for (int j = 0; j < no_of_subjects_registered; j++) {
                System.out.println("enter subject_code :");
                s.subject_code[j] = sc.next();
                System.out.println("enter subject_credits :");
                s.subject_credits[j] = sc.nextInt();
                System.out.println("enter grade_obtained:");
                s.grade_obtained[j] = sc.next();

                }

                s.calculate_spi();
                students[i] = s;
        }

        for (student s : students) {
            s.display();
        }
    }
}

