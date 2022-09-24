package com.javedhalani.arrays;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.MINUTES;

public class CalendarMatching {

    private static final DateTimeFormatter df = DateTimeFormatter.ofPattern("H:mm");

    public static void main(String[] args) {
        List<StringMeeting> calender1 = List.of(
                new StringMeeting("9:00", "10:30"),
                new StringMeeting("12:00", "13:00"),
                new StringMeeting("16:00", "18:00")
        );
        StringMeeting dailyBounds1 = new StringMeeting("9:00", "20:00");
        List<StringMeeting> calender2 = List.of(
                new StringMeeting("10:00", "11:30"),
                new StringMeeting("12:30", "14:30"),
                new StringMeeting("14:30", "15:00"),
                new StringMeeting("16:00", "17:00")
        );
        StringMeeting dailyBounds2 = new StringMeeting("10:00", "18:30");

        int meetingDuration = 30;

        System.out.println(calendarMatching(calender1, dailyBounds1, calender2, dailyBounds2, meetingDuration));

    }

    private static List<StringMeeting> calendarMatching(
            List<StringMeeting> calendar1, StringMeeting dailyBounds1,
            List<StringMeeting> calendar2, StringMeeting dailyBounds2,
            int meetingDuration) {

        List<StringMeeting> updatedCalender1 = updateWithDailyBounds(calendar1, dailyBounds1);
        List<StringMeeting> updatedCalender2 = updateWithDailyBounds(calendar2, dailyBounds2);

        updatedCalender1.addAll(updatedCalender2);

        List<StringMeeting> sortedCalendar = updatedCalender1.stream().sorted(Comparator.comparing(StringMeeting::getStart)).collect(Collectors.toList());
        List<StringMeeting> flattenedCalender = flattenCalender(sortedCalendar);

        return  availableSlots(flattenedCalender, meetingDuration);
    }

    private static List<StringMeeting> updateWithDailyBounds(
            List<StringMeeting> calendar,
            StringMeeting dailyBounds
    ) {
        List<StringMeeting> updatedCalendar = new ArrayList<>();
        updatedCalendar.add(new StringMeeting("0:00", dailyBounds.start));
        updatedCalendar.addAll(calendar);
        updatedCalendar.add(new StringMeeting(dailyBounds.end,"23:59"));
        return updatedCalendar;
    }

    private static List<StringMeeting> availableSlots(List<StringMeeting> flattenedCalender, int meetingDuration) {

        List<StringMeeting> availableSlots = new ArrayList<>();
        for (int i = 1; i < flattenedCalender.size(); i++) {
            StringMeeting current = flattenedCalender.get(i);
            StringMeeting previous = flattenedCalender.get(i - 1);
            if (MINUTES.between(previous.getEnd(), current.getStart()) >= meetingDuration) {
                availableSlots.add(new StringMeeting(previous.end, current.start));
            }
        }

        return availableSlots;
    }

    private static List<StringMeeting> flattenCalender(List<StringMeeting> sortedCalendar) {
        List<StringMeeting> flattenedCalendar = new ArrayList<>();
        flattenedCalendar.add(sortedCalendar.get(0));
        for (int i = 1; i < sortedCalendar.size(); i++) {
            StringMeeting currentMeeting = sortedCalendar.get(i);
            StringMeeting previousMeeting = flattenedCalendar.get(flattenedCalendar.size() -1);
            if (previousMeeting.getEnd().compareTo(currentMeeting.getStart()) >= 0) {
                StringMeeting newPreviousMeeting = new StringMeeting(previousMeeting.start, getMax(previousMeeting.getEnd(), currentMeeting.getEnd()));
                flattenedCalendar.set(flattenedCalendar.size() - 1 , newPreviousMeeting);
            } else {
                flattenedCalendar.add(currentMeeting);
            }
        }
        return flattenedCalendar;
    }

    private static String getMax(LocalTime t1, LocalTime t2) {
        return t1.compareTo(t2) >= 0 ? t1.format(df) : t2.format(df);
    }
    private static class StringMeeting {
        String start;
        String end;



        public StringMeeting(String start, String end) {
            this.start = start;
            this.end = end;
        }

        public LocalTime getStart() {
            return LocalTime.parse(this.start, df);
        }

        public LocalTime getEnd() {
            return LocalTime.parse(this.end, df);
        }

        @Override
        public String toString() {
            return String.format("[%s,%s]", this.start, this.end);
        }
    }
}
