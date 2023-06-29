import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Third {

    public static void Just_Write_To_File(String file_name, String path) {
        try (FileWriter notation = new FileWriter(file_name, true)) {
            notation.append(path + "\n");
            notation.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/2");
        File dir = new File(pathDir);
        String target_file = "2/newFile.txt";
        System.out.println(dir.getAbsolutePath());
        for (String fname : dir.list()) {
            Just_Write_To_File(target_file, fname);
            System.out.println(fname);
        }

    }
}