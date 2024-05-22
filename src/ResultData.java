import java.util.List;

public class ResultData {
    private List<Result> result;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public ResultData(List<Result> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "result=" + result +
                '}';
    }
}
