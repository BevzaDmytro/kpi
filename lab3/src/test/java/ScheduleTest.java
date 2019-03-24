import lab.Schedule;
import lab.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScheduleTest {


    @Test
    public void testAll(){
        this.testTime();
        this.testSchedule();
    }


    @Test
    public void testTime(){
        Time time = new Time("01","02");
        assertEquals("01:02",time.getTime());

        assertEquals("01",time.getHours());
        assertEquals("02",time.getMinutes());


        time = new Time("25","21");
        assertNotEquals("25:21",time.getTime());
    }


    @Test
    public void testSchedule(){
        Schedule schedule = new Schedule("Math",11, new Time());
        assertEquals("01:00",schedule.calculateTimeToLessonBegin(new Time("23","00")));


        schedule = new Schedule("Math",11,new Time("23","40"));
        assertEquals("00:40",schedule.calculateTimeToLessonBegin(new Time("23","00")));

        schedule = new Schedule("Math",11,new Time("08","30"));
        assertEquals("08:50",schedule.calculateTimeToLessonBegin(new Time("23","40")));

        assertNotEquals("09:30",schedule.calculateTimeToLessonBegin(new Time("23","40")));


        schedule = new Schedule("Math",11,new Time("23","30"));
        assertNotEquals("01:30",schedule.calculateTimeToLessonBegin(new Time("25","00")));
    }


}
