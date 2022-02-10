package uni.fmi.role;



import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleSteps {
	
	private RoleModel model;

	@Given("^Отворете полето за изтриване на коментари$")
    public void start_comment_crud() {
        model = new RoleModel();
    }

	@When("^Посочете потребителско име: \"([^\"]*)\"$")
    public void specify_username(String username) {
        model.setUsername(username);
    }

	@When("^Посочете заглавието на коментара: \"([^\"]*)\"$")
    public void specify_comment_title(String commentTitle) {
        model.setCommentTitle(commentTitle);
    }


	@When("^Щракнете върху бутона за изтриване$")
    public void click_delete_button() {
        model.clickDeleteButton();
    }    


	@Then("^Показване на съобщение: \"([^\"]*)\"$")
    public void display_message(String expectedMessage) {
        assertEquals(expectedMessage, model.getMessage());
    }
}
