import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

/**
 * Write a description of class Pawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pawn extends ChessPiece
{
    private boolean hasStarted; //Boolean to tell whether or not a pawn can move up two spaces
    private ArrayList<Location> availableMoves;
    /**
     * Default constructor for objects of class Pawn
     */
    public Pawn(Color color, Location currentLocation, boolean hasMoved)
    {
        super(color, currentLocation, hasMoved);
        availableMoves = new ArrayList<Location>();
    }

    public ArrayList<Location> getAvailableLocations()
    {
        if (hasStarted)
        {
            if (this.getColor().equals(Color.WHITE)) // add exception for obstacle
            {
                this.availableMoves.clear();
                Location move = new Location(this.getCurrentLocation().getCol() + 1, this.getCurrentLocation().getRow());
                this.availableMoves.add(move);
            }
            if (this.getColor().equals(Color.BLACK))
            {
                this.availableMoves.clear();
                Location move = new Location(this.getCurrentLocation().getCol() - 1, this.getCurrentLocation().getRow());
                this.availableMoves.add(move);
            }
        }
        return availableMoves;
    }

}
