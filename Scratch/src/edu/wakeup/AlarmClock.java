package edu.wakeup;

/*
* Class definition to model the workings of an alarm clock.
* This is sometimes called a "business class", "system class", or "application" class.
* It has NO main() method - classes like these don't.
 */
class AlarmClock {
   // STATIC VARIABLES
   public static final int MIN_INTERVAL = 1;
   public static final int MAX_INTERVAL = 20;

    // INSTANCE VARIABLES
   private int snoozeInterval = 5; // default value


    // CONSTRUCTORS
    public AlarmClock() {
        // no-op
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval); // delegate to setter for validation conversion
    }

    // BUSINESS METHODS / FUNCTIONS
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }

    // ACCESSOR METHODS
    public int getSnoozeInterval() {
        return snoozeInterval;
    }
    /*
    * IMPLEMENT A BUSINESS DATA CONSTRAINT -MUST BE BETWEEN 1 AND 20 (INCLUSIVE)
     */
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
           this.snoozeInterval = snoozeInterval;
       }
       else {
           System.out.println("Invalid snoozeInterval: " + snoozeInterval +
                   ". Must be between" + MIN_INTERVAL + " and " + MAX_INTERVAL + ".");
       }
    }

    /*
    * Returns a string representation of this edu.wakeup.AlarmClock object., describing it in a sentence
    * Generally includes the name of the class (its type)
     */
    public String toString(){
        return "edu.wakeup.AlarmClock: snoozeInterval=" + getSnoozeInterval();
    }
}