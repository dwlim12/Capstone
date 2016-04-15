import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.awt.Color;

/**
 * Write a description of class Pawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pawn extends ChessPiece
{
    private boolean hasMoved;

    /**
     * Default constructor for objects of class Pawn
     */
    public Pawn(Color color)
    {
        super(color);
    }

    public abstract Location[] getAvailableLocations()
    {
        
    }

}
