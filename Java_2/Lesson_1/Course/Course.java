package Lesson_1.Marathon.Course;

import Lesson_1.Marathon.Team.Competitor;

public class Course extends Obstacle {
    private int runLength;
    private int swimLength;
    private int wallHeight;

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(runLength);
        competitor.swim(swimLength);
        competitor.jump(wallHeight);
    }


    public Course(int runLength, int swimLength, int wallHeigth) {
        this.runLength = runLength;
        this.swimLength = swimLength;
        this.wallHeight = wallHeigth;
    }
}
//    public int getRunLength() {
//        return runLength;
//    }
//
//    public int getSwimLength() {
//        return swimLength;
//    }
//
//    public int getWallHeight() {
//        return wallHeight;
//    }
//}
