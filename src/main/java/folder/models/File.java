package models;

import folder.models.Folder;

import javax.persistence.*;


@Entity
@Table(name="files")
public class File {

    private String name;
    private String extension;
    private int size;
    private Folder folder;
    private int id;

    public File(){

    }

    public File(String name, String extension, int size, Folder folder, int id) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name="extension")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    @Column(name="size")
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @ManyToOne
    @JoinColumn(name= "folder_id", nullable = false)
    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
