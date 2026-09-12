package Hooks;

import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest
{

    @Before
    public void setUp() {
    	initialization();
    }

    @After
    public void exit() {
    	conclude();
    }
}
