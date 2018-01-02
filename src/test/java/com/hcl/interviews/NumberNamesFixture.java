package com.hcl.interviews;

import static com.hcl.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;


public class NumberNamesFixture {
	
	private NumberNames numberNames;

    @Test
    public void numberNamesAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("NumberNames.story")
                .run();
    }

    @When("the input is $input")
    public void whenInputIs(long input) {
    	numberNames.int2Text(input);
        
    }

    @Then("the output will be $")
    public void thenTheOutputShouldLookLike(String theExpectedOutput) {
    	
    }
}
