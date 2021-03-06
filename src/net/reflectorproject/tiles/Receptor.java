package net.reflectorproject.tiles;

import net.reflectorproject.world.Grid;

public class Receptor extends Solid
{

	public byte color;
	
	public Receptor()
	{
		// TODO Auto-generated constructor stub
		this(null, (byte) 0, (byte) 0, false, null, (byte) 0);
	}

	public Receptor(Grid w)
	{
		this(w, (byte) 0, (byte) 0, false, null, (byte) 0);
	}

	public Receptor(Grid w, byte x, byte y)
	{
		this(w, x, y, false, null, (byte) 0);
		// TODO Auto-generated constructor stub
	}

	public Receptor(Grid w, byte x, byte y, boolean move)
	{
		this(w, x, y, move, null, (byte) 0);
		// TODO Auto-generated constructor stub
	}

	public Receptor(Grid w, byte x, byte y, boolean move, String src)
	{
		this(w, x, y, move, src, (byte) 0);
		// TODO Auto-generated constructor stub
	}

	public Receptor(Grid w, byte x, byte y, boolean move, String src,
			byte direct)
	{
		super(w, x, y, move, src, direct);
		// TODO Auto-generated constructor stub
	}
	
	public byte getColor()
	{
		return color;
	}
	
	public void setColor(byte c)
	{
		color = c;
	}

	public void update()
	{

	}

	public void paint()
	{

	}
	
	public void decodeMetaData(short metaData)
	{
		byte color = (byte)(metaData%10);
		metaData/=10;
		byte direct = (byte)(metaData%10);
		metaData/=10;
		byte y = (byte)(metaData%10);
		metaData/=10;
		byte x = (byte)(metaData%10);
		setDirection(direct);
		setColor(color);
		setPosition(x, y);
	}

}
