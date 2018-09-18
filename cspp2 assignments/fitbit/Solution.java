import java.util.Scanner;
import java.time.format.DateTimeFormatter;
class PhysicalActivities {
    private String activityname;
    private String date;
    private String notes;
    private String starttime;
    private String endtime;
    PhysicalActivities() {

    }
    PhysicalActivities(String aname, String date1, String note, String stime, String etime) {
        this.activityname = aname;
        this.notes = note;
        this.date = date1;
        this.starttime = stime;
        this.endtime = etime;
    }
    public String getNotes() {
        return this.notes;
    }
    public String getActivityName() {
        return activityname;
    }public String getStartTime() {
        return starttime;
    }public String getEndTime() {
        return endtime;
    } public String getDate() {
        return endtime;
    }public void setActivityName(final String name) {
        this.activityname = name;
    }

    public void setDate(final String date1) {
        this.date = date1;
    }

    
    public void setStartTime(final String start) {
        this.starttime = start;
    }

    
    public void setEndTime(final String end) {
        this.endtime = end;
    }

    
    public void setNotes(final String note) {
        this.notes = note;
    }
    public String toString() {
        String str = "PhysicalActivity" + "\n";
        str += "Name :" + getActivityName() + "\n";
        str += "Notes :" + getNotes() + "\n";
        str += "Date :" + getDate() + "\n";
        str += "Starttime :" + getStartTime() + "\n";
        str += "Endtime :" + getEndTime();
        return str;
    }
}
class WaterLog {
    private String quantity;
    private String date;
    WaterLog(String quan, String dt) {
        this.quantity = quan;
        this.date = dt;
    }
    public String getQunatityw() {
        return this.quantity;
    }public String getDatew() {
        return this.date;
    }
    public String toString() {
        String str = "Water" + "\n";
        str += "Date :" +getDatew() + "\n";
        str += "Quantity :" + getQunatityw() + "ml";
        return str;
    }


}

class SleepLog {
    private String date;
    private String starttime;
    private String endtime;
    SleepLog(String dt, String st, String et) {
        this.date = dt;
        this.starttime = st;
        this.endtime = et;
    }
    public String getDateS() {
        return this.date;
    }public String getStartTimeS() {
        return this.starttime;
    }public String getEndTimeS() {
        return this.endtime;
    }
    public String toString() {
        String str = "Sleep" + "\n";
        str += "Date :" + getDateS() + "\n";
        str += "Starttime :" + getStartTimeS() + "\n";
        str += "Endtime :" + getEndTimeS() + "\n";
        return str;
    }
}
class Weightlog {
    private String date;
    private String time;
    private String weight;
    private String fat;
    Weightlog(String dt, String tm, String wt, String fat1) {
        this.date = dt;
        this.weight = wt;
        this.time = tm;
        this.fat = fat1;
    }
    public String getDateW() {
        return this.date;
    }

    public String getTimeW() {
        return this.time;
    }

    public String getWeight() {
        return this.weight;
    }

    public String getFat() {
        return this.fat;
    }
    public String toString() {
        String str = "Weight" + "\n";
        str += "Date:" + getDateW() + "\n";
        str += "Time:" + getTimeW() + "\n";
        str += "Weight:" + getWeight() + "KG" + "\n";
        str += "Fat:" + getFat();
        return str;
    }
}
class FoodLog {
    private String item;
    private int quantity;
    private String date;
    private String time;
    FoodLog(final String name, final int quantity1, final String date1, String time1) {
        this.item = name;
        this.quantity = quantity1;
        this.date = date1;
        this.time = time1;
    }

