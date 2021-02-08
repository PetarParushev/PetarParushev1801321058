package uni.pu.fmi;

/**
 * 
 */
public class Anime {

    /**
     * Default constructor
     */
    public Anime() {
    }
    
    public Anime(String title, String release_date, String genre, String summary) {
    	this.title = title;
    	this.release_date = release_date;
    	this.genre = genre;
    	this.summary = summary;
    }

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private String release_date;

    /**
     * 
     */
    private String genre;

    /**
     * 
     */
    private String summary;




    /**
     * @return
     */
    public String getTitle() {
        // TODO implement here
        return title;
    }

    /**
     * @param title 
     * @return
     */
    public void setTitle(String title) {
        this.title = title;
        return;
    }

    /**
     * @return
     */
    public String getReleaseDate() {
        // TODO implement here
        return release_date;
    }

    /**
     * @param date 
     * @return
     */
    public void setReleaseDate(String date) {
        this.release_date = date;
        return;
    }

    /**
     * @return
     */
    public String getGenre() {
        // TODO implement here
        return genre;
    }

    /**
     * @param genres
     * @return
     */
    public void setGenre(String genre) {
        this.genre = genre;
        return;
    }

    /**
     * @return
     */
    public String getSummary() {
        // TODO implement here
        return summary;
    }

    /**
     * @param summary 
     * @return
     */
    public void setSummary(String summary) {
        this.summary = summary;
        return;
    }

}
