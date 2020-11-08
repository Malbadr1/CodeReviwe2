
    import java.util.ArrayList;


    public class Exercise3 {


        private String exercisesName;
        private String description;
        private double duration;
        private String position;


        public Exercise3(String exercisesName,double duration,String description,String position){
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

    class ExerciseUtil3 {
        public static void floorPosition(Exercise3[] list) {
            for (int i = 0; i < list.length; i++) {

                list[i].getPosition();
            }
        }

        public static void printFloorPositionExercise(Exercise3[] list) {
            for (int i = 0; i < list.length; i++) {
                if (list[i].getPosition().equals("floor")) {

                    String name = list[i].getExercisesName();

                    double duration = list[i].getDuration();
                    String description = list[i].getDescription();


                    System.out.println("Name: " + name);

                    System.out.println("Duration: " + duration);


                }


            }
        }

        public static void printFloorPositionExerciseMoreMinute(Exercise3[] list) {
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

            Exercise3 [] exercise3s=new Exercise3[6];

            exercise3s[0]=new Exercise3("Push-ups ", 30, " Place your hands on the floor. " +
                    "Raise up onto your toes so that all of your body weight is on your hands and your feet." +
                    " Bend your elbows and lower your chest down toward the floor. Then," +
                    " push off the floor and extend them so that you return to the starting position.", "floor");

            exercise3s[1]=new Exercise3("Planks ", 90, "Start on the floor on your hands and knees. " +
                    "Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart." +
                    " Maintain a straight line from heels through the top of your head, looking down at the floor." +
                    " Now, tighten your abs and hold.", "floor");


            exercise3s[2]=new Exercise3("Squats", 45, "Stand with feet a little wider than shoulder-width apart," +
                    " hips stacked over knees, and knees over ankles." + " Extend arms out straight so they are parallel with the ground," +
                    " palms facing down.Goto a squat and exhale, then explode back up to standing, driving through heels.", "stand up");

            exercise3s[3]=new Exercise3("Backward Kick", 60, "Get in an all-fours position with your knees and hands on the floor." +
                    " Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle. " +
                    " Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs." +
                    " Return to the starting position and repeat.", "floor");

            exercise3s[4]=new Exercise3("Leg Curl ", 90, "Stand up on," +
                    " shift your weight to  one feet and pull another heel toward your buttocks." +
                    " Stay for 15 seconds, then repeat with your other leg. ", "stand up");

            exercise3s[5]=new Exercise3("Sidewards Back Stretch", 60, "Go into standing position, put your hands on" +
                    " your hips and then stretch with one hand over your head to the opposite side." +
                    " Repeat with other hand.", "stand up");


            for (Exercise3 s : exercise3s) {
                System.out.println(s+"\n");

            }


            System.out.println("Floor Position Exercise");
            ExerciseUtil3.printFloorPositionExercise(exercise3s);
            System.out.println("Floor Position Exercise, More Minute");
            ExerciseUtil3.printFloorPositionExerciseMoreMinute(exercise3s);


        }





    }


