package net.flix;

public enum Genre {
    COMEDY("Romance"),
    HORROR("Horror"),
    SPORTS("Sports!"),
    ROMANCE("Romance :("),
    ACTION("A_C_T_I_O_N"),
    SCI_FI("Science Fiction"),
    DRAMA("Drama..."),
    WESTERN("Howdy!");

    //everything under here is regular class definition stuff, fields, constructors, methods

    private String display;

    Genre (String display){
      //  System.out.println("Genre constructor called");
        this.display = display;
    }

    //we provide a getter only - no setter
    public String getDisplay() {
        return display;
    }

    public String toString(){
        return display;
    }
}