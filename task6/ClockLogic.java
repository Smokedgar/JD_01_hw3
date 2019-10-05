package by.htp.hw3.task6;
public class ClockLogic {

    public Clock createTimeObject(int hour, int minute, int second) {
	// check

	return new Clock(hour, minute, second);
    }

    public void addTime(Clock t, int hours, int minute, int second) {
	if (hours > 23 || hours < 0 || minute > 59 || minute < 0 || second > 59 || second < 0) {
	    return;
	}
	int s = t.getSecond() + second;
	int m = t.getMinute() + minute;
	int h = t.getHour() + hours;

	if (s >= 60) {
	    t.setSecond(s - 60);
	    m++;
	} else {
	    t.setSecond(s);
	}

	if (m >= 60) {
	    t.setMinute(m - 60);
	    h++;
	} else {
	    t.setMinute(m);
	}

	if (h > 23) {
	    t.setHour(h - 24);
	} else {
	    t.setHour(h);
	}
    }
}

