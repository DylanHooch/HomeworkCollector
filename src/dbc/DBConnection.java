package dbc;

import java.sql.Connection;

public interface DBConnection {
    public Connection getConnection();
    public void close();
}
