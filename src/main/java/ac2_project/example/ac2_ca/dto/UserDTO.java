package ac2_project.example.ac2_ca.dto;

public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private double grade;
    private int totalCoursesCompleted;
    private boolean isPremium;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getTotalCoursesCompleted() {
        return totalCoursesCompleted;
    }

    public void setTotalCoursesCompleted(int totalCoursesCompleted) {
        this.totalCoursesCompleted = totalCoursesCompleted;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }
}
