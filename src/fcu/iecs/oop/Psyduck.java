package fcu.iecs.oop;

public class Psyduck extends Pokemon 
{
	
	Psyduck(String name,PokemonType type,int cp)
	{
		super(name,type,cp) ;
	}

	@Override
	public void attack() 
	{
		System.out.println("Aqua Tail...") ;
	}

}