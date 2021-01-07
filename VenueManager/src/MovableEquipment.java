public class MovableEquipment extends Equipment{
    final protected double equipmentRentalPrice;

    public MovableEquipment(String equipmentName, int equipmentId, int equipmentAmount, double equipmentBuyPrice, String equipmentComment) {
        super(equipmentName, equipmentId, equipmentAmount, equipmentBuyPrice, equipmentComment);
        equipmentRentalPrice = (equipmentBuyPrice / 25);
    }

    public void SetRentalPeriod(String rentalStart, String rentalStop) {

    }

    @Override
    public String toString() {
        String equipmentSummary = "Name: " + equipmentName;
        equipmentSummary += "\nID: " + equipmentId;
        equipmentSummary += "\nAmount: " + equipmentAmount;
        equipmentSummary += "\nRentalPrice per day: " + equipmentRentalPrice;
        equipmentSummary += "\nInfo: " + equipmentComment;
        equipmentSummary += "\n----------------------------\n\n";
        return  equipmentSummary;
    }
}
