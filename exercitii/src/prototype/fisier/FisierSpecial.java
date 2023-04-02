package prototype.fisier;

public class FisierSpecial extends Fisier implements Prototype {

    private String openingProgram;

    public FisierSpecial(String name, String fileType, int fileSize, String openingProgram) {
        super(name, fileType, fileSize);
        this.openingProgram = openingProgram;
    }

    public FisierSpecial(FisierSpecial fisierSpecial) {
        super(fisierSpecial);
        this.openingProgram = fisierSpecial.openingProgram;
    }

    public String getOpeningProgram() {
        return openingProgram;
    }

    public void setOpeningProgram(String openingProgram) {
        this.openingProgram = openingProgram;
    }

    @Override
    public String toString() {
        return "FisierSpecial{" +
                "name='" + getName() + '\'' +
                ", fileType='" + getFileType() + '\'' +
                ", fileSize=" + getFileSize() + '\'' +
                "openingProgram='" + openingProgram + '\'' +
                '}';
    }

    @Override
    public Prototype clone() {
        return new FisierSpecial(this);
    }


}
