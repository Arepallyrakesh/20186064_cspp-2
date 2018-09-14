import java.util.Scanner;
import java.util.Arrays;

class Show {
	private String moviename;
	private String date;
	private String[] seats;
	Show(String moviename, String date, String[] seats) {
		this.moviename = moviename;
		this.date = date;
		this.seats = seats;
	}
    public String getMoviename() {
        return this.moviename;
    }
    public String getShowdate() {
        return this.date;
    }
    public String[] getSeats() {
        return this.seats;
    }
    public String toString() {
        String s = "";
        s += moviename + "," + date + ",";
        s += Arrays.toString(seats).replace(", ", ",");
        return s;
    }
}
class Patron {
	private String patronname;
	private String mobilenum;
	private String[] bookseats;

   	Patron(final String name, final String phnnum, final String[] seat1) {
   		this.patronname = name;
        this.mobilenum = phnnum;
        this.bookseats = seat1;

    }
    public String getPatronname() {
        return this.patronname;
    }
    public String getMobilenum() {
        return this.mobilenum;
    }
    public String[] getBookseats() {
        return this.bookseats;
    }
}

class BookYourShow {
	private Show[] shows;
	private Patron[] patrons;
	private int showsize;
	private int patronsize;
	BookYourShow(){
		shows = new Show[10];
	    patrons = new Patron[10];
	    showsize = 0;
	    patronsize = 0;
	}
	public void showresize() {
        shows = Arrays.copyOf(shows, shows.length * 2);
    }
    public void patronresize() {
        patrons = Arrays.copyOf(patrons, patrons.length * 2);
    }

	public void addAShow(Show no_show) {
		if (showsize == shows.length) {
            showresize();
        }
        shows[showsize++] = no_show;
	}
    public void addAPatron(final Patron npatron) {
    if (patronsize == patrons.length) {
        patronresize();
    }
    patrons[patronsize++] = npatron;
    }

    public void bookAShow(String moviename, String date, Patron p) {
    	addAPatron(p);
        Show availableshow = getAShow(moviename, date);
        if (availableshow != null) {
            String[] seats = availableshow.getSeats();
            String[] bookseats = p.getBookseats();
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < bookseats.length; j++) {
                    if (seats[i].equals(bookseats[j]) && !seats[i].equals("N/A")) {
                        seats[i] = "N/A";
                    }
                }
            }
        } else {
            System.out.println("No show");
        }
    }

    public Show getAShow(String moviename, String date) {
        for (int i = 0; i < showsize; i++) {
            if (shows[i].getMoviename().equals(moviename) && shows[i].getShowdate().equals(date)) {
                return shows[i];
            }
        }
        return null;
    }

    public String printTicket(final String moviename, final String date, final String mobilenum ) {
    	Show show = getAShow(moviename, date);
        String str = "Invalid";
        if (show != null) {
            str = "No show";
            for (int j = 0; j < patronsize; j++) {
                str = "Invalid";
                if (patrons[j].getMobilenum().equals(mobilenum)) {
                    str = mobilenum + " "+ moviename + " " + date;
                    return str;
                }
            }
        }
        return str;
    }
    public void showAll() {
    	for (int i = 0; i < showsize; i++) {
            System.out.println(shows[i]);
        }
    }


}


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
                        new Patron(tokens[2], tokens[2 + 1] , seats));
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
                break;

                default:
                break;
            }
        }
    }
}
