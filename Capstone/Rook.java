import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import java.awt.Color;
import java.util.ArrayList;

/**
 * Write a description of class Rook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rook extends ChessPiece
{
    private ArrayList<Location> availableMoves;
    /**
     * Default constructor for objects of class Pawn
     */
    public Rook(Color color, Location currentLocation, boolean hasMoved, ActorWorld world)
    {
        super(color, currentLocation, hasMoved, world);
        availableMoves = new ArrayList<Location>();
    }

    public ArrayList<Location> getAvailableLocations()
    {
        if (this.getColor().equals(Color.WHITE)) // add exception for obstacle
        {
            this.availableMoves.clear();
            for (int i = 0; i < getWorld().getGrid().getNumRows(); i++)
            {
                Location move = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol());
                if (getWorld().getGrid().isValid(move))
                {this.availableMoves.add(move);}
                Location move2 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol());
                if (getWorld().getGrid().isValid(move2))
                {this.availableMoves.add(move);}
            }
        }
        else if (this.getColor().equals(Color.BLACK))
        {
            this.availableMoves.clear();
            for (int i = 0; i < getWorld().getGrid().getNumCols(); i++)
            {
                Location move = new Location(this.getCurrentLocation().getRow(), this.getCurrentLocation().getCol() - 1);
                if (getWorld().getGrid().isValid(move))
                {this.availableMoves.add(move);}
                Location move2 = new Location(this.getCurrentLocation().getRow(), this.getCurrentLocation().getCol() + 1);
                if (getWorld().getGrid().isValid(move2))
                {this.availableMoves.add(move);}
            }
        }
        return availableMoves;
    }

}
