package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    private int id;
    private String name;
    private List<File> files;
    private Owner owner;


    public Folder(String the_x_files, String fox_mulder, Owner owner) { }

    public Folder(String name, Owner owner) { this.name = name; this.owner = owner; }


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


//    OWNER Many-to-many:


    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    public Owner getOwner(){
        return this.owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

}













