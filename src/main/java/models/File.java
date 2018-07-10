package models;

import javax.persistence.*;


@Entity
@Table(name="files")
public class File {

    private int id;
    private String name;
    private String extension;
    private double size;
    private Folder folder;

    public File(String name, String extension, double size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }


//    ID Getter & Setter:


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


//    NAME Getter & Setter:


    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//    EXTENSION Getter & Setter:


    @Column(name = "extension")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }


//    SIZE Getter & Setter:

    @Column(name = "size")
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }



//    ONE TO MANY Files to Folder set up:

    @ManyToOne
    @JoinColumn(name = "folder", nullable = false)
    public Folder getFolder(){
        return this.folder;
    }

    public void setFolder(Folder folder){
        this.folder = folder;
    }
}

