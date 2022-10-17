
public class Vampire implements Monster{
	private String name;
	private int size;
	

	//add a constructor
public Vampire(String name, int size) {
	this.name=name;
	this.size=size;
}


	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return size;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	@Override
	public boolean isBigger(Monster other) {
		// TODO Auto-generated method stub
		return (size>other.getHowBig());
	}
	@Override
	public boolean isSmaller(Monster other) {
		// TODO Auto-generated method stub
		return (size<other.getHowBig());
	}
	@Override
	public boolean namesTheSame(Monster other) {
		// TODO Auto-generated method stub
		return name.equals(other.getName());
	}
}
