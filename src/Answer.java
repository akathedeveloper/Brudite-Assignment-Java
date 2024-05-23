public class Answer {
    private int answerid;
    private String answerDesc;

    public int getAnswerid() {
        return answerid;
    }

    public void setAnswerid(int answerid) {
        this.answerid = answerid;
    }

    public String getAnswerDesc() {
        return answerDesc;
    }

    public void setAnswerDesc(String answerDesc) {
        this.answerDesc = answerDesc;
    }

    public Answer(int answerid, String answerDesc) {
        this.answerid = answerid;
        this.answerDesc = answerDesc;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerid=" + answerid +
                ", answerDesc='" + answerDesc + '\'' +
                '}';
    }
}

