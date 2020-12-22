//lab5
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
    Scanner reader = new Scanner(System.in);
    auto_show a = new auto_show();
    a.read();
    a.display();
	

    //одномерный массив
    System.out.print("Enter array lenght: ");
		int lenght = reader.nextInt();
		auto_show[] o_array = new auto_show[lenght];
		for(int i = 0; i < o_array.length; i++)
		{
			o_array[i] = new auto_show();
			o_array[i].read();
		}
		
		for(int i = 0; i < o_array.length; i++)
		{
			System.out.printf("Object::auto_show[%d]\n", i);
			o_array[i].display();
		}
	//д¬”ћ≈–Ќџ… массив
	System.out.print("Two dimension array[m][n]. Enter m,n: ");
		int m = reader.nextInt();
		int n = reader.nextInt();
		
		auto_show [][]tarray = new auto_show[m][n];
		for(int i = 0; i < tarray.length; i++)
		{
			for(int j = 0; j < tarray[i].length; j++)
			{
				tarray[i][j] = new auto_show();
				tarray[i][j].read();
			}
		}
		
		//Display two dimension array
		for(int i = 0; i < tarray.length; i++)
		{
			for(int j = 0; j < tarray[i].length; j++)
			{
					System.out.printf("Object::auto_show[%d][%d]:\n", i, j);
					tarray[i][j].display();
			}
		}
		
		reader.close();


    }

}
