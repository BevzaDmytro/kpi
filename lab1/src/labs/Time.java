package labs;

public class Time implements ITime{

    private String hours;
    private String minutes;
    private String seconds;


    public Time() {
        this.hours = "00";
        this.minutes = "00";
        this.seconds = "00";
    }
    public Time(String hours, String minutes, String seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
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

    public String getSeconds() {
        return seconds;
    }

    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "labs.Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    @TestAnnotation
    public String getTime(){
        return hours+":"+minutes+":"+seconds;
    }

    public void setTime(String minutes, String hours){
        this.hours = hours;
        this.minutes = minutes;
    }
}
