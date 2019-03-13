
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Login {

	public static void main(String[] args) throws IOException{
	getData();

}
	
	public static List<String> getData() throws IOException {
		List<String> newList;	
		String[] lines = null;
		int sizeOfData = 0;
		String[] clean = null;
		int index = 0;
		String data = "";
		FileReader fr;
		BufferedReader br;
		int year;
		int month;
		int day;
		int hour;
		int minute;
		fr = new FileReader("C:\\Users\\SANJAY\\Downloads\\att.txt");
		br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null) {
			sizeOfData++;
			data = data + "\n" + line;
			line = br.readLine();
		}
		br.close();
		lines = data.split("\\r?\\n");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i <= sizeOfData; i++) {
			list.add(lines[i]);
		}
		newList = list.stream().distinct().collect(Collectors.toList());
		String data2 = newList.get(1);
		String[] data3 = data2.split("[-:?.@;/']+");
		String[] splited = data3[2].split("\\s+");
		year = Integer.parseInt(data3[0]);
		month = Integer.parseInt(data3[1]);
		day = Integer.parseInt(splited[0]);
		hour = Integer.parseInt(splited[1]);
		minute = Integer.parseInt(data3[3]);
		
		return newList;

	}

}