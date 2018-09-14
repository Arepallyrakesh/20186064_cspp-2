import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for show.
 */
class Show {
    /**
     * moviename description.
     */
    private String moviename;
    /**
     * showdate description.
     */
    private String date;
    /**
     * seats description.
     */
    private String[] seats;
    /**
     * Constructs the object.
     *
     * @param      mname  The moviename
     * @param      showdate       The date
     * @param      seat1      The seats
     */
    Show(final String mname, final String showdate, final String[] seat1) {
        this.moviename = mname;
        this.date = showdate;
        this.seats = seat1;
    }
    /**
     * Gets the moviename.
     *
     * @return     The moviename.
     */
    public String getMoviename() {
        return this.moviename;
    }
    /**
     * Gets the showdate.
     *
     * @return     The showdate.
     */
    public String getShowdate() {
        return this.date;
    }
    /**
     * Gets the seats.
     *
     * @return     The seats.
     */
    public String[] getSeats() {
        return this.seats;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        s += moviename + "," + date + ",";
        s += Arrays.toString(seats).replace(", ", ",");
        return s;
    }
    /**
     * printExceptTickets.
     *
     * @return     { description_of_the_return_value }
     */
    public String printExceptTickets() {
        String s = "";
        s += moviename + "," + date;
        return s;
    }
}
/**
 * Class for patron.
 */
class Patron {
    /**
     * patronname description.
     */
    private String patronname;
    /**
     * mobilenum description.
     */
    private String mobilenum;
    /**
     * bookedseats description.
     */
    private String[] bookseats;

    /**
     * Constructs the object.
     *
     * @param      name    The name
     * @param      phnnum  The phnnum
     * @param      seat1   The seat 1
     */
    Patron(final String name, final String phnnum,
            final String[] seat1) {
        this.patronname = name;
        this.mobilenum = phnnum;
        this.bookseats = seat1;

    }

    /**
     * Gets the patronname.
     *
     * @return     The patronname.
     */
    public String getPatronname() {
        return this.patronname;
    }

    /**
     * Gets the mobilenum.
     *
     * @return     The mobilenum.
     */
    public String getMobilenum() {
        return this.mobilenum;
    }

    /**
     * Gets the bookseats.
     *
     * @return     The bookseats.
     */
    public String[] getBookseats() {
        return this.bookseats;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        return s;
    }
}

/**
 * Class for book your show.
 */
class BookYourShow {
    /**
     * shows array description.
     */
    private Show[] shows;
    /**
     * patron array description.
     */
    private Patron[] patrons;
    /**
     * showsize description.
     */
    private int showsize;
    /**
     * patronsize description.
     */
    private int patronsize;
    /**
     * Constructs the object.
     */
    /**
     * @variable TEN.
     */
    private static final int TEN = 10;
    /**
     * Constructs the object.
     */
    BookYourShow() {
        shows = new Show[TEN];
        patrons = new Patron[TEN];
        showsize = 0;
        patronsize = 0;
    }

    /**
     * showresize method.
     */
    public void showresize() {
        shows = Arrays.copyOf(shows, shows.length * 2);
    }

    /**
     * { function_description }.
     */
    public void patronresize() {
        patrons = Arrays.copyOf(patrons, patrons.length * 2);
    }

    /**
     * Adds a show.
     *
     * @param      noshow  No show.
     */
    public void addAShow(final Show noshow) {

        if (showsize == shows.length) {
            showresize();
        }
        shows[showsize++] = noshow;
    }

    /**
     * Adds a patron.
     *
     * @param      npatron  The npatron
     */
    public void addAPatron(final Patron npatron) {
    if (patronsize == patrons.length) {
        patronresize();
    }
    patrons[patronsize++] = npatron;
    }

    /**
     * { function_description }.
     *
     * @param      moviename  The moviename
     * @param      date       The date
     * @param      p          { parameter_description }
     */
    public void bookAShow(final String moviename,
        final String date, final Patron p) {
        addAPatron(p);
        Show availableshow = getAShow(moviename, date);
        if (availableshow != null) {
            String[] seats = availableshow.getSeats();
            String[] bookseats = p.getBookseats();
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < bookseats.length; j++) {
                    if (seats[i].equals(bookseats[j])
                        && !seats[i].equals("N/A")) {
                        seats[i] = "N/A";
                    }
                }
            }
        } else {
            System.out.println("No show");
        }
    }

    /**
     * Gets a show.
     *
     * @param      moviename  The moviename
     * @param      date       The date
     *
     * @return     A show.
     */
    public Show getAShow(final String moviename, final String date) {
        for (int i = 0; i < showsize; i++) {
            if (shows[i].getMoviename().equals(moviename)
                && shows[i].getShowdate().equals(date)) {
                return shows[i];
            }
        }
        return null;
    }

    /**
     * { function_description }.
     *
     * @param      moviename  The moviename
     * @param      date       The date
     * @param      mobilenum  The mobilenum
     *
     * @return     { description_of_the_return_value }
     */
    public String printTicket(final String moviename,
        final String date, final String mobilenum) {
        Show show = getAShow(moviename, date);
        String str = "Invalid";
        if (show != null) {
            str = "No show";
            for (int j = 0; j < patronsize; j++) {
                str = "Invalid";
                if (patrons[j].getMobilenum().equals(mobilenum)) {
                    str = mobilenum + " " + moviename + " " + date;
                    return str;
                }
            }
        }
        return str;
    }

    /**
     * Shows all.
     */
    public void showAll() {
        for (int i = 0; i < showsize; i++) {
            System.out.println(shows[i]);
        }
    }


}
/**
 * class Solution.
 */
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

                case "book":
                    k = 2 + 2;
                    seats = new String[tokens.length - 2 - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.bookAShow(check[1], tokens[1],
                        new Patron(tokens[2], tokens[2 + 1], seats));
                break;

                case "get":
                    Show show = bys.getAShow(check[1], tokens[1]);
                    if (show != null) {
                       System.out.println(show.printExceptTickets());
                    } else {
                        System.out.println("No show");
                    }
                break;

                case "print":System.out.println(bys.printTicket(check[1],
                tokens[1], tokens[2]));
                break;

                case "showAll":
                    bys.showAll();
                break;

                default:
                break;
            }
        }
    }
}


