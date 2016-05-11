import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import java.awt.Color;
import java.util.ArrayList;

/**
 * A chess piece that can move to and capture an enemy piece in any space on the board in the same 
 * column or row as long as there is not a piece blocking the way
 * 
 * @author @Lim
 * @version 14 April 2016
 */
public class Rook extends ChessPiece
{
    private ArrayList<Location> availableMoves;
    /**
     * Constructs a rook given color, location, and world.
     */
    public Rook(Color color, Location currentLocation, ActorWorld world)
    {
        super(color, currentLocation, world);
        availableMoves = new ArrayList<Location>();
    }
    
    /**
     * Adds locations that the piece can move based on its algorithm to an ArrayList
     */
    public ArrayList<Location> getAvailableLocations()
    {
        if (this.getColor().equals(Color.WHITE)) // add exception for obstacle
        {
            this.availableMoves.clear();
            int count1 = 1;
            for (int i = 0; i < getWorld().getGrid().getNumRows(); i++)
            {
                Location move = new Location(this.getCurrentLocation().getRow() - count1, this.getCurrentLocation().getCol());
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
                Location move2 = new Location(this.getCurrentLocation().getRow() + count2, this.getCurrentLocation().getCol());
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
                Location move = new Location(this.getCurrentLocation().getRow(), this.getCurrentLocation().getCol() - count3);
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
                Location move2 = new Location(this.getCurrentLocation().getRow(), this.getCurrentLocation().getCol() + count4);
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
                count4++;
            }
        }
        else if (this.getColor().equals(Color.BLACK))
        {
            this.availableMoves.clear();
            int count1 = 1;
            for (int i = 0; i < getWorld().getGrid().getNumRows(); i++)
            {
                Location move = new Location(this.getCurrentLocation().getRow() - count1, this.getCurrentLocation().getCol());
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
                Location move2 = new Location(this.getCurrentLocation().getRow() + count2, this.getCurrentLocation().getCol());
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
                Location move = new Location(this.getCurrentLocation().getRow(), this.getCurrentLocation().getCol() - count3);
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
                Location move2 = new Location(this.getCurrentLocation().getRow(), this.getCurrentLocation().getCol() + count4);
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
