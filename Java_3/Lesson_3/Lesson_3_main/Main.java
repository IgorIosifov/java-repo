import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

class Main {


    public static void main(String[] args) {
        readFile("new_files/50k_file.txt");
        joining_Files("new_files");
    }

    //task #1 read from file and print it in console
    private static void readFile(String pathname) {
        File smallFile = new File(pathname);
        System.out.println("task #1 started");
        try (FileInputStream in = new FileInputStream(smallFile)) {
            int temp;
            while ((temp = in.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("task #1 completed");
    }


    //task #2 joining several files in one
    private static void joining_Files(String pathname) {
        ArrayList<InputStream> files = new ArrayList<>();

        try {
            files.add(new FileInputStream("new_files/100k_file_1.txt"));
            files.add(new FileInputStream("new_files/100k_file_2.txt"));
            files.add(new FileInputStream("new_files/100k_file_3.txt"));
            files.add(new FileInputStream("new_files/100k_file_4.txt"));
            files.add(new FileInputStream("new_files/100k_file_5.txt"));

            SequenceInputStream in = new SequenceInputStream(Collections.enumeration(files));
            int temp;
            String content = "";
            while ((temp = in.read()) != -1) {
                content += String.valueOf((char) temp);
            }
            byte[] outData = content.getBytes();
            System.out.println(outData);
            try (FileOutputStream out = new FileOutputStream("new_files/500k_file.txt")) {
                out.write(outData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
