package homework.fileSearch;

import java.io.File;

public class FileSearch {
    public static void main(String[] args) {

        String path = "C:\\Users\\Vazgen\\Desktop\\JavaExample";

        File file = new File(path);

        System.out.println(file.exists());

        File[] files = file.listFiles();
        for (File singleFile : files) {
            System.out.println(singleFile.list());
        }
    }
}