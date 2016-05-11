import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import java.awt.Color;
import java.util.ArrayList;

/**
 * A chess piece on the board that can move to and capture enemy pieces in locations L-shaped patterns way
 * from its current location
 * 
 * @author @Lim
 * @version 14 April 2016
 */
public class Knight extends ChessPiece
{
    private ArrayList<Location> availableMoves;
    /**
     * Constructs a knight given color, location, and world.
     */
    public Knight(Color color, Location currentLocation, ActorWorld world)
    {
        super(color, currentLocation, world);
        availableMoves = new ArrayList<Location>();
    }
    
    /**
     * Adds locations that the piece can move based on its algorithm to an ArrayList
     */
    public ArrayList<Location> getAvailableLocations()
    {
        if (this.getColor().equals(Color.WHITE)) // add exception for obstacle
        {
            this.availableMoves.clear();
            Location move = new Location(this.getCurrentLocation().getRow() - 2, this.getCurrentLocation().getCol() + 1);
            if (getWorld().getGrid().isValid(move))
            {
                if (getWorld().getGrid().get(move) != null)
                {
                    if (getWorld().getGrid().get(move).getColor().equals(Color.BLACK))
                    {this.availableMoves.add(move);}
                }
                else if (getWorld().getGrid().get(move) == null)
                {
                    this.availableMoves.add(move);
                }
            }
            Location move2 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() + 2);
            if (getWorld().getGrid().isValid(move2))
            {
                if (getWorld().getGrid().get(move2) != null)
                {
                    if (getWorld().getGrid().get(move2).getColor().equals(Color.BLACK))
                    {this.availableMoves.add(move2);}
                }
                else if (getWorld().getGrid().get(move2) == null)
                {
                    this.availableMoves.add(move2);
                }
            }
            Location move3 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() + 2);
            if (getWorld().getGrid().isValid(move3))
            {
                if (getWorld().getGrid().get(move3) != null)
                {
                    if (getWorld().getGrid().get(move3).getColor().equals(Color.BLACK))
                    {this.availableMoves.add(move3);}
                }
                else if (getWorld().getGrid().get(move3) == null)
                {
                    this.availableMoves.add(move3);
                }
            }
            Location move4 = new Location(this.getCurrentLocation().getRow() + 2, this.getCurrentLocation().getCol() + 1);
            if (getWorld().getGrid().isValid(move4))
            {
                if (getWorld().getGrid().get(move4) != null)
                {
                    if (getWorld().getGrid().get(move4).getColor().equals(Color.BLACK))
                    {this.availableMoves.add(move4);}
                }
                else if (getWorld().getGrid().get(move4) == null)
                {
                    this.availableMoves.add(move4);
                }
            }
            Location move5 = new Location(this.getCurrentLocation().getRow() + 2, this.getCurrentLocation().getCol() - 1);
            if (getWorld().getGrid().isValid(move5))
            {
                if (getWorld().getGrid().get(move5) != null)
                {
                    if (getWorld().getGrid().get(move5).getColor().equals(Color.BLACK))
                    {this.availableMoves.add(move5);}
                }
                else if (getWorld().getGrid().get(move5) == null)
                {
                    this.availableMoves.add(move5);
                }
            }
            Location move6 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() - 2);
            if (getWorld().getGrid().isValid(move6))
            {
                if (getWorld().getGrid().get(move6) != null)
                {
                    if (getWorld().getGrid().get(move6).getColor().equals(Color.BLACK))
                    {this.availableMoves.add(move6);}
                }
                else if (getWorld().getGrid().get(move6) == null)
                {
                    this.availableMoves.add(move6);
                }
            }
            Location move7 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() - 2);
            if (getWorld().getGrid().isValid(move7))
            {
                if (getWorld().getGrid().get(move7) != null)
                {
                    if (getWorld().getGrid().get(move7).getColor().equals(Color.BLACK))
                    {this.availableMoves.add(move7);}
                }
                else if (getWorld().getGrid().get(move7) == null)
                {
                    this.availableMoves.add(move7);
                }
            }
            Location move8 = new Location(this.getCurrentLocation().getRow() - 2, this.getCurrentLocation().getCol() - 1);
            if (getWorld().getGrid().isValid(move8))
            {
                if (getWorld().getGrid().get(move8) != null)
                {
                    if (getWorld().getGrid().get(move8).getColor().equals(Color.BLACK))
                    {this.availableMoves.add(move8);}
                }
                else if (getWorld().getGrid().get(move8) == null)
                {
                    this.availableMoves.add(move8);
                }
            }
        }
        else if (this.getColor().equals(Color.BLACK))
        {
            this.availableMoves.clear();
            Location move = new Location(this.getCurrentLocation().getRow() - 2, this.getCurrentLocation().getCol() + 1);
            if (getWorld().getGrid().isValid(move))
            {
                if (getWorld().getGrid().get(move) != null)
                {
                    if (getWorld().getGrid().get(move).getColor().equals(Color.WHITE))
                    {this.availableMoves.add(move);}
                }
                else if (getWorld().getGrid().get(move) == null)
                {
                    this.availableMoves.add(move);
                }
            }
            Location move2 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() + 2);
            if (getWorld().getGrid().isValid(move2))
            {
                if (getWorld().getGrid().get(move2) != null)
                {
                    if (getWorld().getGrid().get(move2).getColor().equals(Color.WHITE))
                    {this.availableMoves.add(move2);}
                }
                else if (getWorld().getGrid().get(move2) == null)
                {
                    this.availableMoves.add(move2);
                }
            }
            Location move3 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() + 2);
            if (getWorld().getGrid().isValid(move3))
            {
                if (getWorld().getGrid().get(move3) != null)
                {
                    if (getWorld().getGrid().get(move3).getColor().equals(Color.WHITE))
                    {this.availableMoves.add(move3);}
                }
                else if (getWorld().getGrid().get(move3) == null)
                {
                    this.availableMoves.add(move3);
                }
            }
            Location move4 = new Location(this.getCurrentLocation().getRow() + 2, this.getCurrentLocation().getCol() + 1);
            if (getWorld().getGrid().isValid(move4))
            {
                if (getWorld().getGrid().get(move4) != null)
                {
                    if (getWorld().getGrid().get(move4).getColor().equals(Color.WHITE))
                    {this.availableMoves.add(move4);}
                }
                else if (getWorld().getGrid().get(move4) == null)
                {
                    this.availableMoves.add(move4);
                }
            }
            Location move5 = new Location(this.getCurrentLocation().getRow() + 2, this.getCurrentLocation().getCol() - 1);
            if (getWorld().getGrid().isValid(move5))
            {
                if (getWorld().getGrid().get(move5) != null)
                {
                    if (getWorld().getGrid().get(move5).getColor().equals(Color.WHITE))
                    {this.availableMoves.add(move5);}
                }
                else if (getWorld().getGrid().get(move5) == null)
                {
                    this.availableMoves.add(move5);
                }
            }
            Location move6 = new Location(this.getCurrentLocation().getRow() + 1, this.getCurrentLocation().getCol() - 2);
            if (getWorld().getGrid().isValid(move6))
            {
                if (getWorld().getGrid().get(move6) != null)
                {
                    if (getWorld().getGrid().get(move6).getColor().equals(Color.WHITE))
                    {this.availableMoves.add(move6);}
                }
                else if (getWorld().getGrid().get(move6) == null)
                {
                    this.availableMoves.add(move6);
                }
            }
            Location move7 = new Location(this.getCurrentLocation().getRow() - 1, this.getCurrentLocation().getCol() - 2);
            if (getWorld().getGrid().isValid(move7))
            {
                if (getWorld().getGrid().get(move7) != null)
                {
                    if (getWorld().getGrid().get(move7).getColor().equals(Color.WHITE))
                    {this.availableMoves.add(move7);}
                }
                else if (getWorld().getGrid().get(move7) == null)
                {
                    this.availableMoves.add(move7);
                }
            }
            Location move8 = new Location(this.getCurrentLocation().getRow() - 2, this.getCurrentLocation().getCol() - 1);
            if (getWorld().getGrid().isValid(move8))
            {
                if (getWorld().getGrid().get(move8) != null)
                {
                    if (getWorld().getGrid().get(move8).getColor().equals(Color.WHITE))
                    {this.availableMoves.add(move8);}
                }
                else if (getWorld().getGrid().get(move8) == null)
                {
                    this.availableMoves.add(move8);
                }
            }
        }
        return availableMoves;
    }

}
