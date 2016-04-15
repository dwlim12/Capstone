import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.awt.Color;
/**
 * Write a description of abstract class GamePiece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ChessPiece extends Actor
{
    private Color color;
    private Location[] availableMoves;
    /**
     * Default constructor for objects of class GamePiece
     */
    public ChessPiece(Color color)
    {
        this.color = color;
    }
    
    public abstract Location[] getAvailableLocations();
    
    
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
        for (Location location : availableMoves)
        {
            if (location.equals(loc))
            {
                this.moveTo(loc);
            }
        }
    }
}
