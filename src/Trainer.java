import java.util.List;

public class Trainer {
    private int trainerId;
    private String name;
    private String email;
    private long contactNo;
    private List<TechStack> techSk;

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public List<TechStack> getTechSk() {
        return techSk;
    }

    public void setTechSk(List<TechStack> techSk) {
        this.techSk = techSk;
    }

    public Trainer(String name, int trainerId, String email, long contactNo, List<TechStack> techSk) {
        this.name = name;
        this.trainerId = trainerId;
        this.email = email;
        this.contactNo = contactNo;
        this.techSk = techSk;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerId=" + trainerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactNo=" + contactNo +
                ", techSk=" + techSk +
                '}';
    }
}
