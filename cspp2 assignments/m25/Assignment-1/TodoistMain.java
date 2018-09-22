import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

/**
  * write your code below this comment
  */
class Task {
	private String title;
	private String assignedTo;
	private int timeToComplete;
	private boolean important;
	private boolean urgent;
	private String status;
	Task(String tle, String assign, int time, boolean imp, boolean urg, String sts) throws Exception {
		if(tle.equals(""))
			throw new Exception("Title not provided");
		if(time < 1)
			throw new Exception("Invalid timeToComplete " + time);
		if(!(sts.equals("todo") || sts.equals("done"))) {
			throw new Exception("Invalid status "+sts);
		}
		this.title = tle;
		this.assignedTo = assign;
		this.timeToComplete = time;
		this.important = imp;
		this.urgent = urg;
		this.status = sts;
		

	} 
	public int  getTime() {
        return this.timeToComplete;
    }
    public String status() {
    	return status;
    }
	public String impt(boolean imp, boolean urg) {

		if (imp == true && urg == true) {
			return "Important, Urgent";
			
		}else if (imp == true && urg == false) {
			return "Important, Not Urgent";
		} else if (imp == false && urg == true) {
			return "Not Important, Urgent";
		} else {
			return "Not Important, Not Urgent";
		}

	}
    public String toString() {
    return title + ", " +assignedTo+ ", "+timeToComplete+ ", " +impt(important, urgent)+ ", "+ status;
 	}
}
class Todoist {
	ArrayList<Task> list;
	Todoist() {
		list= new ArrayList<Task>();
		/*Task new1 = new Task();*/

	}
	public Task[] getNextTask(String s, int a) {
		return null;

	}
	public int totalTime4Completion() {
		int tt = 0;
		for (int i = 0; i < list.size(); i++) {
		 	if (list.get(i).status().equals("todo")) {
		 		tt += list.get(i).getTime();
		 	}
		 }
		 //System.out.println(list);

		return tt;
	}

	public String getNextTask(String s) {
		return null;
	}
	public void addTask(Task s) {
		list.add(s);
		
	}
	public String toString() {
		String str = "";
		for(Task empty : list) {
			str += empty;
			str += "\n";
			/*System.out.println(list);*/
		}
		return str;

	}

}

/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                    testTask(tokens);
                break;
                case "add-task":
                    testAddTask(todo, tokens);
                break;
                case "print-todoist":
                    System.out.println(todo);
                break;
                case "get-next":
                    System.out.println(todo.getNextTask(tokens[1]));
                break;
                case "get-next-n":
                    int n = Integer.parseInt(tokens[2]);
                    Task[] tasks = todo.getNextTask(tokens[1], n);
                    System.out.println(Arrays.deepToString(tasks));
                break;
                case "total-time":
                    System.out.println(todo.totalTime4Completion());
                break;
                default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
            title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
