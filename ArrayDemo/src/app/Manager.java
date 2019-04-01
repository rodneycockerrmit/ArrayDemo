package app;

import pets.Dog;

public class Manager {

	Dog[] dogs;
	
	public Manager()
	{
		dogs = new Dog[5];
		addDogs();
	}
	
	private void addDogs()
	{
		Dog fido = new Dog("Fido");
		Dog rex = new Dog("Rex");
		Dog thai = new Dog("Thai");
		Dog cain = new Dog("Cain");
		
		dogs[0] = fido;
		dogs[1] = rex;
		dogs[2] = thai;
		dogs[3] = cain;
	}
	
	public boolean findDog(String name)
	{
		boolean found = false;
		for(int i = 0; i < dogs.length; i++)
		{
			if(dogs[i] != null)
			{
				if(dogs[i].getName().equals(name))
				{
					found = true;
				}
			}
		}
		return found;
	}
}
