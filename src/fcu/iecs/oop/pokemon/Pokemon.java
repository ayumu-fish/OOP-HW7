package fcu.iecs.oop.pokemon;

public abstract class Pokemon {
	
	public final String name;
	public final int cp;
	public PokemonType type;
	
	public abstract void attack();
	
	public PokemonType getType() {
		return type;
	}
	public void setType(PokemonType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public int getCp() {
		return cp;
	}
	
	public Pokemon(String name, PokemonType type,int cp) {
		this.name = name;
		this.cp = cp;
		this.type = type;
	}	
}
