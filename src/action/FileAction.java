package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileAction extends ActionSupport{
    private File upload;
    private String uploadContentType;
    private String uploadFileName;
    private String savePath;
    public String getSavePath() throws Exception{
        return ServletActionContext.getRequest().getRealPath(savePath);
    }

    public File getUpload() {
        return upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String up() throws Exception{
        String fileName=getSavePath()+"\\"+getUploadFileName();
        FileOutputStream fos=new FileOutputStream(fileName);
        FileInputStream fis=new FileInputStream(getUpload());
        byte[] b=new byte[1024];
        int len=0;
        while((len=fis.read(b))>0){
            fos.write(b,0,len);
        }
        return SUCCESS;
    }
}
