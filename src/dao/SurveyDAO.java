package dao;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

public abstract class SurveyDAO {
    private Connection connection = null;



    private String getPassword(){
        String path = SurveyDAO.class.getClassLoader().getResource("pw").getPath();//通过URI形式
        String pw=null;
        File file=new File("pw");
        if(file.exists()) {
            try {
                FileInputStream in = new FileInputStream(path);
                FileInputStream fis = new FileInputStream(file);

            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        return pw;
    }

}
