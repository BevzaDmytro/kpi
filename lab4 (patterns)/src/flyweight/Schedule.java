package flyweight;

public class Schedule extends Time {
    private int auditory;
    private Time timeOfBegin;
    private Discipline discipline;

    public Schedule(  int auditory, Time timeOfBegin, String disciplineName) {
        this.discipline = DisciplineFactory.getDiscipline(disciplineName);
        this.auditory = auditory;
        this.timeOfBegin = timeOfBegin;
    }


    public int getAuditory() {
        return auditory;
    }

    public void setAuditory(int auditory) {
        this.auditory = auditory;
    }


    public Time getTimeOfBegin() {
        return timeOfBegin;
    }

    public void setTimeOfBegin(Time timeOfBegin) {
        this.timeOfBegin = timeOfBegin;
    }




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
