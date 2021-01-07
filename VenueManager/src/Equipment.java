
public abstract class Equipment {        //declaration of fields which we will use throughout this class.
    final protected String equipmentName;
    final protected int equipmentId;
    final protected int equipmentAmount;

    final protected double equipmentBuyPrice;
    final protected String equipmentComment;

                                //Initialising the class fields with the help of the constructor parameters.
    public Equipment(String equipmentName, int equipmentId, int equipmentAmount, double equipmentBuyPrice, String equipmentComment) {
        this.equipmentName = equipmentName;
        this.equipmentId = equipmentId;
        this.equipmentAmount = equipmentAmount;
        this.equipmentBuyPrice = equipmentBuyPrice;
        this.equipmentComment = equipmentComment;

    }
                                // The getter getEquipmentName is needed for our search method in the warehouse.
    public String getEquipmentName() {
        return equipmentName;
    }
                                // The getter getEquipmentId is needed for our deletion method in the warehouse.
    public int getEquipmentNumber() {
        return equipmentId;
    }

                                /* The toString method is overridden and used to return an overview string to
                                the warehouse, which then can be returned to the main class.
                                 */
    @Override
    public String toString() {
        String equipmentSummary = "Name: " + equipmentName;
        equipmentSummary += "\nID: " + equipmentId;
        equipmentSummary += "\nAmount: " + equipmentAmount;
        equipmentSummary += "\nInfo: " + equipmentComment;
        equipmentSummary += "\n----------------------------\n\n";
        return  equipmentSummary;
    }
}

/* To-do:
TODO: Create setter for equipmentAmount. 26-12: Do we need this if we build objects per piece?
TODO: Create method to calculate rentalPrice, which will eventually use the (yet to construct) class "Offer". 26-12: separate class?
TODO: fix debugger comments
 */