package sandeliukas;

import java.sql.*;
import java.util.Calendar;

public class DatabaseMaintenance {

    public static void main(String[] args)
    {
        try
        {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/warehouse";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");

            // create a sql date object so we can use it in our INSERT statement
            Calendar calendar = Calendar.getInstance();
            Date orderDate = new Date(calendar.getTime().getTime());

			long order_id = System.currentTimeMillis();
					// the mysql insert statement
            /*String query = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
                    + " values (?, ?, ?, ?, ?)";*/

            String checkIfMoreThan0 = "select count from warehouse.warehouse where size =?";
            //String one = "L";

//todo sutvarkyti kad validuotu kai 0 arba maziau
          PreparedStatement preparedStmt0 = conn.prepareStatement(checkIfMoreThan0);
            preparedStmt0.setString(1,"L");
            System.out.println(preparedStmt0);
            //preparedStmt0.execute();
            ResultSet rsx = preparedStmt0.executeQuery();
            rsx.next();
            String result = rsx.getString(1);
            System.out.println(result);

/*sitas irgi veikia
            CallableStatement st = conn.prepareCall(checkIfMoreThan0);
                    st.setString(1,"L");
            System.out.println(st);

            ResultSet rs1 = st.executeQuery();
            rs1.next();
            String result = rs1.getString(1);
            System.out.println(result);

*/

            String queryInsert = " insert into warehouse.orders (userID, quantity, order_date, order_details, size, order_id)" + " values (?,?,?,?,?,?)" ;

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt1 = conn.prepareStatement(queryInsert);
            preparedStmt1.setString (1, "1");
            preparedStmt1.setInt(2, 33);
            preparedStmt1.setDate    (3, orderDate);
            preparedStmt1.setString    (4, "2019");
            preparedStmt1.setString    (5, "L");
			preparedStmt1.setLong    (6, order_id);

			String queryUpdate = " update warehouse.warehouse set count = (count - ?) where size=?";
            PreparedStatement preparedStmt2 = conn.prepareStatement(queryUpdate);
            preparedStmt2.setInt(1,33);
            preparedStmt2.setString(2,"L");

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
    }
}
