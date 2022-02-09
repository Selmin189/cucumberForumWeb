package uni.fmi.role;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.role.model.DeleteScreenModel;

public class DeleteSteps {
	
	private DeleteScreenModel deleteModel;

	@Given("^потребителят отваря тема, която иска да изтрие$")
	public void userOpenTheme() throws Throwable {
	    deleteModel= new DeleteScreenModel();
	}

	@When("^потребителят е администратор$")
	public void userIsAdmin() throws Throwable {
	   deleteModel.setRoleTitle("Admin");
	}

	@When("^натиснете бутона за изчистване$")
	public void clickDeleteButton() throws Throwable {
	  deleteModel.clickDeleteButton();
	}

	@Then("^вижда съобщение за успешно изтриване\\.$")
	public void checkMessage() throws Throwable {
		assertEquals("Успешно изтриване!", deleteModel.getMessage());
	}
	@When("^потребителят не администратор$")
	public void userIsNotAdmin() throws Throwable {
		 deleteModel.setRoleTitle("User");
	}

	@Then("^вижда съобщение за неуспешно изтриване\\.$")
	public void checkMessageForFailure() throws Throwable {
		assertEquals("Вие не сте админ не можете да триете!", deleteModel.getMessage());
	}
}
