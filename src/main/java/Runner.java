import db.DBFolder;
import db.DBHelper;
import db.DBOwner;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;


public class Runner {

    public static void main(String[] args) {


//      OWNER(s) Set up:

        Owner mulder = new Owner("Fox Mulder", "Fox Mulder FBI Agent");
        DBHelper.save(mulder);


//      FOLDER(s) Set up:

        Folder xfile = new Folder("The X Files", mulder);
        DBHelper.save(xfile);

        Folder yfile = new Folder("The Y Files", mulder);
        DBHelper.save(yfile);


//      FILE(s) Set up:



        File file1 = new File("The Loch Ness Monster", "Java", 340.56, xfile);
        DBHelper.save(file1);

        File file2 = new File("Bigfoot", "txt", 100.50, xfile);
        DBHelper.save(file2);

        File file3 = new File("D-Day Invasion Plans", "ppt", 350.75, yfile);
        DBHelper.save(file3);

        File file4 = new File("How To Make Lasagne", "Ruby", 50.00, yfile);
        DBHelper.save(file4);

        File file5 = new File("UFO Images", "Jpeg", 175.50, xfile);
        DBHelper.save(file5);




//      METHODS


        List<File> files = DBHelper.getAll(File.class);

        File foundFile = DBHelper.find(File.class, file1.getId());

        List<File> filesInXFiles = DBFolder.getFilesInFolder(xfile);

        List<Folder> ownersFolders = DBOwner.getFoldersForOwner(mulder);
    }

}



