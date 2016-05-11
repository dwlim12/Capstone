import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;
/**
 * An actor on the game board grid that moves and takes pieces based on type of piece and color
 * 
 * @author @Lim
 * @version 14 April 2016
 */
public abstract class ChessPiece extends Actor
{
    private Color color;
    private Location currentLocation;
    private ActorWorld world;
    /**
     * Creates a chess piece of specified color in the location on the grid in a world
     */
    public ChessPiece(Color color, Location currentLocation, ActorWorld world)
    {
        super();
        this.color = color;
        this.currentLocation = currentLocation;
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
     * Takes a location in the world and moves the piece there if it is in the ArrayList of
     * available locations for the piece
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
