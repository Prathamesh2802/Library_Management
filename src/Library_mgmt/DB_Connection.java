/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library_mgmt;

import java.sql.*;
/*
*
 * @author Prathamesh
 */
public class DB_Connection {
	Connection c;

	public DB_Connection() {
		try {
                                                      Statement s;
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///library_management","Pinu","pinu");
			s = c.createStatement();
			
		} catch(Exception e) {
			System.out.println(e); 
		}
	}
}
