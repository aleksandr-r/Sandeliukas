package sandeliukas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Warehouse {
	public static int count;
	public static String size;
	public static int countEggsSum;


	public static void eggsInWarehouseDB(){
        try
        {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/warehouse";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");
            // the mysql select statement
            String queryEggsDetails = "select * from warehouse.warehouse" ;

			// create the java statement
			Statement st = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs = st.executeQuery(queryEggsDetails);

			// iterate through the java resultset
			while (rs.next())
			{
				size = rs.getString("size");
				count= rs.getInt("count");

				// print the results
				System.out.format("%s, %s\n", size,count);

			}
			st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }

	public static void eggsInWarehouseDBTotals(){
		try
		{
			// create a mysql database connection
			String myDriver = "com.mysql.cj.jdbc.Driver";
			String myUrl = "jdbc:mysql://localhost:3306/warehouse";
			Class.forName(myDriver);

			Connection conn = DriverManager.getConnection(myUrl, "root", "root");
			// the mysql select statement
			String queryEggsSum = "select sum(count) from warehouse.warehouse" ;


			// create the java statement
			Statement st = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs1 = st.executeQuery(queryEggsSum);

			rs1.next();
			countEggsSum = rs1.getInt(1);

			System.out.println("Currently we have" + " " + countEggsSum + " " + "eggs");
			st.close();
		}
		catch (Exception e)
		{
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
		}
	}
    int eggsInWarehouse=countEggsSum;

}
