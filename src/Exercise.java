import java.util.ArrayList;

public class Exercise {

    private String exercisesName;
    private String description;
    private double duration;
    private String position;

    public Exercise(String exercisesName, double duration, String description, String position) {
        this.exercisesName = exercisesName;
        this.duration = duration;
        this.description = description;

        this.position = position;
    }

    public String getExercisesName() {

        return exercisesName;
    }

    public void setExercisesName(String exercisesName) {

        this.exercisesName = exercisesName;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public double getDuration() {


        return duration;
    }

    public void setDuration(double duration) {

        this.duration = duration;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position.equals("floor")) {
            System.out.println("Exercises on the floor");

        }
        this.position = position;
    }

    @Override
    public String toString() {
        return exercisesName + '\t' + "\t" + "\t" + " duration=" + duration + "  seconds." + "\n" + "........................................................"
                + '\n' + "description: " + description +
                "\n";
    }


}








