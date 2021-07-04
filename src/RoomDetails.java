public class RoomDetails implements RoomBillComponent   {
  //instance variables
  private int build;
  private String customerName;
  private String typeOfRoom;
  private int noOfExtraPerson;
  private int noOfDaysOfStay;
  private static int counter;

  //public methods

    //constructor

    public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPerson, int noOfDaysOfStay) {
        this.customerName = customerName;
        this.typeOfRoom = typeOfRoom;
        this.noOfExtraPerson = noOfExtraPerson;
        this.noOfDaysOfStay = noOfDaysOfStay;
    }

    //getters

    public int getBuild() {
        return build;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public int getNoOfExtraPerson() {
        return noOfExtraPerson;
    }

    public int getNoOfDaysOfStay() {
        return noOfDaysOfStay;
    }

    //methods
    //validating no of says of stay in (1,15)
    public boolean validateNoOfDaysOfStay(int noOfDaysOfStay)
    {
        if (this.noOfDaysOfStay>0 && this.noOfDaysOfStay<15)
            return true;
        else
            return false;
    }

    //validating No of extra person not more than 2
    public boolean validateNoOfExtraPersons(int noOfExtraPerson)
    {
        if (this.noOfExtraPerson  == 0 || this.noOfExtraPerson == 1 || this.noOfExtraPerson == 2)
            return true;
        else
            return false;

    }

    //validating typeOfRoom in category
    public boolean validateTypeOfRoom(String typeOfRoom)
    {
        if (typeOfRoom == "Standard"||typeOfRoom=="Deluxe"||typeOfRoom=="Cottage")
            return true;
        else
            return false;
    }


    @Override
    public float calculateBill(String typeOfRoom, int noOfDaysOfStay, int noOfExtraPerson) {
        float baseRoomFare = 0;
        validateNoOfDaysOfStay(noOfDaysOfStay);
        validateTypeOfRoom(typeOfRoom);
        validateNoOfExtraPersons(noOfExtraPerson);
        if (typeOfRoom == "Standard")
            baseRoomFare = 2500;
        if (typeOfRoom == "Deluxe")
            baseRoomFare=3500;
        if (typeOfRoom == "Cottage")
            baseRoomFare=5500;
        float totalBill = (float) ((noOfDaysOfStay*baseRoomFare)+(noOfDaysOfStay*RoomBillComponent.FOOD_CHARGE)+(noOfExtraPerson*RoomBillComponent.EXTRA_PERSON_CHARGE));
        totalBill = (float) (totalBill + (RoomBillComponent.TAX/100)*totalBill);
        return totalBill;
    }
}

