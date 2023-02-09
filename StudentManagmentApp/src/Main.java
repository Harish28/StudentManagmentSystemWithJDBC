import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.studentmanage.Student;
import com.studentmanage.StudentDao;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Heelo");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to Add");
			System.out.println("Press 2 to Delete");
			System.out.println("Press 3 to Display");
			System.out.println("Press 4 to exit");
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				System.out.println("Enter the name:");
				String name = br.readLine();
				
				System.out.println("Enter the city:");
				String city = br.readLine();
				
				System.out.println("Enter the mobile no:");
				String number = br.readLine();
				Student s = new Student(name,city,number);
				boolean res = StudentDao.insertIntoDB(s);
				if(res) {
					System.out.println("Student added..:" + s);
				} else {
					System.out.println("Opps something went wrong...");
				}
			} else if(c == 2) {
				System.out.println("Enter Student Id to delete it:");
				int id = Integer.parseInt(br.readLine());
				boolean flag = StudentDao.deleteStudentFromDB(id);
				if(flag) {
					System.out.println("Student removed");
				} else {
					System.out.println("Opps something went wrong...");
				}
				
			} else if(c == 3) {
				ResultSet set = StudentDao.findAllStudents();
				if(set != null) {
					try {
						while(set.next()) {
							Student s = new Student(set.getString(2),set.getString(4),set.getString(3),set.getInt(1));
							System.out.println(s);
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} else {
				break;
			}
		}
		System.out.println("See you soon...");

	}

}
