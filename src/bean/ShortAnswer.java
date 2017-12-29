package bean;

public class ShortAnswer implements SurveyItem {
    String description;
    String answer;

    @Override
    public String getDescription() {
        return description;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
