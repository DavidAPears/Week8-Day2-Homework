package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    private int id;
    private String name;
    private List<File> files;




    public Folder() { }

    public Folder(String name) { this.name = name; }


//  SHIP ID Getters & Setters:


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



//    SHIP NAME Getters & Setters:



    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



//    SHIP FILES One-To-Many:


    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }


}













