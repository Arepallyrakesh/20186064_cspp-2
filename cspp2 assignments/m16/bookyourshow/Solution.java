import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
class Show {
    private String moviename;
    private String showdate;
    private String[] seats;
    Show(String moviename, String showdate, String[] seats) {
        this.moviename = moviename;
        this.showdate = showdate;
        this.seats = seats;
    }
    //show class
}

class BookYourShow {
    private Show[] shows;
    private int showsize;
    BookYourShow() {
        shows = new Show[10];
       /* patrons = new Patron[10];*/
        showsize = 0;
        /*patronsize = 0;*/
    }
    public void showresize() {
        shows = Arrays.copyOf(shows, shows.length * 2);
    }
    public void addAShow (final Show noshow) {
        //add a show
        if (showsize == shows.length) {
            showresize();            
        }
        shows[showsize++] = noshow;
            
        }
    }
   /* public void addAPatron() {

    }
    public Show getAShow(final String moviename, final String showdate) {
*/
    /*}*/


public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main method to drive program.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        BookYourShow bys = new BookYourShow();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] tokens = scan.nextLine().
                replace("[", "").replace("]", "").split(",");
            String[] check = tokens[0].split(" ");
            switch (check[0]) {
                case "add":
                    int k = 2;
                    String[] seats = new String[tokens.length - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.addAShow(new Show(check[1], tokens[1], seats));
                break;

                /*case "book":
                    k = 2 + 2;
                    seats = new String[tokens.length - 2 - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.bookAShow(check[1], tokens[1],
                        new Patron(tokens[2], tokens[2 + 1]), seats);
                break;

                case "get":
                    Show show = bys.getAShow(check[1], tokens[1]);
                    if (show != null) {
                       System.out.println(show);
                    } else {
                        System.out.println("No show");
                    }
                break;

                case "print":
                    bys.printTicket(check[1], tokens[1], tokens[2]);
                break;

                case "showAll":
                    bys.showAll();
                break;*/

                default:
                break;
            }
        }
    }
}
