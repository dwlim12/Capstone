import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;
/**
 * Write a description of abstract class GamePiece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ChessPiece extends Actor
{
    private Color color;
    private Location currentLocation;
    private boolean hasMoved;
    private ArrayList<Location> availableMoves;
    /**
     * Default constructor for objects of class GamePiece
     */
    public ChessPiece(Color color, Location currentLocation, boolean hasMoved)
    {
        this.color = color;
        this.currentLocation = currentLocation;
        this.hasMoved = hasMoved;
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    public Location getCurrentLocation()
    {
        return this.currentLocation;
    }
    
    public abstract ArrayList<Location> getAvailableLocations();
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void move(Location loc)
    {
        for (int i = 0; i < availableMoves.size(); i++)
        {
            if (availableMoves.get(i).equals(loc))
            {
                this.moveTo(loc);
            }
        }
    }
}
