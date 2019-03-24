package lab;

import java.util.Scanner;

public class ScheduleController {
    private View view;
     private Scanner in;
    private Schedule schedule;
    private InputController inputController;

    public ScheduleController(View view) {
        this.view = view;
        this.in = new Scanner(System.in);
        this.inputController = new InputController();
        this.schedule =  inputController.getNextLesson();
    }

    public ScheduleController(View view, InputController inputController) {
        this.view = view;
        this.inputController = inputController;
        this.schedule = inputController.getNextLesson();
    }


    public void run(){

        this.view.showText("Введите название дицсиплины, время до которой необходимо посчитать");
        String input = this.in.next();

         if(this.findLesson( input)) {
             this.view.showText( this.getTimeToLesson());
         }
         else {
             this.view.showText("Дисциплина не найдена");
         }
    }

    public boolean findLesson(String nameOfLesson) {
        return this.schedule.getDiscipline().equals(nameOfLesson);
    }

    public String getTimeToLesson() {
        this.view.showText("Введите время в формате 'HH:MM':");
//        String time = this.in.next();
        String time = inputController.getTimeFromUser();
        String[] hours = time.split(":");
        if(this.schedule == null){
            this.schedule = inputController.getNextLesson();
        }
        return this.schedule.calculateTimeToLessonBegin(new Time(hours[0],hours[1]));
    }

}
