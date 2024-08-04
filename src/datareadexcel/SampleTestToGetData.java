package datareadexcel;

import java.io.IOException;
import java.util.ArrayList;

public class SampleTestToGetData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	DataReaderExcel reader = new DataReaderExcel();
	ArrayList<String> data = reader.test("Jane");
	System.out.println(data.get(0));
	System.out.println(data.get(1));
	System.out.println(data.get(2));
	System.out.println(data.get(3));
	
	}

}
