package com.twschool.practice;

import java.util.Arrays;
import java.util.List;

public class MarsCar {
    Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void moveForward(Position position) {
        if ("N".equals(position.getDirn())) {
            position.setY(position.getY() + 1);
        }
        if ("S".equals(position.getDirn())) {
            position.setY(position.getY() - 1);
        }
        if ("E".equals(position.getDirn())) {
            position.setX(position.getX() + 1);
        }
        if ("W".equals(position.getDirn())) {
            position.setX(position.getX() - 1);
        }
    }

    public MarsCar(Position position) {
        this.position = position;
    }


    public void turn(String direction) {
        String[] str = {"N", "E", "S", "W"};
        List<String> fws = Arrays.asList(str);
        if ("R".equals(direction)) {
            position.setDirn(fws.get((fws.indexOf(position.getDirn()) + 1) % 4));
        } else {
            position.setDirn(fws.get((fws.indexOf(position.getDirn()) + 3) % 4));
        }
    }

    public String move(String commd) {
        List<String> cmd = Arrays.asList(commd.split(""));
        for (String s : cmd) {
            if ("M".equals(s)) {
                moveForward(position);
            } else {
                turn(s);
            }
        }
        return "(" + position.getX() + "," + position.getY() + ")" + position.getDirn();
    }
}

class Position {
    int x;
    int y;
    String dirn;

    public Position(int x, int y, String dirn) {
        this.x = x;
        this.y = y;
        this.dirn = dirn;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirn() {
        return dirn;
    }

    public void setDirn(String dirn) {
        this.dirn = dirn;
    }
}

