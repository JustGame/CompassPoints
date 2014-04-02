package compassPoints;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class CompassPoint implements Comparable<CompassPoint> {
	
	private int X;
	private int Y;
	private int Z;
	private int position;
	
	private World world;
	private String name;
	
	public CompassPoint(){
		
		X = 0;
		Y = 0;
		Z = 0;
		world = Bukkit.getWorld("world");	
		name = "DEFAULT";
	}
	
	public CompassPoint(int X, int Y, int Z, World world, String name){
		
		this.X = X;
		this.Y = Y;
		this.Z = Z;
		this.world = world;
		this.name = name;
	}
	
	@Override
	public int hashCode()
	{
		return Integer.getInteger(this.getX().toString() + this.getY().toString() + this.getZ().toString());
	}

	@Override
	public boolean equals(Object o)
	{
		CompassPoint compassPoint = (CompassPoint) o;
		
		if(compassPoint.getWorld().equals(this.getWorld()) && compassPoint.getName().equals(this.getName()) && compassPoint.getX().equals(this.getX())
				&& compassPoint.getY().equals(this.getY()) && compassPoint.getZ().equals(this.getZ()))
	    return true;
		else
		return false;
	}
	
	public Integer getX(){
		return this.X;
	}
	
	public double getDoubleX(){
		return (double) this.X;
	}
	
	public Integer getY(){
		return this.Y;
	}
	
	public double getDoubleY(){
		return (double) this.Y;
	}
	
	public Integer getZ(){
		return this.Z;
	}
	
	public double getDoubleZ(){
		return (double) this.Z;
	}
	
	public World getWorld(){
		return this.world;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getPosition(){
		return this.position;
	}
	
	public Location getLocation(){
		return new Location(this.getWorld(), this.getDoubleX(), this.getDoubleY(), this.getDoubleZ());
	}
	
	public Location getHeadLocation(){
		return new Location(this.getWorld(), this.getDoubleX(), this.getDoubleY() + 1.0, this.getDoubleZ());
	}
	
	public void setX(int X){
		this.X = X;
	}
	
	public void setY(int Y){
		this.Y = Y;
	}
	
	public void setZ(int Z){
		this.Z = Z;
	}
	
	public void setWorld(World world){
		this.world = world;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPosition(int i){
		this.position = i;
	}

	@Override
	public int compareTo(CompassPoint o) {

	if(o.equals(this)){
		return 0;
	}else if (o.getPosition() < this.getPosition()){
		return 1;
	}else if (o.getPosition() > this.getPosition()){
		return -1;
	}else{
		return 1;
	}
	}

}