import java.util.Calendar;

class calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current Date: " + c.getTime());
        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Month: " + (c.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + c.get(Calendar.DAY_OF_MONTH));
    }
}
