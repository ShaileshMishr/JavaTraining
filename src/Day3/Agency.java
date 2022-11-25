
//  A Wholesale agency deals only in induction heater and electric kettle
//   you need to generate a purchase order for the agency using java program
//   ask user to input the item name and the quantity
//   For induction cooker: quantity more than 50 then price is 850 per unit
//                         quantity less than 50 and more than 30 price is 900
//                         quantity less than 30 price is 950
// For electric kettle: quantity more than 50 price is 700 per unit
//         quantity less than 50 and more than 30 price is 800
//         quantity less than 30 price is 900

package JavaBasics.src.Day3;

public class Agency {
    double price;
    String item;
    int quantity;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice() {
    if(item.equalsIgnoreCase("InductionHeater") && (quantity>50)) {
        this.price = (quantity * 850);
    }
        if(item.equalsIgnoreCase("InductionHeater") && ((quantity<50) && (quantity>30)) ) {
            this.price = (quantity * 900);
        }
        if(item.equalsIgnoreCase("InductionHeater") && (quantity<30)) {
            this.price = (quantity * 950);
        }
        if(item.equalsIgnoreCase("ElectricKettle") && (quantity>50)) {
            this.price = (quantity * 700);
        }
        if(item.equalsIgnoreCase("ElectricKettle") && ((quantity<50) && (quantity>30)) ){
            this.price = (quantity * 800);
        }
        if(item.equalsIgnoreCase("ElectricKettle") && (quantity<30)) {
            this.price = (quantity * 900);
        }


    }
}

