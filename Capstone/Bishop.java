import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import java.awt.Color;
import java.util.ArrayList;

/**
 * Write a description of class Bishop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bishop extends ChessPiece
{
    private ArrayList<Location> availableMoves;
    /**
     * Default constructor for objects of class Bishop
     */
    public Bishop(Color color, Location currentLocation, boolean hasMoved, ActorWorld world)
    {
        super(color, currentLocation, hasMoved, world);
        availableMoves = new ArrayList<Location>();
    }

    public ArrayList<Location> getAvailableLocations()
    {
        if (this.getColor().equals(Color.WHITE)) // add exception for obstacle
        {
            this.availableMoves.clear();
            int count1 = 1;
            for (int i = 0; i < getWorld().getGrid().getNumRows(); i++)
            {
                Location move = new Location(this.getCurrentLocation().getRow() - count1, this.getCurrentLocation().getCol() + count1);
                if (getWorld().getGrid().isValid(move))
                {
                    if (getWorld().getGrid().get(move) != null)
                    {
                        if (getWorld().getGrid().get(move).getColor().equals(Color.BLACK))
                        {this.availableMoves.add(move);}
                        else if (getWorld().getGrid().get(move).getColor().equals(Color.WHITE))
                        {break;}
                    }
                    else if (getWorld().getGrid().get(move) == null)
                    {
                        this.availableMoves.add(move);
                    }
                }
                count1++;
            }
            int count2 = 1;
            for (int i = 0; i < getWorld().getGrid().getNumRows(); i++)
            {
                Location move2 = new Location(this.getCurrentLocation().getRow() - count2, this.getCurrentLocation().getCol() - count2);
                if (getWorld().getGrid().isValid(move2))
                {
                    if (getWorld().getGrid().get(move2) != null)
                    {
                        if (getWorld().getGrid().get(move2).getColor().equals(Color.BLACK))
                        {this.availableMoves.add(move2);}
                        else if (getWorld().getGrid().get(move2).getColor().equals(Color.WHITE))
                        {break;}
                    }
                    else if (getWorld().getGrid().get(move2) == null)
                    {
                        this.availableMoves.add(move2);
                    }
                }
                count2++;
            }
            int count3 = 1;
            for (int i = 0; i < getWorld().getGrid().getNumCols(); i++)
            {
                Location move = new Location(this.getCurrentLocation().getRow() + count3, this.getCurrentLocation().getCol() + count3);
                if (getWorld().getGrid().isValid(move))
                {
                    if (getWorld().getGrid().get(move) != null)
                    {
                        if (getWorld().getGrid().get(move).getColor().equals(Color.BLACK))
                        {this.availableMoves.add(move);}
                        else if (getWorld().getGrid().get(move).getColor().equals(Color.WHITE))
                        {break;}
                    }
                    else if (getWorld().getGrid().get(move) == null)
                    {
                        this.availableMoves.add(move);
                    }
                }
                count3++;
            }
            int count4 = 1;
            for (int i = 0; i < getWorld().getGrid().getNumCols(); i++)
            {
                Location move2 = new Location(this.getCurrentLocation().getRow() + count4, this.getCurrentLocation().getCol() - count4);
                if (getWorld().getGrid().isValid(move2))
                {
                    if (getWorld().getGrid().get(move2) != null)
                    {
                        if (getWorld().getGrid().get(move2).getColor().equals(Color.BLACK))
                        {this.availableMoves.add(move2);}
                    }
                    else if (getWorld().getGrid().get(move2) == null)
                    {
                        this.availableMoves.add(move2);
                    }
                }
                count4++;
            }
        }
        else if (this.getColor().equals(Color.BLACK))
        {
            this.availableMoves.clear();
            int count1 = 1;
            for (int i = 0; i < getWorld().getGrid().getNumRows(); i++)
            {
                Location move = new Location(this.getCurrentLocation().getRow() - count1, this.getCurrentLocation().getCol() + count1);
                if (getWorld().getGrid().isValid(move))
                {
                    if (getWorld().getGrid().get(move) != null)
                    {
                        if (getWorld().getGrid().get(move).getColor().equals(Color.WHITE))
                        {this.availableMoves.add(move);}
                        else if (getWorld().getGrid().get(move).getColor().equals(Color.BLACK))
                        {break;}
                    }
                    else if (getWorld().getGrid().get(move) == null)
                    {
                        this.availableMoves.add(move);
                    }
                }
                count1++;
            }
            int count2 = 1;
            for (int i = 0; i < getWorld().getGrid().getNumRows(); i++)
            {
                Location move2 = new Location(this.getCurrentLocation().getRow() - count2, this.getCurrentLocation().getCol() - count2);
                if (getWorld().getGrid().isValid(move2))
                {
                    if (getWorld().getGrid().get(move2) != null)
                    {
                        if (getWorld().getGrid().get(move2).getColor().equals(Color.WHITE))
                        {this.availableMoves.add(move2);}
                        else if (getWorld().getGrid().get(move2).getColor().equals(Color.BLACK))
                        {break;}
                    }
                    else if (getWorld().getGrid().get(move2) == null)
                    {
                        this.availableMoves.add(move2);
                    }
                }
                count2++;
            }
            int count3 = 1;
            for (int i = 0; i < getWorld().getGrid().getNumCols(); i++)
            {
                Location move = new Location(this.getCurrentLocation().getRow() + count3, this.getCurrentLocation().getCol() + count3);
                if (getWorld().getGrid().isValid(move))
                {
                    if (getWorld().getGrid().get(move) != null)
                    {
                        if (getWorld().getGrid().get(move).getColor().equals(Color.WHITE))
                        {this.availableMoves.add(move);}
                        else if (getWorld().getGrid().get(move).getColor().equals(Color.BLACK))
                        {break;}
                    }
                    else if (getWorld().getGrid().get(move) == null)
                    {
                        this.availableMoves.add(move);
                    }
                }
                count3++;
            }
            int count4 = 1;
            for (int i = 0; i < getWorld().getGrid().getNumCols(); i++)
            {
                Location move2 = new Location(this.getCurrentLocation().getRow() + count4, this.getCurrentLocation().getCol() - count4);
                if (getWorld().getGrid().isValid(move2))
                {
                    if (getWorld().getGrid().get(move2) != null)
                    {
                        if (getWorld().getGrid().get(move2).getColor().equals(Color.WHITE))
                        {this.availableMoves.add(move2);}
                        else if (getWorld().getGrid().get(move2).getColor().equals(Color.BLACK))
                        {break;}
                    }
                    else if (getWorld().getGrid().get(move2) == null)
                    {
                        this.availableMoves.add(move2);
                    }
                }
                count4++;
            }
        }
        return availableMoves;
    }

}
