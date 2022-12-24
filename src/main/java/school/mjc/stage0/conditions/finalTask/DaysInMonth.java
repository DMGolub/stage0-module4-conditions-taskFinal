package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
        } else {
            if (isLeapYear(year) && month == 2) {
                System.out.println(29);
            } else {
                int days = daysInMonth(month);
                System.out.println(days);
            }
        }

    }

    private boolean isLeapYear(int year) {
        return year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
    }

    private int daysInMonth(int month) {
        int days = 0;
        switch (month) {
            case 2 -> days = 28;
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
        }
        return days;
    }
}