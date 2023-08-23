package Fanatics;

import java.util.ArrayList;
import java.util.List;

class Meeting {
    int start;
    int end;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MeetingOverlap {
    public static List<Meeting> findOverlap(List<Meeting> meetings) {
        List<Meeting> overlapMeetings = new ArrayList<>();

        // Compare each pair of meetings
        for (int i = 0; i < meetings.size(); i++) {
            Meeting meeting1 = meetings.get(i);

            for (int j = i + 1; j < meetings.size(); j++) {
                Meeting meeting2 = meetings.get(j);

                // Check for overlap
                if (meeting1.end < meeting2.start || meeting2.end < meeting1.start) {
                    // Calculate the overlap range
                    int overlapStart = Math.max(meeting1.start, meeting2.start);
                    int overlapEnd = Math.min(meeting1.end, meeting2.end);

                    // Create a new meeting with the overlap range
                    Meeting overlapMeeting = new Meeting(overlapStart, overlapEnd);
                    overlapMeetings.add(overlapMeeting);
                }
            }
        }

        return overlapMeetings;
    }

    public static boolean doMeetingsOverlap(Meeting meeting1, Meeting meeting2) {
        // Check if the end time of meeting1 is before the start time of meeting2
        // or if the end time of meeting2 is before the start time of meeting1
        if (meeting1.end < meeting2.start || meeting2.end < meeting1.start) {
            return false; // Meetings do not overlap
        }
        
        return true; // Meetings overlap
    }

    public static void main(String[] args) {
        // Create a list of meetings
        List<Meeting> meetings = new ArrayList<>();
        meetings.add(new Meeting(1, 3));
        meetings.add(new Meeting(2, 4));
        meetings.add(new Meeting(5, 7));
        meetings.add(new Meeting(6, 8));

        // Find the overlap of meetings
        List<Meeting> overlapMeetings = findOverlap(meetings);

        // Print the overlap meetings
        System.out.println("Overlap Meetings:");
        for (Meeting meeting : overlapMeetings) {
            System.out.println("[" + meeting.start + ", " + meeting.end + "]");
        }
    }
}
