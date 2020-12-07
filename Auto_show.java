import java.util.Scanner;
import java.io.IOException;
public class auto_show {
	private static int racing = 7;
    private String autoBrand;
    private String autoName;
    private int autoCost;
    private int autoMax_speed;
    private int autoYear;
    private engine autoeng1 = new engine();

    void init(String brend, String name, int cost, int max_speed, int year, engine eng1)
    {
        this.autoBrand = brend;
        this.autoName = name;
        this.autoCost = cost;
        this.autoMax_speed = max_speed;
        this.autoYear = year;
        this.autoeng1 = eng1;
    }

	Scanner in = new Scanner(System.in);
    void display()
    {
        System.out.println("Brand: " + autoBrand);
        System.out.println("Name: " + autoName);
        System.out.println("Cost: " + autoCost);
        System.out.println("Max speed: " + autoMax_speed);
        System.out.println("Year: " + autoYear);
        System.out.println(autoeng1.GetInfo());
    }
    
    public void read(){
       

        System.out.println("Enter brand: ");
        this.autoBrand = in.nextLine();
        System.out.println("Enter name: ");
        this.autoName = in.nextLine();
        System.out.println("Cost: ");
        this.autoCost = in.nextInt();
        System.out.println("Max speed: ");
        this.autoMax_speed = in.nextInt();
        System.out.println("Year: ");
        try{
        this.autoYear = in.nextInt();
        if(autoYear<0)
            throw new Exception("Exception::negative number");
        } catch (Exception e)
        {
            System.err.println("Incorrect input");
        }
        
        autoeng1.Read();
    }
  //  public class MyException extends MyException
    //{
      //  private String exception;
        //public MyException(String exc)
        //{
          //  exception = exc;
        //}
        //public String getMessage()
        //{
         //   return exception;
        //}
    //}
    add CostAndSpeed()
    {
        return new add(autoCost, autoMax_speed);
    }
	
	static void Racingset(int r)
    {
        racing = r;
    }

    static int Racing()
    {
        return racing;
    }

}
