package CodeSmells_lab_6.Part_1.H_IntroduceLocalExtension;

import java.util.Date;
public class DateHelperExtended extends DateHelper{
    public static long differenceBetweenDates(Date date1, Date date2){
        long diffInMilliseconds = date2.getTime() - date1.getTime();

        long diffInDays = diffInMilliseconds / (24 * 60 * 60 * 1000);

        return diffInDays;
    }
}
