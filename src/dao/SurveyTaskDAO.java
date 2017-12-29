package dao;

import bean.SurveyTask;

import java.util.List;

public interface SurveyTaskDAO {
    public List<SurveyTask> queryAll();
    public SurveyTask queryById(int id);
    public void update(SurveyTask surveyTask);
    public void insert(SurveyTask surveyTask);
    public void deleteById(int id);

}
