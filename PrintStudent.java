public class PrintStudent {
    public static void nextCourse(double average, int course) {
        if (average >= 3) {
            System.out.println("Вы переходите на " + (course + 1) + " курс");
        } else {
            System.out.println("Вы остались на " + course + " курсе");
        }
    }
}
