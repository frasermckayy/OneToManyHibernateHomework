import folder.db.DBFile;
import folder.db.DBFolder;
import folder.models.Folder;

import java.io.File;

public class Runner {

    public static void main(String[] args) {
        Folder fold1 = new Folder("HR");
        DBFolder.save(fold1);

        Folder fold2 = new Folder("Sales");
        DBFolder.save(fold2);

        File file1 = new File("fraser's", ".txt", 56, fold1);
        DBFile.save(file1);

        File file2 = new File("tom's", ".rb", 98, fold2);
        DBFile.save(file2);

    }
}
