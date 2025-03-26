package stepDefinitions;

import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks {

    @Before("@DeletePlace")
    public void beforeScenario() throws IOException {

        StepDefinitions m = new StepDefinitions();
        if (StepDefinitions.place_id == null) {
            m.add_place_payload_with("Alemar", "French","Europe");
            m.user_calls_with_http_request("ADDPLACEAPI","POST");
            m.verify_place_id_created_maps_to_using("Alemar", "GETPLACEAPI");
        }

    }
}
