import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
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
    public Pawn(Color color, Location currentLocation, boolean hasMoved, ActorWorld world)
    {
        super(color, currentLocation, hasMoved, world);
        hasStarted = false;
        availableMoves = new ArrayList<Location>();
    }

    public ArrayList<Location> getAvailableLocations()
    {
        if (hasStarted == false)
        {
            if (this.getColor().equals(Color.WHITE)) // add exception for obstacle
            {
                this.availableMoves.clear();
                Location move = new Location(this.getCurrentLocation().getRow() - 2, this.getCurrentLocation().getCol());
                if (getWorld().getGrid().isValid(move))
                {
                    if (getWorld().getGrid().get(move) == null)
                    {this.availableMoves.add(move);}
                }
                Location capture1 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() - 1);
                if (getWorld().getGrid().get(capture1) != null)
                {
                    if (getWorld().getGrid().get(capture1).getColor().equals(Color.BLACK))
                    {this.availableMoves.add(capture1);}
                }
                Location capture2 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() + 1);
                if (getWorld().getGrid().get(capture2) != null)
                {
                    if (getWorld().getGrid().get(capture2).getColor().equals(Color.BLACK))
                    {this.availableMoves.add(capture2);}
                }
            }
            else if (this.getColor().equals(Color.BLACK))
            {
                this.availableMoves.clear();
                Location move = new Location(this.getCurrentLocation().getRow() + 2, this.getCurrentLocation().getCol());
                if (getWorld().getGrid().isValid(move))
                {
                    if (getWorld().getGrid().get(move) == null)
                    {this.availableMoves.add(move);}
                }
                Location capture1 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() - 1);
                if (getWorld().getGrid().get(capture1) != null)
                {
                    if (getWorld().getGrid().get(capture1).getColor().equals(Color.WHITE))
                    {this.availableMoves.add(capture1);}
                }
                Location capture2 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() + 1);
                if (getWorld().getGrid().get(capture2) != null)
                {
                    if (getWorld().getGrid().get(capture2).getColor().equals(Color.WHITE))
                    {this.availableMoves.add(capture2);}
                }
            }
            hasStarted = true;
        }
        else
        {
            if (this.getColor().equals(Color.WHITE)) // add exception for obstacle
            {
                this.availableMoves.clear();
                Location move = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol());
                if (getWorld().getGrid().isValid(move))
                {
                    if (getWorld().getGrid().get(move) == null)
                    {this.availableMoves.add(move);}
                }
                Location capture1 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() - 1);
                if (getWorld().getGrid().get(capture1) != null)
                {
                    if (getWorld().getGrid().get(capture1).getColor().equals(Color.BLACK))
                    {this.availableMoves.add(capture1);}
                }
                Location capture2 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() + 1);
                if (getWorld().getGrid().get(capture2) != null)
                {
                    if (getWorld().getGrid().get(capture2).getColor().equals(Color.BLACK))
                    {this.availableMoves.add(capture2);}
                }
            }
            else if (this.getColor().equals(Color.BLACK))
            {
                this.availableMoves.clear();
                Location move = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol());
                if (getWorld().getGrid().isValid(move))
                {
                    if (getWorld().getGrid().get(move) == null)
                    {this.availableMoves.add(move);}
                }
                Location capture1 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() - 1);
                if (getWorld().getGrid().get(capture1) != null)
                {
                    if (getWorld().getGrid().get(capture1).getColor().equals(Color.WHITE))
                    {this.availableMoves.add(capture1);}
                }
                Location capture2 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() + 1);
                if (getWorld().getGrid().get(capture2) != null)
                {
                    if (getWorld().getGrid().get(capture2).getColor().equals(Color.WHITE))
                    {this.availableMoves.add(capture2);}
                }
            }

        }
        return availableMoves;
    }

}
