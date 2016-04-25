import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
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
     * Default constructor for objects of class Rook
     */
    public Rook(Color color, Location currentLocation, boolean hasMoved)
    {
        super(color, currentLocation, hasMoved);
        availableMoves = new ArrayList<Location>();
    }

    public ArrayList<Location> getAvailableLocations()
    {
        if (this.getColor().equals(Color.WHITE)) // add exception for obstacle
        {
            this.availableMoves.clear();
            // change Location move = new Location(this.getCurrentLocation().getCol() + 1, this.getCurrentLocation().getRow());
            this.availableMoves.add(move);
        }
        if (this.getColor().equals(Color.BLACK))
        {
            this.availableMoves.clear();
            // change Location move = new Location(this.getCurrentLocation().getCol() - 1, this.getCurrentLocation().getRow());
            this.availableMoves.add(move);
        }
        return availableMoves;
    }

}
