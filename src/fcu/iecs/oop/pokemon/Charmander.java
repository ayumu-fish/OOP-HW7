package fcu.iecs.oop.pokemon;

public class Charmander extends Pokemon{
	@Override
	public void attack()
	{
		System.out.println("Ember¡K");
	}
	
	Charmander(String name, PokemonType type,int cp)
	{
		super(name,type,cp);
	}
}
