package uni.fmi.topic;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.topic.model.TopicScreenModel;


public class topicSteps {
	
	private TopicScreenModel commModel;
	
	
	@Given("^отваря полето за коментари$")
	public void openFieldForComment() throws Throwable {
	  commModel= new TopicScreenModel();
	}
	
	@Given("^потребител e регистриран \"([^\"]*)\"$")
	public void userIsRegistred(final String user) throws Throwable {
		 commModel.setUser(user);
	}

	@Given("^напише нешто \"([^\"]*)\"$")
	public void writeSomthing(final String comment) throws Throwable {
	    commModel.setContent(comment);
	}

	@When("^натисне бутона за публиковане на тема$")
	public void clickAddComment() throws Throwable {
	 commModel.clickAddButton();
	}

	@Then("^вижда сьобштение за успех \"([^\"]*)\"$")
	public void checkMessage(final String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, commModel.getMessage());
	}
	@Given("^потребител e не регистриран \"([^\"]*)\"$")
	public void потребител_e_не_регистриран(final String comment) throws Throwable {
		commModel.setUser(comment);
	}

	@Then("^вижда сьобштение за неуспех \"([^\"]*)\"$")
	public void checkMessages(final String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, commModel.getMessage());
	}
	@Given("^не напише ништо$")
	public void emptyField() throws Throwable {
	   commModel.setContent(null);
	}

	@Then("^вижда сьобштение \"([^\"]*)\"$")
	public void checkMessage2(final String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, commModel.getMessage());
	}
	@Given("^напише обиден коментар \"([^\"]*)\"$")
	public void напише_обиден_коментар(final String comment) throws Throwable {
		   commModel.setContent("S");
	}

}
