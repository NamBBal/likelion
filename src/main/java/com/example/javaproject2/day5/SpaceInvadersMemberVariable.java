package com.example.javaproject2.day5;

public class SpaceInvadersMemberVariable {
    int location;
    public void moveLeft(){
        location = location - 1;
        System.out.printf("moveleft: %d\n", location);
    }
    public void moveRight() {
        location = location + 1;
        System.out.printf("moveright: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
            simv.moveLeft();
            simv.moveLeft();
            simv.moveLeft();
            simv.moveLeft();
            simv.moveRight();

        }

}
