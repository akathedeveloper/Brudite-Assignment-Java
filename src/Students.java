public class Students {
    private int studentId;
    private String name;
    private String email;
    private long contactNumber;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Students(String name, int studentId, String email, long contactNumber) {
        this.name = name;
        this.studentId = studentId;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
