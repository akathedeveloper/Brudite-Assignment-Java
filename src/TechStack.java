public class TechStack {
    private int techStackId;
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTechStackId() {
        return techStackId;
    }

    public void setTechStackId(int techStackId) {
        this.techStackId = techStackId;
    }

    public TechStack(int techStackId, String name, String description) {
        this.techStackId = techStackId;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "TechStack{" +
                "techStackId=" + techStackId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
