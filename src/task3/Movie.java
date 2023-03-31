package task3;

import java.util.Calendar;

public class Movie {
    private String title;
    private int year;

    public Movie(String title, int year) {
        this.title = title;
        if (isCorrectYear(year)) {
            this.year = year;
        } else {
            throw new InvalidYearException("invalid year", year);
        }
    }

    private boolean isCorrectYear(int year) {
        return year >= 1900 && year <= Calendar.getInstance().get(Calendar.YEAR);
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(short year) {
        if (isCorrectYear(year)) {
            this.year = year;
        } else {
            throw new InvalidYearException("invalid year", year);
        }
    }

    @Override
    public String toString() {
        return "title: " + title + "\nyear: " + year;
    }
}
