//lab5

public class Main {
    public static void main (String[] args) {
		
			engine a1 = new engine();
            System.out.println(a1.GetInfo());
            engine a2 = new engine(9);
            System.out.println(a2.GetInfo());
            engine a3 = new engine(4, 5, 7);
            System.out.println(a3.GetInfo());

            engine[] arr = new engine[3];
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = new engine(8);
                System.out.println(arr[i].GetInfo());
            }
		
		}

}
