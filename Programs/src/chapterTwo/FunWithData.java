package Programs.src.chapterTwo;

/*
*   Program Name: Fun With Data
*   Author: Matheus Marques
*   Class: FunWithData
*   Date Written: 09/02/2025
*   Brief Description: -
*   Description of inputs: -
*   Description of outputs: -
*/
public class FunWithData {
    public static void main(String[] args) {
        int id = 10;
        int quantity = 5;
        int fee = 10;
        double value = 100.0;
        String phoneNumber = "(999) 999-9999";
        String clientName = "John Doe";

        double totalValue = value * quantity;

        totalValue = totalValue + fee; // Java convert lower data type (int) to higher data type(double) (type change
                                       // by promotion)

        System.out.println("Product ID [" + id + "]\nValue [" + value + "]\nQuantity [" + quantity + "]\nClient ["
                + clientName + "]\nPhone [" + phoneNumber + "]");
        System.out.println("Total to pay ((" + value + " x " + quantity + ") + " + fee + ") = [" + totalValue + "]");
    }
}

/*
 * Product ID [10]
 * Value [100.0]
 * Quantity [5]
 * Client [John Doe]
 * Phone [(999) 999-9999]
 * Total to pay ((100.0 x 5) + 10) = [510.0]
 */
