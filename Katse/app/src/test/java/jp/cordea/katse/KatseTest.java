package jp.cordea.katse;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cordea on 2016/10/09.
 */
public class KatseTest {

    private Katse katse;

    @Before
    public void setUp() throws Exception {
        katse = new Katse();
    }

    @Test
    public void getA() throws Exception {
        assertEquals("a", katse.getA());
    }

    @Test
    public void getB() throws Exception {
        assertEquals("b", katse.getB(false));
    }

}