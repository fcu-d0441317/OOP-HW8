package fcu.iecs.oop;

public class Charmander extends Pokemon 
{
	
	Charmander(String name,PokemonType type,int cp)
	{
		super(name,type,cp) ;
	}

	@Override
	public void attack() 
	{
		System.out.println("Ember...") ;

	}

}