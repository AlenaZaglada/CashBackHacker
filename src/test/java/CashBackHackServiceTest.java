

//package ru.netology.service;

//import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {

    CashBackHackService service = new CashBackHackService();

    @Test
    public void testRemainSum0() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);

    }
    @Test
    public void testRemainSum1000(){

        //тут ошибка
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void testRemainSum999(){
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainSum1001(){
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }
    @Test
    public void testRemainSum2000(){
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    }


