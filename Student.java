public class Student {
    private String name;
    private int course;
    private int english;
    private int history;
    private int biology;
    private int mathematics;
    private int physics;

    public Student() {
    }

    public Student(String name, int course, int english, int history, int biology, int mathematics, int physics) {
        this.name = name;
        this.course = course;
        this.english = english;
        this.history = history;
        this.biology = biology;
        this.mathematics = mathematics;
        this.physics = physics;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getEnglish() {
        return english;
    }

    public int getHistory() {
        return history;
    }

    public int getBiology() {
        return biology;
    }

    public int getMathematics() {
        return mathematics;
    }

    public int getPhysics() {
        return physics;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", english=" + english +
                ", history=" + history +
                ", biology=" + biology +
                ", mathematics=" + mathematics +
                ", physics=" + physics +
                '}';
    }
}
