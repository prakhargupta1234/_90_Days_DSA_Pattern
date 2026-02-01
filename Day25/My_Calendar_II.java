package Day25;

import java.awt.List;

public class My_Calendar_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class MyCalendarTwo {

    List<int[]> bookings;
    List<int[]> overlaps;

    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        overlaps = new ArrayList<>();
    }

    public boolean book(int start, int end) {

        for (int[] o : overlaps) {
            if (Math.max(o[0], start) < Math.min(o[1], end)) {
                return false;
            }
        }

        for (int[] b : bookings) {
            int s = Math.max(b[0], start);
            int e = Math.min(b[1], end);
            if (s < e) {
                overlaps.add(new int[]{s, e});
            }
        }

        bookings.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */