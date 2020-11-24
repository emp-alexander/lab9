import java.util.Scanner;
public class engine {
    private int cylinders;
    private int capacity;
    private int power;
	
	// с одним параметром
	public engine(int power)
	{
		cylinders = 6;
		capacity = 3;
		this.power = power;
		System.out.println("Конструктор с одним параметром");
	}
	//со всеми параметрами
	public engine(int cylinders, int capacity, int power)
	{
		this.cylinders = cylinders;
		this.capacity = capacity;
		this.power = power;
		System.out.println("Конструктор со всеми парметрами");
	}
	//конструктор без параметров
	public engine()
	{
		cylinders = 6;
		capacity = 3;
		power = 5;
		System.out.println("Конструктор без параметров");
	}
    

    public String GetInfo(){
        return ("Engine: cylinders = " + cylinders + " capacity  = " + capacity + " power = " + power);
    }
    Scanner in = new Scanner(System.in);
    public void Read(){
        System.out.println("Enter the number of cylinders:");
        this.cylinders = in.nextInt();
        System.out.println("Enter capacity:");
        this.capacity = in.nextInt();
        System.out.println("Enter power:");
        this.power = in.nextInt();
    }
}