    public String getItem() {
        return this.item;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getDate() {
        return this.date;
    }

    public String getTime() {
        return this.time;
    }
    public String toString() {
        String str = "Food" + "\n";
        str += "Date:" + getDate() + "\n";
        str += "Time:" + getTime() + "\n";
        str += "Name:" + getItem() + "\n";
        str += "Quantity:" + getQuantity();
        return str;
    }
}
/**
 * Class for fitbyte.
 */
class Fitbyte {
    private List<PhysicalActivities> pactivities;
    private List<WaterLog> waterlog;
    private List<FoodLog> foodlog;
    private List<SleepLog> sleep;
    private List<Weightlog> weight;
    /**
     * Constructs the object.
     */
    Fitbyte() {
        pactivities = new List<PhysicalActivities>();
        waterlog = new List<WaterLog>();
        foodlog = new List<FoodLog>();
        sleep = new List<SleepLog>();
        weight = new List<Weightlog>();
    }
    public List<FoodLog> getFood() {
        return foodlog;
    }
    public List<WaterLog> getWater() {
        return waterlog;
    } 
    public List<PhysicalActivities> getPact() {
        return pactivities; 
    } 
    public List<SleepLog> getSleep() {
        return sleep;
    } 
    public List<Weightlog> getWeight() {
        return weight;
    } 
    public void addFood(FoodLog item) {
        foodlog.add(item);
    }
    public void addWater(WaterLog water) {
        waterlog.add(water);
    }

    public void addSleep(SleepLog sleep1) {
        sleep.add(sleep1);
    }

    public void addActivity(PhysicalActivities act) {
        pactivities.add(act);
    }

    public void addWeight(Weightlog weight1) {
        weight.add(weight1);
    }
    public void getSummary() {
        System.out.println(getFood());
        System.out.println(getWater());
        System.out.println(getPact());
        System.out.println(getWeight());
        System.out.println(getSleep());
    }

    
    public void getDSummary(final String date) {
        for (int i = 0; i < foodlog.size(); i++) {
            if (foodlog.get(i).getDate().equals(date)) {
                System.out.println(foodlog.get(i));
            }
        }
        for (int i = 0; i < waterlog.size(); i++) {
            if (waterlog.get(i).getDatew().equals(date)) {
                System.out.println(waterlog.get(i));
            }
        }
        for (int i = 0; i < sleep.size(); i++) {
            if (sleep.get(i).getDateS().equals(date)) {
                System.out.println(sleep.get(i));
            }
        }
        for (int i = 0; i < weight.size(); i++) {
            if (weight.get(i).getDateW().equals(date)) {
                System.out.println(weight.get(i));
            }
        }
        for (int i = 0; i < pactivities.size(); i++) {
            if (pactivities.get(i).getDate().equals(date)) {
                System.out.println(pactivities.get(i));
            }
        }
    }
}
/**
 * Class for solution.
 */
class Solution{
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        Fitbyte fit = new  Fitbyte();

        while (s.hasNext()) {
            String line = s.nextLine();
            /*System.out.println(tokens[0]);*/
            String[] tokens = line.split(",");
            String[] cases = tokens[0].split(" ");
            /*System.out.println(cases[0]);*/
            switch (cases[0]) {
                case "Food":
                fit.addFood(new FoodLog(tokens[0],Integer.parseInt(tokens[1]),tokens[2],tokens[3]));
                break;     
                case "Water":
                    fit.addWater(new WaterLog(tokens[0], tokens[1]));
                break;
                case "Sleep":
                    fit.addSleep(new SleepLog(tokens[0], tokens[1], tokens[2]));
                break;
                case "PhysicalActivity":
                    fit.addActivity(new PhysicalActivities(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]));
                break;
                case "Weight":
                    fit.addWeight(new Weightlog(tokens[0], tokens[1], tokens[2], tokens[2]));
                break;
                case "Foodlog":
                    System.out.println(fit.getFood());
                break;
                case "Waterlog":
                    System.out.println(fit.getWater());
                break;
                case "Sleeplog":
                    System.out.println(fit.getSleep());
                break;
                case "Weightlog":
                    System.out.println(fit.getWeight());
                break;
                case "PhysicalPhysicalActivity":
                    if (fit.getPact().size() == 0) {
                        System.out.println("None");
                    } else {
                        System.out.println(fit.getPact());
                    }
                break;
                case "Summary":
                    if (tokens.length == 1) {
                        fit.getSummary();
                    } else {
                        fit.getDSummary(tokens[1]);
                    }
                default:
                break;


            }

        }
    }


}