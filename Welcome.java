class Welcome
{
	public void accept()
	{
		System.out.println("Welcome in accept");
	}
	public void display()
	{
		System.out.println("Welcome to Deloitte");
		System.out.println("Welcome in ITPL");
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to MAIN");
		Welcome w = new Welcome();
		w.display();
		w.accept();
		Bye b = new Bye();
		b.sayBye();
	}
}
class Bye
{
	public void sayBye()
	{
		System.out.println("Bye");
	}
}