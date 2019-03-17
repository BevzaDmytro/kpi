package lab;

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
    public String calculateTimeToLessonBegin(Time currentTime){
        Time timeToBegin = currentTime;

        int hours = (Integer.valueOf(this.timeOfBegin.getHours()) >= Integer.valueOf(timeToBegin.getHours())) ?Integer.valueOf(this.timeOfBegin.getHours()) - Integer.valueOf(timeToBegin.getHours()) : 24 + Integer.valueOf(this.timeOfBegin.getHours()) - Integer.valueOf(timeToBegin.getHours()) ;
        int minutes = (Integer.valueOf(this.timeOfBegin.getMinutes()) >= Integer.valueOf(timeToBegin.getMinutes())) ?Integer.valueOf(this.timeOfBegin.getMinutes()) - Integer.valueOf(timeToBegin.getMinutes()) : 60 + Integer.valueOf(this.timeOfBegin.getMinutes()) - Integer.valueOf(timeToBegin.getMinutes()) ;

        if(Integer.valueOf(this.timeOfBegin.getMinutes()) < Integer.valueOf(timeToBegin.getMinutes())){
            hours--;
        }
        String hoursRes = hours>10 ? String.valueOf(hours) : "0"+String.valueOf(hours);
        String minsRes = minutes>10 ? String.valueOf(minutes) : "0"+String.valueOf(minutes);
        return hoursRes+":"+minsRes;
    }
}
