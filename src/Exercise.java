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

class ExerciseUtil {
    public static void floorPosition(Exercise[] list) {
        for (int i = 0; i < list.length; i++) {

            list[i].getPosition();
        }
    }

    public static void printFloorPositionExercise(Exercise[] list) {
        for (int i = 0; i < list.length; i++) {

            String name = list[i].getExercisesName();

            double duration = list[i].getDuration();


            System.out.println("Name: " + name);

            System.out.println("Duration: " + duration);

        }

    }

    public static void printFloorPositionExerciseMoreMinute(Exercise[] list) {
        for (int i = 0; i < list.length; i++) {

            String name = list[i].getExercisesName();

            double duration = list[i].getDuration();
            if (list[i].getDuration() > 60) {

                System.out.println("Name: " + name);

                System.out.println("Duration: " + duration);

            }
        }


    }
}



class Test {


    public static void main(String[] args) {

        ArrayList<Exercise> arraylist = new ArrayList<>();

        arraylist.add(new Exercise("Push-ups ", 30, " Place your hands on the floor. " +
                "Raise up onto your toes so that all of your body weight is on your hands and your feet." +
                " Bend your elbows and lower your chest down toward the floor. Then," +
                " push off the floor and extend them so that you return to the starting position.", "floor"));

        arraylist.add(new Exercise("Planks ", 90, "Start on the floor on your hands and knees. " +
                "Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart." +
                " Maintain a straight line from heels through the top of your head, looking down at the floor." +
                " Now, tighten your abs and hold.", "floor"));


        arraylist.add(new Exercise("Squats", 45, "Stand with feet a little wider than shoulder-width apart," +
                " hips stacked over knees, and knees over ankles." + " Extend arms out straight so they are parallel with the ground," +
                " palms facing down.Goto a squat and exhale, then explode back up to standing, driving through heels.", "stand up"));

        arraylist.add(new Exercise("Backward Kick", 60, "Get in an all-fours position with your knees and hands on the floor." +
                " Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle. " +
                " Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs." +
                " Return to the starting position and repeat.", "floor"));

        arraylist.add(new Exercise("Leg Curl ", 90, "Stand up on," +
                " shift your weight to  one feet and pull another heel toward your buttocks." +
                " Stay for 15 seconds, then repeat with your other leg. ", "stand up"));

        arraylist.add(new Exercise("Sidewards Back Stretch", 60, "Go into standing position, put your hands on" +
                " your hips and then stretch with one hand over your head to the opposite side." +
                " Repeat with other hand.", "stand up"));


        for (Exercise s : arraylist) {
            System.out.println(s);

        }


        System.out.println("");


        Exercise[] exercises = new Exercise[3];
        exercises[0] = new Exercise("Planks ", 90, "Start on the floor on your hands and knees. " +
                "Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart." +
                " Maintain a straight line from heels through the top of your head, looking down at the floor." +
                " Now, tighten your abs and hold.", "floor");

        exercises[1] = new Exercise("Push-ups ", 30, " Place your hands on the floor. " +
                "Raise up onto your toes so that all of your body weight is on your hands and your feet." +
                " Bend your elbows and lower your chest down toward the floor. Then," +
                " push off the floor and extend them so that you return to the starting position.", "stand up");
        exercises[2] = new Exercise("Backward Kick", 60, "Get in an all-fours position with your knees and hands on the floor." +
                " Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle. " +
                " Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs." +
                " Return to the starting position and repeat.", "floor");


        System.out.println("Floor Position Exercise");
        ExerciseUtil.floorPosition(exercises);
        ExerciseUtil.printFloorPositionExercise(exercises);

        System.out.println("");
        System.out.println("Floor Position Exercise More a Minute");
        ExerciseUtil.printFloorPositionExerciseMoreMinute(exercises);


    }
}












