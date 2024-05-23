import java.util.List;

public class Assignment {
    private int assignmentId;
    private String title;
    private String description;
    private String dueDate;
    private List<Question> ques;


    public Assignment(int assignmentId, String title, String description, String dueDate, List<Question> ques) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.ques = ques;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public List<Question> getQues() {
        return ques;
    }

    public void setQues(List<Question> ques) {
        this.ques = ques;
    }
}
