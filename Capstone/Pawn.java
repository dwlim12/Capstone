import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import java.awt.Color;
import java.util.ArrayList;

/**
 * A chess piece on the board that moves one space forward at a time and can capture enemy pieces
 * by travelling diagonally.
 * 
 * @author @Lim
 * @version 14 April 2016
 */
public class Pawn extends ChessPiece
{
    private boolean hasStarted; // Boolean to tell whether or not a pawn can move up two spaces
    private ArrayList<Location> availableMoves; // ArrayList that contains every pieces available locations to move to
    /**
     * Constructs a pawn given color, location, and world.
     */
    public Pawn(Color color, Location currentLocation, ActorWorld world)
    {
        super(color, currentLocation, world);
        hasStarted = false;
        availableMoves = new ArrayList<Location>();
    }
    
    /**
     * Adds locations that the piece can move based on its algorithm to an ArrayList
     */
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
                Location move2 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol());
                if (getWorld().getGrid().isValid(move2))
                {
                    if (getWorld().getGrid().get(move2) == null)
                    {this.availableMoves.add(move2);}
                }
                Location capture1 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() - 1);
                if (getWorld().getGrid().isValid(capture1))
                {
                    if (getWorld().getGrid().get(capture1) != null)
                    {
                        if (getWorld().getGrid().get(capture1).getColor().equals(Color.BLACK))
                        {this.availableMoves.add(capture1);}
                    }
                }
                Location capture2 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() + 1);
                if (getWorld().getGrid().isValid(capture2))
                {
                    if (getWorld().getGrid().get(capture2) != null)
                    {
                        if (getWorld().getGrid().get(capture2).getColor().equals(Color.BLACK))
                        {this.availableMoves.add(capture2);}
                    }
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
                Location move2 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol());
                if (getWorld().getGrid().isValid(move2))
                {
                    if (getWorld().getGrid().get(move2) == null)
                    {this.availableMoves.add(move2);}
                }
                Location capture1 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() - 1);
                if (getWorld().getGrid().isValid(capture1))
                {
                    if (getWorld().getGrid().get(capture1) != null)
                    {
                        if (getWorld().getGrid().get(capture1).getColor().equals(Color.WHITE))
                        {this.availableMoves.add(capture1);}
                    }
                }
                Location capture2 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() + 1);
                if (getWorld().getGrid().isValid(capture2))
                {
                    if (getWorld().getGrid().get(capture2) != null)
                    {
                        if (getWorld().getGrid().get(capture2).getColor().equals(Color.WHITE))
                        {this.availableMoves.add(capture2);}
                    }
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
                if (getWorld().getGrid().isValid(capture1))
                {
                    if (getWorld().getGrid().get(capture1) != null)
                    {
                        if (getWorld().getGrid().get(capture1).getColor().equals(Color.BLACK))
                        {this.availableMoves.add(capture1);}
                    }
                }
                Location capture2 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() + 1);
                if (getWorld().getGrid().isValid(capture2))
                {
                    if (getWorld().getGrid().get(capture2) != null)
                    {
                        if (getWorld().getGrid().get(capture2).getColor().equals(Color.BLACK))
                        {this.availableMoves.add(capture2);}
                    }
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
                if (getWorld().getGrid().isValid(capture1))
                {
                    if (getWorld().getGrid().get(capture1) != null)
                    {
                        if (getWorld().getGrid().get(capture1).getColor().equals(Color.WHITE))
                        {this.availableMoves.add(capture1);}
                    }
                }
                Location capture2 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() + 1);
                if (getWorld().getGrid().isValid(capture2))
                {
                    if (getWorld().getGrid().get(capture2) != null)
                    {
                        if (getWorld().getGrid().get(capture2).getColor().equals(Color.WHITE))
                        {this.availableMoves.add(capture2);}
                    }
                }
            }

        }
        return availableMoves;
    }

}
