package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;


public class Csv {
	
	
	
	public static List<String[]> read(String file )
	{
		List<String[]>list = new LinkedList<String[]>();
		
		String Data ;
		try
		{
			BufferedReader  br = new BufferedReader(new FileReader(file));
			while((Data = br.readLine())!= null)
			{
				String[] datarecords = Data.split(",");
				list.add(datarecords);	
			}
			
			br.close();
		}
		catch(FileNotFoundException e)
		{
			
			e.printStackTrace();
		}
		catch(Exception e)
		{
			
		}
		
		return list;
	}
}
