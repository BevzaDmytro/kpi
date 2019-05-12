package singleton;

import java.util.Date;

public class SingleTime {

    private static SingleTime instance = null;

//    private SingleTime(){}


    private String hours;
    private String minutes;


    private Date time;

    private SingleTime() {
        this.time = new Date();
        this.hours = String.valueOf(this.time.getHours());
        this.minutes = String.valueOf(this.time.getMinutes());

    }

    public static SingleTime getInstance() {
        if (instance == null) {
            instance = new SingleTime();
        }
        return instance;
    }



    public SingleTime(String hours, String minutes) {

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

    public String getTime(){
        return hours+":"+minutes;
    }

    public void setTime(String minutes, String hours){
        this.hours = hours;
        this.minutes = minutes;
    }
}
