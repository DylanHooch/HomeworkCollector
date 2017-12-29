package dao;

import bean.Survey;
import bean.SurveyTask;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public interface SurveyDAO {
    public List<Survey> queryAll();
    public Survey queryById(int id);
    public void update(Survey survey);
    public void insert(Survey survey);
    public void deleteById(int id);
}
