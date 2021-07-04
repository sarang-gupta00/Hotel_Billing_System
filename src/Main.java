public class Main {
    public static void main(String[] args) {
     RoomDetails r1 = new RoomDetails("Sarang","Standard",1,4);
     float bill = r1.calculateBill("Standard",5,1);
        System.out.println(bill);
    }
}
