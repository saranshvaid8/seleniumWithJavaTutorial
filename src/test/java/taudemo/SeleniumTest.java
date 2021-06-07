package taudemo;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class SeleniumTest {


    @BeforeAll
    public void beforeAll() {

    }

    @AfterAll
    public void afterAll() {

    }

    @Test
    public void openThePageAndCheckTheTitle() {
        //Do something
        assertEquals("expected", "expected");
    }

    @Test
    public void openTheOrgPageAndCheckTheTitle() {
        //Do something
        assertEquals("", "");
    }
}
