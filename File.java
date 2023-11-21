import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class File {
	public static void main(String[] args) {
		char data[] = new char [50];
		FileReader input = null;
		FileWriter output = null;
		try {
			input = new FileReader("input.txt");
			int byteRead = input.read(data);
			output = new FileWriter ("output.txt");
			output.write(data, 0, byteRead);
			output.flush();
			output.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}