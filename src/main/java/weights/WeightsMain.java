
package weights;

public class WeightsMain {
    
    public static void main(String[] args) {
        
        int currentWeek = 2;
        double squat1RM = 240;
        double press1RM = 95;
        double deadLift1RM = 215;
        double bench1RM = 155;
        double bbbPercentage = .45;
        int currentBar = 35;
        
        System.out.println("Squat \n" + new Workout(currentWeek, squat1RM, 
                bbbPercentage, currentBar).getWorkout());
        System.out.println("Press \n" + new Workout(currentWeek, press1RM, 
                bbbPercentage, currentBar).getWorkout());
        System.out.println("Deadlift \n" + new Workout(currentWeek, deadLift1RM, 
                bbbPercentage, currentBar).getWorkout());
        System.out.println("Bench \n" + new Workout(currentWeek, bench1RM, 
                bbbPercentage, currentBar).getWorkout());
    }
}
