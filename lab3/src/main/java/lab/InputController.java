package lab;

public class InputController {

    private View view;

    public InputController() {
        this.view = new View();
    }

    public String getDisciplineFromUser() {
        return "Math";
    }

    public String getTimeFromUser() {
        return "18:20";
    }


    public int getAuditoryFromUser() {
        return 1;
    }

    public Schedule getNextLesson() {
        view.showText("Введите название дисциплины");
        String discipline = this.getDisciplineFromUser();
        view.showText("Введите аудиторию");
        int auditory = this.getAuditoryFromUser();
        view.showText("Введите время начала занятия в формате 'HH:MM'");
        String timeOfNextLesson = "20:00";
        String[] hours = timeOfNextLesson.split(":");

        return new Schedule(discipline,auditory,new Time(hours[0],hours[1]));
    }
}
