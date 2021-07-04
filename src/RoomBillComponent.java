public interface RoomBillComponent {
    final double TAX = 12;
    final double EXTRA_PERSON_CHARGE=500.00;
    final double FOOD_CHARGE=800.00;


    //calculate the bill according to the details
    float calculateBill(String typeOfRoom, int noOfDaysOfStay, int noOfExtraPerson);
}
