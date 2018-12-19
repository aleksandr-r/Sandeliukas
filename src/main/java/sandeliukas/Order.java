package sandeliukas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

public class Order {

    public Order(int count, String size, String deliveryDate) {
        if((count>0) && (size != null && !size.isEmpty()) && (deliveryDate != null && !deliveryDate.isEmpty())){
            System.out.println("The data is correct. Checking the warehouse...");
            System.out.println();
            executeOrder(count,size,deliveryDate);
                } else {
            System.out.println("Incorrect data");
            Execute.generateNegativeResponse();
        }


}
//todo: before executing, check if that would not result in negative value
     public static void executeOrder (int count, String size, String deliveryDate){
            Warehouse warehouse = new Warehouse();
            System.out.println("Executing the order...");

         try
         {
             // create a mysql database connection
             String myDriver = "com.mysql.cj.jdbc.Driver";
             String myUrl = "jdbc:mysql://localhost:3306/warehouse";
             Class.forName(myDriver);
             Connection conn = DriverManager.getConnection(myUrl, "root", "root");

             // create a sql date object so we can use it in our INSERT statement
             Calendar calendar = Calendar.getInstance();
             java.sql.Date orderDate = new java.sql.Date(calendar.getTime().getTime());

             long order_id = System.currentTimeMillis();
             // the mysql insert statement
            /*String query = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
                    + " values (?, ?, ?, ?, ?)";*/

             String queryInsert = " insert into warehouse.orders (userID, quantity, order_date, order_details, size, order_id)" + " values (?,?,?,?,?,?)" ;

             // create the mysql insert preparedstatement
             PreparedStatement preparedStmt1 = conn.prepareStatement(queryInsert);
             preparedStmt1.setString (1, "1");
             preparedStmt1.setInt(2,count);
             preparedStmt1.setDate    (3, orderDate);
             preparedStmt1.setString(4,deliveryDate);
             preparedStmt1.setString (5, size);
             preparedStmt1.setLong    (6, order_id);

             String queryUpdate = " update warehouse.warehouse set count = (count - ?) where size=?";
             PreparedStatement preparedStmt2 = conn.prepareStatement(queryUpdate);
             preparedStmt2.setInt(1,count);
             preparedStmt2.setString(2,size);

             // execute the preparedstatement
             preparedStmt1.execute();
             preparedStmt2.execute();
             System.out.println("Information passed");

             conn.close();
         }
         catch (Exception e)
         {
             System.err.println("Got an exception!");
             System.err.println(e.getMessage());
         }

         warehouse.eggsInWarehouse = warehouse.eggsInWarehouse - count;
         System.out.println("Eggs left: " + warehouse.eggsInWarehouse);
     }
            /*Warehouse warehouse = new Warehouse();*/




     }




