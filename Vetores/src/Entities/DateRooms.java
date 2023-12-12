package Entities;

public class DateRooms {
	private String name;
	private String email;
	private int nRoom;
	
	public DateRooms (String name, String email, int nRoom)
	{
		this.name = name;
		this.email = email;
		this.nRoom = nRoom;
	}
	public String getName ()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public int getNroom()
	{
		return nRoom;
	}
}
