import java.sql.*;

public class insert {  
	public static void main(String[]args) throws Exception {
		 insertData();
	}
		public static void  insertData() throws Exception {
			String url="";
			String username="root";
			String password= "";
			String Query= "insert into student values(?,?,?)" ;
			connection con=DriveManager.getConnection(url,username,password);
			PreparedStatement pst=con.PreparedStatement(Query);
			pst.setString(1, "haritha");
			pst.setInt(2, 23);
			pst.setString(3, "haritha20@gmail.com");
			pst.executeUpdate();
			pst.close();	 	
		}
}
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 github token
https://github.com/harita2020/Newproject.git