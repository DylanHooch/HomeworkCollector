package bean;

import java.util.List;

public class Choice implements SurveyItem {
    private String description;
    private List<String> options;
    public Choice(){
        description=null;
        options=null;
    }

    @Override
    public String getDescription() {
        return description;
    }
    public List<String> getOptions(){
        return options;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

}
