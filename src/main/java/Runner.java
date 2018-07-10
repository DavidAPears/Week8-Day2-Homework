import db.DBFolder;
import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;


public class Runner {

    public static void main(String[] args) {


//      FOLDER(s) Set up:

        Folder xfile = new Folder("The X Files");
        DBHelper.save(xfile);

        Folder yfile = new Folder("The Y Files");
        DBHelper.save(yfile);


//      FILE(s) Set up:



        File file1 = new File("The Loch Ness Monster", "Java", 340.56, xfile);
        DBHelper.save(file1);

        File file2 = new File("Bigfoot", "txt", 100.50, xfile);
        DBHelper.save(file2);

        File file3 = new File("DDay Invasion Plans", "ppt", 350.75, yfile);
        DBHelper.save(file3);

        File file4 = new File("How To Make Lasagne", "Ruby", 50.00, yfile);
        DBHelper.save(file4);

        File file5 = new File("UFO Images", "Jpeg", 175.50, xfile);
        DBHelper.save(file5);




//      METHODS


        List<File> files = DBHelper.getAll(File.class);

        File foundFile = DBHelper.find(File.class, file1.getId());

        List<File> filesInXFiles = DBFolder.getFilesInFolder(xfile);


    }

}



