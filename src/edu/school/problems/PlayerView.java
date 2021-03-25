package edu.school.problems;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JComponent;

public class PlayerView extends JComponent 
{
	private DominoPlayer player;
	
	public PlayerView(DominoPlayer player)
	{
		this.player = player;
	}
	
	@Override
	public void paintComponent(Graphics graphics)
	{
		/*
		Graphics2D g = (Graphics2D)graphics.create();
		g.setColor(Color.lightGray);
		g.fill(new Rectangle2D.Double(0, 0, 500, 500));
		int x = 60;
		int y = 220;
		Iterator<DominoTile> it = table.getDominoTile().getIterator();
		while(it.hasNext())
		{
			g.translate(x, y);
			paintTile(g, it.next());
			g.translate(-x,  -y);
			x += 120;
		}
			for(DominoTile t : table.getDominoTable())
		{
			if(t == null)
				continue;
			g.translate(x, y);
			paintTile(g, t);
			g.translate(-x,  -y);
			x += 120;
		}*/
		
	}
	
}