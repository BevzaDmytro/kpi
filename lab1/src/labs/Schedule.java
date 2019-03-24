package labs;

public class Schedule extends Time {

    private String discipline;
    private int auditory;
    private Time timeOfBegin;

    public Schedule( String discipline, int auditory, Time timeOfBegin) {
        this.discipline = discipline;
        this.auditory = auditory;
        this.timeOfBegin = timeOfBegin;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getAuditory() {
        return auditory;
    }

    public void setAuditory(int auditory) {
        this.auditory = auditory;
    }

    @TestAnnotation
    public Time getTimeOfBegin() {
        return timeOfBegin;
    }

    public void setTimeOfBegin(Time timeOfBegin) {
        this.timeOfBegin = timeOfBegin;
    }



    @TestAnnotation
    public Time calculateTimeToLessonBegin(){
        Time timeToBegin = new Time();

        return timeToBegin;
    }
}
