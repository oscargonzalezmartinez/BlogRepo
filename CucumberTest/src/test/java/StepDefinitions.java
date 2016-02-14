import org.ogm.cucumber.Calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	/**
	 * Objeto de negocio a validar
	 */
	private Calculator calc = new Calculator();
	private Integer resultado = null;
  @Given("^He introducido los numeros (\\d+) y (\\d+)$")
  public void he_introducido_los_numeros_y(int arg1,int arg2) throws Throwable {
	  calc.add(arg1).add(arg2);
  }

  @When("^Cuando sumo$")
  public void cuando_sumo() throws Throwable {
	  resultado = calc.sum();
  }

  @Then("^Resultado es (\\d+)")
  public void resultado_es(Integer realResult) throws Throwable {
      //String actualSound = belly.getSound(waitingTime);
      if (!realResult.equals(resultado)){
    	  throw new RuntimeException(realResult + "!=" + resultado);
      }
  }
  
  @When("^Cuando resto$")
  public void cuando_resto() throws Throwable {
	  resultado = calc.sub();
  }

  
//    @Given("^I have (\\d+) cukes in my belly$")
//    public void i_have_cukes_in_my_belly(int cukes) throws Throwable {
////        belly = new Belly();
////        belly.eat(cukes);
//    }
//
//    @When("^I wait (\\d+) hour$")
//    public void i_wait_hour(int waitingTime) throws Throwable {
//      //  this.waitingTime = waitingTime;
//    	throw new RuntimeException("Hambre!!!");
//    }
//
//    @Then("^my belly should (.*)$")
//    public void my_belly_should_growl(String expectedSound) throws Throwable {
//        //String actualSound = belly.getSound(waitingTime);
//        //assertThat(actualSound, is(expectedSound));
//    }
}
