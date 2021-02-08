package project.cucumber;

import static org.junit.Assert.assertEquals;

import Models.AddAnimeModel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAnimeSteps {
	
	AddAnimeModel anime = new AddAnimeModel();

	@Given("^потребителя отваря формата за създаване на аниме$")
	public void UserOpenNewAnimeForm() throws Throwable {
	    anime.onOpenForm();
	}

	@When("^въвежда заглавие \"([^\"]*)\"$")
	public void AddTitle(String title) throws Throwable {
		anime.setTitle(title);
	}

	@When("^въвежда дата на издаване \"([^\"]*)\"$")
	public void AddReleaseDate(String date) throws Throwable {
		anime.setDate(date);
	}

	@When("^въвежда жанр \"([^\"]*)\"$")
	public void AddGenre(String genre) throws Throwable {
		anime.setGenre(genre);
	}

	@When("^въвежда описание \"([^\"]*)\"$")
	public void AddSummary(String summary) throws Throwable {
		anime.setSummary(summary);
	}

	@When("^натиска бутона за добавяне$")
	public void OnAddButtonClick() throws Throwable {
		anime.onAddButtonClick();
	}

	@Then("^вижда съобщение с текст \"([^\"]*)\"$")
	public void ShowResponseMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, anime.printResponse());
	}
	
}
