package net.flix;

public class Movie {
    //INSTANCE VARIABLES - fields
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // CONSTRUCTORS -
    public Movie(String title) {
        setTitle(title);
    }

    public Movie (String title, Genre genre){
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear, Double revenue) {
        this(title);            //delegate to constructor above that handles title
        setReleaseYear(releaseYear);
        setRevenue(revenue);

    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title, releaseYear, revenue);
        setRating(rating);
        setGenre(genre);
    }


    //BUSINESS FUNCTIONS - action methods - play(), pause ()


    //ACCESSOR METHODS - getters and setters
    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    //todo : if revenue is null, use %s, otherwise use %,.2f


    public String toString(){
     //   return "Movie: title=" + getTitle() + ", releaseYear =" + getReleaseYear() +
        //        ", revenue=" + getRevenue() + ", rating=" + getRating() + ", genre=" + getGenre();

        return String.format("Movie: title=%s, releaseYear=%s, revenue=%,.2f, rating=%s, genre=%s",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
    }
}