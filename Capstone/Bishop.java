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
            int count = 1;
            for (int i = 0; i < getWorld().getGrid().getNumRows(); i++)
            {
                Location move = new Location(this.getCurrentLocation().getRow() - count, this.getCurrentLocation().getCol() + count);
                if (getWorld().getGrid().isValid(move))
                {this.availableMoves.add(move);}
                Location move2 = new Location(this.getCurrentLocation().getRow() - count, this.getCurrentLocation().getCol() - count);
                if (getWorld().getGrid().isValid(move2))
                {this.availableMoves.add(move2);}
                count++;
            }
            int count2 = 1;
            for (int i = 0; i < getWorld().getGrid().getNumCols(); i++)
            {
                Location move = new Location(this.getCurrentLocation().getRow() + count2, this.getCurrentLocation().getCol() + count2);
                if (getWorld().getGrid().isValid(move))
                {this.availableMoves.add(move);}
                Location move2 = new Location(this.getCurrentLocation().getRow() + count2, this.getCurrentLocation().getCol() - count2);
                if (getWorld().getGrid().isValid(move2))
                {this.availableMoves.add(move2);}
                count2++;
            }
        }
        else if (this.getColor().equals(Color.BLACK))
        {
            this.availableMoves.clear();
            int count = 1;
            for (int i = 0; i < getWorld().getGrid().getNumRows(); i++)
            {
                Location move = new Location(this.getCurrentLocation().getRow() - count, this.getCurrentLocation().getCol() + count);
                if (getWorld().getGrid().isValid(move))
                {this.availableMoves.add(move);}
                Location move2 = new Location(this.getCurrentLocation().getRow() - count, this.getCurrentLocation().getCol() - count);
                if (getWorld().getGrid().isValid(move2))
                {this.availableMoves.add(move2);}
                count++;
            }
            int count2 = 1;
            for (int i = 0; i < getWorld().getGrid().getNumCols(); i++)
            {
                Location move = new Location(this.getCurrentLocation().getRow() + count2, this.getCurrentLocation().getCol() + count2);
                if (getWorld().getGrid().isValid(move))
                {this.availableMoves.add(move);}
                Location move2 = new Location(this.getCurrentLocation().getRow() + count2, this.getCurrentLocation().getCol() - count2);
                if (getWorld().getGrid().isValid(move2))
                {this.availableMoves.add(move2);}
                count2++;
            }
        }
        return availableMoves;
    }

}
