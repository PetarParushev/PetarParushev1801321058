package Services;

import java.util.ArrayList;

import uni.pu.fmi.Anime;


public class AddAnimeService {

	public static ArrayList<Anime> getAnimes() {
		final Anime anime = new Anime("test", "test", "test", "test");
		
		final ArrayList<Anime> results = new ArrayList<Anime>();
		results.add(anime);
		
		return results;
	}
	
	public static String addAnime(String title, String date, String genre, String summary) {
		ArrayList<Anime> animes = getAnimes();
		final Anime anime = new Anime(title, date, genre, summary);
		animes.add(anime);
		
		if(title == null) {
			return "Моля добавете заглавие!";
		} else if (date == null) {
			return "Моля добавете дата на издаване!";
		} else if (genre == null) {
			return "Моля добавете жанр!";
		} else if (summary == null) {
			return "Моля добавете описание!";
		}
		
		return animes.contains(anime) ? "Успешно добавено аниме!" : "";
	}
}