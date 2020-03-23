package hw7;

abstract class AnimalClassTester {
	AniName aniName;
	Anifood anifood;
	Aniinfo aniinfo;
	
	public AnimalClassTester(AniName aniName,Anifood anifood,Aniinfo aniinfo) 
	{
		this.aniname = aniname;
		this.anifood = anifood;
		this.aniinfo = aniinfo;
	}

	public void roar()
	{
		System.out.println("Roarrrr!")
	}

	public void name()
	{
		aniname.name();
	}
	public void movement()
	{
		System.out.println("waddle and swim");	
	}
	public void food()
	{
		anifood.food();
	}
	public void info()
	{
		aniinfo.info();
	}
}

interface AniName
{
	public void name ();
}
class ExpectedCow implements AniName
{
	public void name ()
	{
		System.out.println("Cow")
	}
}
class Tyrannosaur implements AniName
{
	public void name ()
	{
		System.out.println("Tyranosaurus Rex");
	}
}
class Penguin implements AniName
{
	public void name ()
	{
		System.out.println("penguin");
	}
}
class Octopus implements AniName
{
	public void name ()
	{
		System.out.println("octopus");
	}
}
interface Anifood
{
	public void food();
}
class expectedfood implements Anifood
{
	public void food ()
	{
		System.out.println("grass, hay, and corn");
	}
}
class IEat implements Anifood
{
	public void food ()
	{
		System.out.println("mostly fish");
	}
}
class myFood implements Anifood
{
	public void food ()
	{
		System.out.println("other dinosaurs");
	}
}
class octoFood implements Anifood
{
	public void food ()
	{
		System.out.println("seaweed");
	}
}
interface Aniinfo
{
	public void info();
}
class expectedinfo implements Aniinfo
{
	public void info()
	{
		System.out.println("milk and cheese");
	}
}
class octoinfo implements Aniinfo
{
	public void info()
	{
		System.out.println("eight limbs");
	}
}
class Cow extends AnimalClassTester
{
	public cow (AniName aniName,Anifood anifood)
	{
		characters(aniname,anifood);
	}
	public void display()
	{
		System.out.println("Cow")
	}
}

class Ty extends AnimalClassTester
{
	public Ty (AniName aniName,Anifood anifood,Aniinfo aniinfo)
	{
		characters(aniname,anifood);
	}
	public void display()
	{
		System.out.println("Tyranosaurus Rex");
	}
}
class Pen extends AnimalClassTester
{
	public Pen (AniName aniName,Anifood anifood)
	{
		characters(aniname,anifood);
	}
	public void display()
	{
		System.out.println("penguin");
	}
}
class Oct extends AnimalClassTester
{
	public Pen (AniName aniName,Anifood anifood,Aniinfo aniinfo)
	{
		characters(aniname,anifood);
	}
	public void display()
	{
		System.out.println("octopus");
	}
}
