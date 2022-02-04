public class Mainnn {
    public static void main(String[] args) {


        Fighter f1 = new Fighter("A", 10, 100, 100,30,50);
        Fighter f2 = new Fighter("B", 25, 85, 85,40,50);

        Match match = new Match(f1, f2, 100, 85);
        match.Run();
    }




}
