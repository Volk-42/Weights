
package weights;

public class WeightsMain {
    
    public static void main(String[] args) {
        
        int currentWeek = 2;
        double current1RM = 200;
        int currentBar = 35;
        System.out.println(new Workout(currentWeek, current1RM, currentBar).getWorkout());
    }
}
