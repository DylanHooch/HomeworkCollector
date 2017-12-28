package dbc.impl;

import dao.SurveyDAO;
import dbc.DBConnection;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection implements DBConnection {
    private String driverName;
    private String dbUrl;
    private String sqlType;
    private String user;
    private String pw;
    private Connection conn=null;
    public MySqlConnection(){
        String path = MySqlConnection.class.getClassLoader().getResource("database.properties").getPath();
        Configurations configs=new Configurations();
        try {
            PropertiesConfiguration config = configs.properties(new File(path));
            driverName=config.getString("driverName");
            dbUrl=config.getString("dbUrl");
            sqlType=config.getString("sqlType");
            user=config.getString("user");
            pw=config.getString("pw");
        }
        catch (ConfigurationException e)
        {
            e.printStackTrace();
        }
        try{
            Class.forName(driverName);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            conn=DriverManager.getConnection(dbUrl,user,pw);
            if(conn==null){
                System.out.println("connection to "+dbUrl+"fail");
            }else{
                System.out.println("connected to "+dbUrl);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    @Override
    public Connection getConnection() {
        return conn;
    }

    @Override
    public void close() {
        try {
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
