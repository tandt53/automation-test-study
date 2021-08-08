package tandt.study.cucumber;

//import com.google.inject.Inject;
import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;
import java.util.Set;

@ScenarioScoped
public class StepDef01 {

    @Inject
    private StepDef02 stepDef02;
//    @Inject
//    public StepDef01(StepDef02 stepDef02){
//        this.stepDef02 = stepDef02;
//        System.out.println("12345678");
//    }

    @Given("^I give an action for precondition$")
    public void iGiveAnActionForPrecondition() {
        System.out.println("I give an action for precondition");
    }

    @When("I do the first action with parameter {string}")
    public void iDoTheFirstActionWithParameter(String param) {
        System.out.println("I do the first action with parameter " + param);
    }

    @And("I have {int} cucumber(s) in my belly/stomach")
    public void iHaveCucumberInMyBelly(int arg0) {
        System.out.println("I have " + arg0 + " cucumber(s) in my belly/stomach");
    }

    @And("I also do the second action with data table")
    public void iAlsoDoTheSecondActionWithDataTable(DataTable dataTable) {
//        List<List<String>> list = dataTable.asLists();
        List<Map<String, String>> maps = dataTable.asMaps();
        System.out.println("maps size: " + maps.size());
        for (int i = 0; i < maps.size(); i++) {
            Map<String, String> m = maps.get(i);
            System.out.println("map with index " + i);
            Set<String> keys = m.keySet();
            for (String k : keys) {
                System.out.println("key: " + k + "; value: " + m.get(k));
            }
            System.out.println("\n");
        }

    }

    @And("I also do the second action with parameter {string}")
    public void iAlsoDoTheSecondActionWithParameter(String param) {
        System.out.println("I also do the second action with parameter " + param);
    }

    @When("I do the first action with parameter")
    public void iDoTheFirstActionWithParameter(DataTable dataTable) {
        List<String> data = dataTable.asList();
        for(String d: data){
            System.out.println(d);
        }

    }



}
