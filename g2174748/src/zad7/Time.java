package zad7;

public class Time {
    public int hours;
    public int minutes;


    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public static Time addTime(Time time, Time othertime) {
        time.minutes += othertime.minutes;
        time.hours += othertime.hours;
        if (time.minutes > 59 ) {
            time.minutes-=60;
            time.hours++;
            if (time.hours > 23) {
                System.out.println("jest kolejny dzień");
                time.hours-=24;
            }
        }
        return new Time(time.hours, time.minutes);
    }
}



