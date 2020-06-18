package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsCarTest {
    @Test
    public void should_return_00W_when_commend_L_given_00N(){
        //given
        Position position = new Position(0,0,"N");
        MarsCar marsCar = new MarsCar(position);
        String str = "L";
        //List<String> commd = Arrays.asList(str);
        //when
        String result = marsCar.move(str);
        //then
        assertEquals("(0,0)W",result);
    }

    @Test
    public void should_return_00E_when_commend_R_given_00N(){
        //given
        Position position = new Position(0,0,"N");
        MarsCar marsCar = new MarsCar(position);

        String str = "R";
        //List<String> commd = Arrays.asList(str);
        //when
        String result = marsCar.move(str);
        //then
        assertEquals("(0,0)E",result);
    }

    @Test
    public void should_return_01N_when_commend_M_given_00N(){
        //given
        Position position = new Position(0,0,"N");
        MarsCar marsCar = new MarsCar(position);

        String str = "M";
        //List<String> commd = Arrays.asList(str);
        //when
        String result = marsCar.move(str);
        //then
        assertEquals("(0,1)N",result);
    }

    @Test
    public void should_return_f10W_when_commend_M_given_00W(){
        //given
        Position position = new Position(0,0,"W");
        MarsCar marsCar = new MarsCar(position);

        String str = "M";
        //List<String> commd = Arrays.asList(str);
        //when
        String result = marsCar.move(str);
        //then
        assertEquals("(-1,0)W",result);
    }

    @Test
    public void should_return_00S_when_commend_M_given_00W(){
        //given
        Position position = new Position(0,0,"W");
        MarsCar marsCar = new MarsCar(position);

        String str = "L";
        //List<String> commd = Arrays.asList(str);
        //when
        String result = marsCar.move(str);
        //then
        assertEquals("(0,0)S",result);
    }

    @Test
    public void should_return_00N_when_commend_M_given_00W(){
        //given
        Position position = new Position(0,0,"W");
        MarsCar marsCar = new MarsCar(position);

        String str = "R";
        //List<String> commd = Arrays.asList(str);
        //when
        String result = marsCar.move(str);
        //then
        assertEquals("(0,0)N",result);
    }

    @Test
    public void should_return_0f1S_when_commend_M_given_00S(){
        //given
        Position position = new Position(0,0,"W");
        MarsCar marsCar = new MarsCar(position);

        String str = "M";
        //List<String> commd = Arrays.asList(str);
        //when
        String result = marsCar.move(str);
        //then
        assertEquals("(-1,0)W",result);
    }

    @Test
    public void should_return_00E_when_commend_L_given_00S() {
        //given
        Position position = new Position(0, 0, "S");
        MarsCar marsCar = new MarsCar(position);

        String str = "L";
        //List<String> commd = Arrays.asList(str);
        //when
        String result = marsCar.move(str);
        //then
        assertEquals("(0,0)E", result);
    }

    @Test
    public void should_return_00W_when_commend_R_given_00S() {
        //given
        Position position = new Position(0, 0, "S");
        MarsCar marsCar = new MarsCar(position);

        String str = "R";
        //List<String> commd = Arrays.asList(str);
        //when
        String result = marsCar.move(str);
        //then
        assertEquals("(0,0)W", result);
    }

    @Test
    public void should_return_10E_when_commend_M_given_00E() {
        //given
        Position position = new Position(0, 0, "E");
        MarsCar marsCar = new MarsCar(position);

        String str = "M";
        //List<String> commd = Arrays.asList(str);
        //when
        String result = marsCar.move(str);
        //then
        assertEquals("(1,0)E", result);
    }

    @Test
    public void should_return_00N_when_commend_L_given_00E() {
        //given
        Position position = new Position(0, 0, "E");
        MarsCar marsCar = new MarsCar(position);

        String str = "L";
        //List<String> commd = Arrays.asList(str);
        //when
        String result = marsCar.move(str);
        //then
        assertEquals("(0,0)N", result);
    }

    @Test
    public void should_return_00S_when_commend_R_given_00E() {
        //given
        Position position = new Position(0, 0, "E");
        MarsCar marsCar = new MarsCar(position);

        String str = "R";
        //List<String> commd = Arrays.asList(str);
        //when
        String result = marsCar.move(str);
        //then
        assertEquals("(0,0)S", result);
    }

    @Test
    public void should_return_01N_when_commend_MRL_given_00N() {
        //given
        Position position = new Position(0, 0, "N");
        MarsCar marsCar = new MarsCar(position);

        String str = "MRL";
        //List<String> commd = Arrays.asList(str);
        //when
        String result = marsCar.move(str);
        //then
        assertEquals("(0,1)N", result);
    }
}
