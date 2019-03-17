package lab;

import java.util.Date;

public class Time implements ITime{

    private String hours;
    private String minutes;


    private Date time;

    public Time() {
        this.hours = "00";
        this.minutes = "00";

    }
    public Time(String hours, String minutes) {

        this.hours = hours;
        this.minutes = minutes;
        if(Integer.valueOf(hours) > 24 || Integer.valueOf(hours)<0 || Integer.valueOf(minutes) > 59 || Integer.valueOf(minutes)<0){
            this.hours = "00";
            this.minutes = "00";
        }
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }



    @Override
    public String toString() {
        return "labs.Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }

    @TestAnnotation
    public String getTime(){
        return hours+":"+minutes;
    }

    public void setTime(String minutes, String hours){
        this.hours = hours;
        this.minutes = minutes;
    }
}
