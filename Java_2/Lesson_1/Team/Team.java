package Lesson_1.Marathon.Team;

public class Team implements Competitor {
    private String teamName;
    private int[] maxRunDistance = new int[4];
    private int[] maxJumpHeight = new int[4];
    private int[] maxSwimDistance = new int[4];
    private boolean active;


    public Team(String teamName) {
        this.teamName = teamName;
        this.active = true;
    }

    public void setMaxRunDistance(int i1, int i2, int i3, int i4) {
        this.maxRunDistance[0] = i1;
        this.maxRunDistance[1] = i2;
        this.maxRunDistance[2] = i3;
        this.maxRunDistance[3] = i4;
    }

    public void setMaxJumpHeight(int i1, int i2, int i3, int i4) {
        this.maxJumpHeight[0] = i1;
        this.maxJumpHeight[1] = i2;
        this.maxJumpHeight[2] = i3;
        this.maxJumpHeight[3] = i4;
    }

    public void setmaxSwimDistance(int i1, int i2, int i3, int i4) {
        this.maxSwimDistance[0] = i1;
        this.maxSwimDistance[1] = i2;
        this.maxSwimDistance[2] = i3;
        this.maxSwimDistance[3] = i4;
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void run(int dist) {
        for (int i = 0; i < 4; i++) {
            if (dist <= maxRunDistance[i]) {
                System.out.println(teamName + ": " + "Участник " + (i + 1) + " хорошо справился с кроссом");
            } else {
                System.out.println(teamName + ": " + "Участник " + (i + 1) + " не справился с кроссом");
                active = false;
            }
        }
    }

    @Override
    public void swim(int dist) {
        for (int i = 0; i < 4; i++) {
            if (dist <= maxSwimDistance[i]) {
                System.out.println(teamName + ": " + "Участник " + (i + 1) + " отлично проплыл");
            } else {
                System.out.println(teamName + ": " + "Участник " + (i + 1) + " не смог проплыть");
                active = false;
            }
        }
    }

    @Override
    public void jump(int height) {
        for (int i = 0; i < 4; i++) {
            if (height <= maxJumpHeight[i]) {
                System.out.println(teamName + ": " + "Участник " + (i + 1) + " удачно перепрыгнул через стену");
            } else {
                System.out.println(teamName + ": " + "Участник " + (i + 1) + " не смог перепрыгнуть стену");
                active = false;
            }
        }
    }

    @Override
    public void info() {
        System.out.println(teamName + " - " + active);
    }
}
