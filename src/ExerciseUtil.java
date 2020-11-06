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

