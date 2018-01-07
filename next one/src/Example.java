
class Dog implements pet{
		public void befriendly(){
			
		}
	}
	interface pet{
		void befriendly();
	}
	class Do extends Dog
	{
		
	}
public class Example {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Do obj=new Do();
			obj.befriendly();
			
	}

}
