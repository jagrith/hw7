package hw7;

public class hw7 {

	public static void main(String[] args) {

    AniName expectedCow = new expectedCow(); 
    AniName tyrannosaur = new tyrannosaur(); 
    AniName penguin = new penguin(); 
    AniName octopus = new octopus();
    Anifood food = new food(); 
    AniName myFood = new myFood(); 
    AniName IEat = new IEat(); 
    AniName octfood = new octofood();
    Aniinfo expectedinfo = new expectedinfo(); 
    Aniinfo octoinfo = new octoinfo(); 
  
        // Make a fighter with desired behaviors 
    AnimalClassTester cow = new cow(expectedCow,food,info); 
    Cow.display(); 
    AnimalClassTester tyrannosaur = new tyrannosaur(tyrannosaur,myFood); 
    tyrannosaur.display(); 
    AnimalClassTester penguin = new penguin(penguin,IEat); 
    penguin.display(); 
    AnimalClassTester octopus = new octopus(octopus,octoFood,octoinfo); 
    tyrannosaur.display();       
    } 
} 
