package dbc.impl;

import dbc.DBConnectionFactory;

public class MySqlConnectionFactory implements DBConnectionFactory {
    public MySqlConnection create()
    {
        return new MySqlConnection();
    }
}
