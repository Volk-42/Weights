package weights;
import java.lang.Math;

public class Workout {
    
    private int week;
    private double oneRepMax;
    private int barWeight;
    private String[] reps = {"5","5","5+",
                            "3","3","3+",
                            "5","3","1+",
                            "5","5","5"};
    private double[] weight = new double[3];
    private double[] weightPercentage = {.65, .75, .85,
                                        .70, .80, .90,
                                        .75, .85, .95,
                                        .40, .50, .60,};
    private String[] plates = {"","",""};
    private double[] platesOwned = {45,25,25,10,10,5,2.5};
    private int offSet;
    
    public Workout (int week, double oneRepMax, int barWeight) { 
        this.week = week;
        this.oneRepMax = oneRepMax;
        this.barWeight = barWeight;
        int offSet = (week-1)*3;
        calcWeights();
        calcPlates();
    }
    
   private void calcWeights() {
        for (int i = 0; i < 3; i++) {
            int i2 = i+offSet;
            weight[i]=oneRepMax*weightPercentage[i2];
            weight[i]=5*(Math.round(weight[i]/5));
        }
    }
    
    private void calcPlates() {
        double[] weightHolder = new double[3];
        for (int i=0; i < 3; i++) {
            weightHolder[i]=weight[i]-barWeight;
            for (int i2 =0 ; i2 < platesOwned.length; i2++) {
                if (weightHolder[i] > platesOwned[i2]*2) {
                    plates[i] += "[" + platesOwned[i2] + "]";
                    weightHolder[i] -= platesOwned[i2]*2;
                }
            }
        }
    }
    
    public String getWorkout() {
        String workout = "";
        for (int i=0; i < 3; i++) {
            workout+= reps[i] + " x " + weight[i] + " " + plates[i] + "\n";
        }
        return workout;
    }
}
