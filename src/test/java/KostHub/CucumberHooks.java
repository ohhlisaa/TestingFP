package KostHub;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class CucumberHooks {
    @Before
    public static void beforeAll() throws MalformedURLException {
        Base.beforeTest();
    }

    @After
    public static void afterAll(){
        Base.afterTest();
    }
}
