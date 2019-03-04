import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperty {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		Properties p=new Properties();
		File f=new File("E:\\Swabhav_repository\\OOP WORKSPACE\\property-app\\db.properties.txt");
		FileInputStream fr=new FileInputStream(f);
		
		p.load(fr);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("email"));
	}

}
