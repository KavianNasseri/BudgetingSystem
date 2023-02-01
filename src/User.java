public class User {
    private String name;
    private static final int Id = 0;
    private double totalBudget; 		// Make sure to only show two decimal places
    private int[] ids; 					// Purchase ID's
    User(String name, double totalBudget){
        this.name = name;
        this.totalBudget = totalBudget;
    }
    public double getTotalBudget() {
        return totalBudget;
    }
    public void setTotalBudget(double totalBudget) {
        this.totalBudget = totalBudget;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
