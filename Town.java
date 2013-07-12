import java.util.*;
public class Town {
  
	private String name;//name of the town
	private ArrayList<Town> neighbours=new ArrayList<Town>();
	private int id;
	public Town()
	{
		name="";
		id=-1;
	}
	public Town(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
    public String getName()
    {
    	return name;
    }
    public ArrayList<Town> getNeighbours()
    {
    	return neighbours;
    }
    public void addNeighbour(Town n)
    {
    	neighbours.add(n);
    }
}
