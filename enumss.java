public class enumss {
    enum days {
        sunday, monday, tuesday, wednesday, thursady, friday, saturday;
    }

    public static void main(String[] args) {

        days obj = days.saturday;
        System.out.println(obj);

        switch (obj) {
            case monday:
                System.out.println("week start");
                break;
            case tuesday:
                System.out.println("Tuesday");
                break;
            case wednesday:
            case thursady:
                System.out.println("Mid week");
                break;
            case friday:
            case sunday:
                System.out.println("weekend");
                break;
            default:
                System.out.println("Nth");
                break;
        }
    }
}
