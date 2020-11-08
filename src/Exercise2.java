
import java.util.ArrayList;


public class Exercise2 {


    private String exercisesName;
    private String description;
    private double duration;
    private String position;


    public Exercise2(String exercisesName,double duration,String description,String position){
        this.exercisesName=exercisesName;
        this.description=description;
        this.duration=duration;
        this.position=position;
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
        this.position = position;
    }

    @Override
    public String toString() {
        return exercisesName + '\t' + "\t" + "\t" + " duration=" + duration + "  seconds." + "\n" + "........................................................"
                + '\n' + "description: " + description +
                "\n";

    }
}

class ExerciseUtil2 {
    public static void getExercise(Exercise2[] list) {
        for (int i = 0; i < list.length; i++) {

            System.out.println(list[i]+"\n");
        }
    }

    public static void printFloorPositionExercise(Exercise2[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getPosition().equals("floor")) {

                String name = list[i].getExercisesName();

                double duration = list[i].getDuration();
                String description = list[i].getDescription();


                System.out.println("Name : " + name);

                System.out.println("Duration : " + duration+"\n");


            }


        }
    }

    public static void printFloorPositionExerciseMoreMinute(Exercise2[] list) {
        for (int i = 0; i < list.length; i++) {

            String name = list[i].getExercisesName();

            double duration = list[i].getDuration();
            if (list[i].getPosition().equals("floor")) {
                if (list[i].getDuration() > 60) {

                    System.out.println("Name: " + name);

                    System.out.println("Duration: " + duration);

                }
            }


        }
    }
}



class TestTry{

    public static void main(String[] args) {

        Exercise2 [] exercise2s=new Exercise2[6];

        exercise2s[0]=new Exercise2("Push-ups ", 30, " Place your hands on the floor. " +
                "Raise up onto your toes so that all of your body weight is on your hands and your feet." +
                " Bend your elbows and lower your chest down toward the floor. Then," +
                " push off the floor and extend them so that you return to the starting position.", "floor");

        exercise2s[1]=new Exercise2("Planks ", 90, "Start on the floor on your hands and knees. " +
                "Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart." +
                " Maintain a straight line from heels through the top of your head, looking down at the floor." +
                " Now, tighten your abs and hold.", "floor");


        exercise2s[2]=new Exercise2("Squats", 45, "Stand with feet a little wider than shoulder-width apart," +
                " hips stacked over knees, and knees over ankles." + " Extend arms out straight so they are parallel with the ground," +
                " palms facing down.Goto a squat and exhale, then explode back up to standing, driving through heels.", "stand up");

        exercise2s[3]=new Exercise2("Backward Kick", 60, "Get in an all-fours position with your knees and hands on the floor." +
                " Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle. " +
                " Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs." +
                " Return to the starting position and repeat.", "floor");

        exercise2s[4]=new Exercise2("Leg Curl ", 90, "Stand up on," +
                " shift your weight to  one feet and pull another heel toward your buttocks." +
                " Stay for 15 seconds, then repeat with your other leg. ", "stand up");

        exercise2s[5]=new Exercise2("Sidewards Back Stretch", 60, "Go into standing position, put your hands on" +
                " your hips and then stretch with one hand over your head to the opposite side." +
                " Repeat with other hand.", "stand up");



        ExerciseUtil2.getExercise(exercise2s);


        System.out.println("Floor Position Exercise"+"\n");
        ExerciseUtil2.printFloorPositionExercise(exercise2s);
        System.out.println("Floor Position Exercise, More Minute"+"\n");
        ExerciseUtil2.printFloorPositionExerciseMoreMinute(exercise2s);


    }





}


