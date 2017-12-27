package bean;

public class Homework {
    private String filename;
    private String md5;

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public String getMd5() {
        return md5;
    }
}
