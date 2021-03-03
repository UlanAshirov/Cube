
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataInput {
    public static void infoInput() {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        try {
            while (isRunning) {
                System.out.println("Введите ваше имя или 'stop', если хотите остановиться");
                String name = scanner.next();
                if (name.equalsIgnoreCase("stop")) {
                    break;
                }

                System.out.println("На каком вы курсе?");
                int course = scanner.nextInt();
                if (course == 0) {
                    break;
                }

                System.out.println("Оценка по анлгийскому");
                int english = scanner.nextInt();
                if (english == 0) {
                    break;
                }

                System.out.println("Оценка по истории");
                int history = scanner.nextInt();
                if (history == 0) {
                    break;
                }

                System.out.println("Оценка по биологии");
                int biology = scanner.nextInt();
                if (biology == 0) {
                    break;
                }

                System.out.println("Оценка по математике");
                int mathematics = scanner.nextInt();
                if (mathematics == 0) {
                    break;
                }

                System.out.println("Оценка по физике");
                int physics = scanner.nextInt();
                if (physics == 0) {
                    break;
                }

                Student student = new Student(name, course, english, history, biology, mathematics, physics);
                students.add(student);
            }

            for (Student st : students) {
                System.out.printf("\nДанные студента %s\n", st.getName());
                System.out.printf("Имя: %s \nКурс: %d \nАнглийский: %d \nИстория: %d \nБиология: %d \nМатематика: %d \nФизика: %d\n", st.getName(), st.getCourse(), st.getEnglish(), st.getHistory(), st.getBiology(), st.getMathematics(), st.getPhysics());
                double result = AverageScore.averScore(st.getEnglish(), st.getHistory(), st.getBiology(), st.getMathematics(), st.getPhysics());
                System.out.println("Уважаемый " + st.getName() + ", Ваш средний балл = " + result);
                PrintStudent.nextCourse(result, st.getCourse());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

