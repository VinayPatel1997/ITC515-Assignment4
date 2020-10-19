package library.entities;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class CalendarTest {

    // this function intend to give difference between two dates
    @Test
    public void getDaysDifference() {
        Calendar calendar = Calendar.getInstance();
        Date date = library.entities.Calendar.getInstance().getDate();

        calendar.setTime((Date)date.clone());
        // setting due date, two days before current date
        calendar.add(Calendar.DATE,-2);

        long actualResult = library.entities.Calendar.getInstance().getDaysDifference(calendar.getTime());
        long expectedResult = 2L;

        assertEquals(expectedResult,actualResult);
    }
}