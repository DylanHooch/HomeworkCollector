package util;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

public abstract class DBOperationUtil {
    private static Connection connection = null;
    private int lid=1;

    private static Connection connectDB() {
        if (connection == null) {
            String driverName = "com.mysql.jdbc.Driver";
            String dbURL = "jdbc:mysql://rm-wz9h00p5lzhh2mkbjao.mysql.rds.aliyuncs.com:3306";
            String sqltype = "mysql";
            try {
                Class.forName(driverName);
                Connection dbConn = DriverManager.getConnection(dbURL, "root", "123456qwerty!");
                return dbConn;

            } catch (Exception e)

            {

                e.printStackTrace();
                return null;
            }
        } else return connection;

    }
    private static String getPassword(){
        String path = DBOperationUtil.class.getClassLoader().getResource("pw").getPath();//通过URI形式
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
