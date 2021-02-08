package Models;

import Services.AddAnimeService;

public class AddAnimeModel {
	
	private String title;
	private String release_date;
	private String genre;
	private String summary;
	private String message;
	
	public void onOpenForm() {
		System.out.println("Формата е отворена.");
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDate(String date) {
		release_date = date;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public void onAddButtonClick() {
		message = AddAnimeService.addAnime(title, release_date, genre, summary);
	}
	
	public String printResponse() {
		return message;
	}
}
