
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Reader {

    public static void main(String[] args) {
        //specify the address of the book
        String pathname = "books/Thinking in Java.txt";
        currentPage(pathname);
    }

    //currentPage is waiting for page number and then calls printPage method plus prints some information in console

    private static void currentPage(String pathname) {
        System.out.println("Enter the page number. Enter 0 to close the app");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int page = sc.nextInt();
            if (page==0){
                break;
            }
            long start = System.currentTimeMillis();
            printPage(pathname, page);
            System.out.println();
            System.out.println("//time of executing " + (System.currentTimeMillis() - start) + " ms");
        }
    }

    //  printPage is counting total amount of pages, then prints one from currentPage method
    private static void printPage(String pathname, int page) {
        try {
            RandomAccessFile raf = new RandomAccessFile(pathname, "r");
            int pageContent = 1800;
            int totalPages = (int) raf.length() / pageContent + 1;
            System.out.println("Page: " + page + "/" + totalPages);

            for (int i = (page - 1) * pageContent; i < page * pageContent; i++) {
                raf.seek(i);
                System.out.print((char) raf.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
