import java.io.File;

public class Lab11_2 {
    public static void main(String[] args) {

        String path = "students.txt";
        File fileOrDirectory = new File(path);

        if (!fileOrDirectory.exists()) {
            System.out.println("The specified file or directory does not exist.");
            return;
        }

        if (fileOrDirectory.isFile()) {
            System.out.println("File Size: " + fileOrDirectory.length() + " bytes");
        } else if (fileOrDirectory.isDirectory()) {
            System.out.println("Files in the directory:");
            File[] files = fileOrDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("The specified path does not represent a file or directory.");
        }
    }
}