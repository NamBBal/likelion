package com.example.javaproject2.day5;

public class SpaceInvaderMemberVariableTest {
    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        System.out.println((simv.location));

        simv.moveRight();
        System.out.println(simv.location);
    }
}
