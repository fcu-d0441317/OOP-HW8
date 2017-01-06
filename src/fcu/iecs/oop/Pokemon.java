package fcu.iecs.oop;

public abstract class Pokemon implements Fightable 
{
	private String name ;
	private PokemonType type ;
	private int cp ;
	
	public int get_Cp() 
	{
		return cp ;
	}
	public void set_Cp(int cp) 
	{
		this.cp = cp ;
	}
	public String get_Name() 
	{
		return name ;
	}
	public PokemonType get_Type() 
	{
		return type ;
	}
	

	Pokemon(String name,PokemonType type,int cp)
	{
		this.name = name ;
		this.type = type ;
		this.cp = cp ;
	}
	
	
	@Override
	public abstract void attack() ;

}