import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
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
    private ActorWorld world;
    /**
     * Default constructor for objects of class GamePiece
     */
    public ChessPiece(Color color, Location currentLocation, boolean hasMoved, ActorWorld world)
    {
        this.color = color;
        this.currentLocation = currentLocation;
        this.hasMoved = hasMoved;
        this.world = world;
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    public Location getCurrentLocation()
    {
        return this.currentLocation;
    }
    
    public ActorWorld getWorld()
    {
        return this.world;
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
        ArrayList<Location> availableMoves = getAvailableLocations();
        for (int i = 0; i < availableMoves.size(); i++)
        {
            if (availableMoves.get(i).equals(loc))
            {
                world.remove(currentLocation);
                Actor other = world.getGrid().get(loc);
                if (other != null)
                    {other.removeSelfFromGrid();}
                currentLocation = loc;
                world.add(loc, this);
            }
        }
    }
}
