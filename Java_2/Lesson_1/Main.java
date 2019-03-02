package Lesson_1.Marathon;

import Lesson_1.Marathon.Course.Course;
import Lesson_1.Marathon.Team.Team;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Champions"); //set the Team name
        team.setMaxRunDistance(200, 200, 300, 400); // set the max run distance for every member of the team
        team.setmaxSwimDistance(50, 60, 70, 80);// set the max swim distance for every member of the team
        team.setMaxJumpHeight(1, 2, 3, 4); // // set the max jump for every member of the team
        Course course = new Course(100, 80, 1); // set the parameters of the obstacles
        course.doIt(team); // team will go through the course
        team.info(); /* the result of the race. One member of the team can't pass through the course means
        that the whole team can't past through the course */
    }
}
