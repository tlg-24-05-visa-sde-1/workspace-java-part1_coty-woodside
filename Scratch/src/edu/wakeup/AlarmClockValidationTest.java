package edu.wakeup;//This is a main class focused on testing setter validation logic
// Do thorough BVT (Boundary Value Testing) on setSnoozeInterval()
//That is, check the values on the edges of the valid range, and just outside it. 0,1 and 20,21

class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);
        System.out.println(clock);

        clock.setSnoozeInterval(20);
        System.out.println(clock);

        clock.setSnoozeInterval(0);
        System.out.println(clock);
        
        clock.setSnoozeInterval(21);
        System.out.println(clock);
    }
}