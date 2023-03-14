interface Person5{
	 public  void eat();
  }
public class PersonImplLambda2 {

	public static void main(String[] args) {
        Person5 p5=() ->System.out.println("Rich food");
	
           p5.eat();

	}

}
