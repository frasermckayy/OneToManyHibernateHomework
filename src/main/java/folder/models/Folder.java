package folder.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.File;
import java.util.Set;


@Entity
@Table(name="folders")
public class Folder {

    private String title;
    private Set<File> files;

    public Folder(String title) {
        this.title = title;

    }

    public Folder() {
    }

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @OneToMany(mappedBy = "folder")
    public Set<File> getFiles() {
        return files;
    }

    public void setFiles(Set<File> files) {
        this.files = files;
    }
}
