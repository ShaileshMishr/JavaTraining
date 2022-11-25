// 3. There are two types of power connections  i) domestic and ii)Industrial
//   You need to write a java program to calculate
//   the electricity bill based on below rules
//
//   For domestic: rental is 250, per unit charge is 5
//                 if user uses less than 200 units in a month
//                 then 50% discount will be given excluding the rental.
//
//   For Industrial: rental is 500, per unit charge is 8
//                   for less than 1000 units, 10% subsidy is given
//  Ask user to input type of connection and no. on units
//   and calculate the electricity bill.

package JavaBasics.src.Day3;

public class Power {


    private String PowerConnection;
    private int Unit;

    public double domesticPrice;



    public String getPowerConnection() {
        return PowerConnection;
    }

    public void setPowerConnection(String powerConnection) {
        PowerConnection = powerConnection;
    }

    public int getUnit() {
        return Unit;
    }

    public void setUnit(int unit) {
        Unit = unit;
    }

    public double domesticPrice(){
        if(Unit>200){
            return 250+(5*getUnit());
        }
        else {
            return 250+((5*getUnit())-((5*getUnit()*50/100)));
        }

    }

    public double industrialPrice() {
        if (Unit > 1000) {
            return 500 + (8 * getUnit());
        }
        else {
            return 500+(((8*getUnit())-(8*getUnit()*10/100)));
        }
    }
}

