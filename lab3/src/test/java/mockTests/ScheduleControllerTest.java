package mockTests;


import lab.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import java.util.Scanner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;



public class ScheduleControllerTest {

    @Test
    public void findLessonTest() {

        InputController mcontroller = mock(InputController.class);
        when(mcontroller.getNextLesson()).thenReturn(new Schedule("Math", 1, new Time("20", "00")));

        ScheduleController controller = new ScheduleController(new View(), mcontroller);


        assertTrue(controller.findLesson("Math"));
//        assertFalse(controller.findLesson("IT"));
        verify(mcontroller).getNextLesson();
    }

    @Test
    public void getTimeToLessonTest(){

        InputController mcontroller = mock(InputController.class);
        ScheduleController controller = new ScheduleController(new View(),mcontroller);

        when(mcontroller.getNextLesson()).thenReturn(new Schedule("Math",1,new Time("20","00")));
        when(mcontroller.getTimeFromUser()).thenReturn("18:10");

        verify(mcontroller).getNextLesson();
        verify(mcontroller).getTimeFromUser();

//        assertEquals("01:40",controller.getTimeToLesson());
        assertEquals("01:50",controller.getTimeToLesson());
    }
}
