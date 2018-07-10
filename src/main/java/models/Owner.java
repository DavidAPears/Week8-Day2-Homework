package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "owners")
public class Owner {

    private int id;
    private String name;
    private String username;
    private List<Folder> folders;


    public Owner() {
    }


    public Owner(String name, String username) {
        this.name = name;
        this.username = username;
    }


//    OWNER ID Getter & Setter:


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//  OWNER NAME Getter & Setter:


    @Column(name = "name")
    public String getName() {
        return this.name = name;}


        public void setName(String name){
            this.name = name;
        }



//    OWNER USERNAME Getter & Setter:

    @Column(name = "username")
    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


//    FOLDERS Getter & Setter:


    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    public List<Folder> getFolders(){
        return this.folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }
}