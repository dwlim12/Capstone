import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import java.awt.Color;
import java.util.ArrayList;

/**
 * Write a description of class King here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class King extends ChessPiece
{
    private ArrayList<Location> availableMoves;
    /**
     * Default constructor for objects of class King
     */
    public King(Color color, Location currentLocation, boolean hasMoved, ActorWorld world)
    {
        super(color, currentLocation, hasMoved, world);
        availableMoves = new ArrayList<Location>();
    }

    public ArrayList<Location> getAvailableLocations()
    {
        if (this.getColor().equals(Color.WHITE)) // add exception for obstacle
        {
            this.availableMoves.clear();
            Location move = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol());
            if (getWorld().getGrid().isValid(move))
                {this.availableMoves.add(move);}
            Location move2 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() + 1);
            if (getWorld().getGrid().isValid(move2))
                {this.availableMoves.add(move2);}
            Location move3 = new Location(this.getCurrentLocation().getRow(), this.getCurrentLocation().getCol() + 1);
            if (getWorld().getGrid().isValid(move3))
                {this.availableMoves.add(move3);}
            Location move4 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() + 1);
            if (getWorld().getGrid().isValid(move4))
                {this.availableMoves.add(move4);}
            Location move5 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol());
            if (getWorld().getGrid().isValid(move5))
                {this.availableMoves.add(move5);}
            Location move6 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() - 1);
            if (getWorld().getGrid().isValid(move6))
                {this.availableMoves.add(move6);}
            Location move7 = new Location(this.getCurrentLocation().getRow(), this.getCurrentLocation().getCol() - 1);
            if (getWorld().getGrid().isValid(move7))
                {this.availableMoves.add(move7);}
            Location move8 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() - 1);
            if (getWorld().getGrid().isValid(move8))
                {this.availableMoves.add(move8);}
        }
        else if (this.getColor().equals(Color.BLACK))
        {
            this.availableMoves.clear();
            Location move = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol());
            if (getWorld().getGrid().isValid(move))
                {this.availableMoves.add(move);}
            Location move2 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() + 1);
            if (getWorld().getGrid().isValid(move2))
                {this.availableMoves.add(move2);}
            Location move3 = new Location(this.getCurrentLocation().getRow(), this.getCurrentLocation().getCol() + 1);
            if (getWorld().getGrid().isValid(move3))
                {this.availableMoves.add(move3);}
            Location move4 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() + 1);
            if (getWorld().getGrid().isValid(move4))
                {this.availableMoves.add(move4);}
            Location move5 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol());
            if (getWorld().getGrid().isValid(move5))
                {this.availableMoves.add(move5);}
            Location move6 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() - 1);
            if (getWorld().getGrid().isValid(move6))
                {this.availableMoves.add(move6);}
            Location move7 = new Location(this.getCurrentLocation().getRow(), this.getCurrentLocation().getCol() - 1);
            if (getWorld().getGrid().isValid(move7))
                {this.availableMoves.add(move7);}
            Location move8 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() - 1);
            if (getWorld().getGrid().isValid(move8))
                {this.availableMoves.add(move8);}
        }
        return availableMoves;
    }

}
