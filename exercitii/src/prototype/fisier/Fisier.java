package prototype.fisier;

public class Fisier implements Prototype {
    private String name;
    private String fileType;
    private int fileSize;

    public Fisier(String name, String fileType, int fileSize) {
        this.name = name;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }

//    constructor de copiere
    public Fisier(Fisier fileToCopy) {
        this.name = fileToCopy.name;
        this.fileType = fileToCopy.fileType;
        this.fileSize = fileToCopy.fileSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "Fisier{" +
                "name='" + name + '\'' +
                ", fileType='" + fileType + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }

    @Override
    public Prototype clone() {
       return new Fisier(this);
    }
}
