import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;
/**
 * A grid used to place chess pieces in and move pieces
 * 
 * @author @Lim
 * @version 14 April 2016
 */
public class Board
{
    private ActorWorld world;
    private BoundedGrid<Actor> grid;
    private final int ROWS = 8;
    private final int COLS = 8;
    public Board()
    {
        grid = new BoundedGrid<Actor>(ROWS,COLS);
        world = new ActorWorld(grid);
        addPieces();
        world.show();
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void addPieces()
    {
        final int Y1 = 0, X1 = 0;
        final int Y2 = 0, X2 = 1;
        final int Y3 = 0, X3 = 2;
        final int Y4 = 0, X4 = 3;
        final int Y5 = 0, X5 = 4;
        final int Y6 = 0, X6 = 5;
        final int Y7 = 0, X7 = 6;
        final int Y8 = 0, X8 = 7;
        final int Y9 = 1, X9 = 0;
        final int Y10 = 1, X10 = 1;
        final int Y11 = 1, X11 = 2;
        final int Y12 = 1, X12 = 3;
        final int Y13 = 1, X13 = 4;
        final int Y14 = 1, X14 = 5;
        final int Y15 = 1, X15 = 6;
        final int Y16 = 1, X16 = 7;
        final int Y17 = 6, X17 = 0;
        final int Y18 = 6, X18 = 1;
        final int Y19 = 6, X19 = 2;
        final int Y20 = 6, X20 = 3;
        final int Y21 = 6, X21 = 4;
        final int Y22 = 6, X22 = 5;
        final int Y23 = 6, X23 = 6;
        final int Y24 = 6, X24 = 7;
        final int Y25 = 7, X25 = 0;
        final int Y26 = 7, X26 = 1;
        final int Y27 = 7, X27 = 2;
        final int Y28 = 7, X28 = 3;
        final int Y29 = 7, X29 = 4;
        final int Y30 = 7, X30 = 5;
        final int Y31 = 7, X31 = 6;
        final int Y32 = 7, X32 = 7;
        
        Grid<Actor> grid = world.getGrid();
        
        Location loc1 = new Location(Y1, X1);
        Rook rook1 = new Rook(Color.BLACK, loc1, false, world);
        world.add(loc1, rook1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(Y2, X2);
        world.add(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(Y3, X3);
        world.add(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(Y4, X4);
        world.add(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(Y5, X5);
        world.add(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(Y6, X6);
        world.add(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(Y7, X7);
        world.add(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(Y8, X8);
        world.add(loc8, rock8);
        
        Location loc9 = new Location(Y9, X9);
        Pawn pawn1 = new Pawn(Color.BLACK, loc9, false, world);
        world.add(loc9, pawn1);
        
        Location loc10 = new Location(Y10, X10);
        Pawn pawn2 = new Pawn(Color.BLACK, loc10, false, world);
        world.add(loc10, pawn2);
        
        Location loc11 = new Location(Y11, X11);
        Pawn pawn3 = new Pawn(Color.BLACK, loc11, false, world);
        world.add(loc11, pawn3);
        
        Location loc12 = new Location(Y12, X12);
        Pawn pawn4 = new Pawn(Color.BLACK, loc12, false, world);
        world.add(loc12, pawn4);
        
        Location loc13 = new Location(Y13, X13);
        Pawn pawn5 = new Pawn(Color.BLACK, loc13, false, world);
        world.add(loc13, pawn5);
        
        Location loc14 = new Location(Y14, X14);
        Pawn pawn6 = new Pawn(Color.BLACK, loc14, false, world);
        world.add(loc14, pawn6);
        
        Location loc15 = new Location(Y15, X15);
        Pawn pawn7 = new Pawn(Color.BLACK, loc15, false, world);
        world.add(loc15, pawn7);
        
        Location loc16 = new Location(Y16, X16);
        Pawn pawn8 = new Pawn(Color.BLACK, loc16, false, world);
        world.add(loc16, pawn8);
        
        Location loc17 = new Location(Y17, X17);
        Pawn pawn9 = new Pawn(Color.WHITE, loc17, false, world);
        world.add(loc17, pawn9);
        
        Rock rock18 = new Rock();
        Location loc18 = new Location(Y18, X18);
        world.add(loc18, rock18);
        rock18.setColor(Color.WHITE);
        
        Rock rock19 = new Rock();
        Location loc19 = new Location(Y19, X19);
        world.add(loc19, rock19);
        rock19.setColor(Color.WHITE);
        
        Rock rock20 = new Rock();
        Location loc20 = new Location(Y20, X20);
        world.add(loc20, rock20);
        rock20.setColor(Color.WHITE);
        
        Rock rock21 = new Rock();
        Location loc21 = new Location(Y21, X21);
        world.add(loc21, rock21);
        rock21.setColor(Color.WHITE);
        
        Rock rock22 = new Rock();
        Location loc22 = new Location(Y22, X22);
        world.add(loc22, rock22);
        rock22.setColor(Color.WHITE);
        
        Rock rock23 = new Rock();
        Location loc23 = new Location(Y23, X23);
        world.add(loc23, rock23);
        rock23.setColor(Color.WHITE);
        
        Rock rock24 = new Rock();
        Location loc24 = new Location(Y24, X24);
        world.add(loc24, rock24);
        rock24.setColor(Color.WHITE);
        
        Rock rock25 = new Rock();
        Location loc25 = new Location(Y25, X25);
        world.add(loc25, rock25);
        rock25.setColor(Color.WHITE);
        
        Rock rock26 = new Rock();
        Location loc26 = new Location(Y26, X26);
        world.add(loc26, rock26);
        rock26.setColor(Color.WHITE);
        
        Rock rock27 = new Rock();
        Location loc27 = new Location(Y27, X27);
        world.add(loc27, rock27);
        rock27.setColor(Color.WHITE);
        
        Rock rock28 = new Rock();
        Location loc28 = new Location(Y28, X28);
        world.add(loc28, rock28);
        rock28.setColor(Color.WHITE);
        
        Rock rock29 = new Rock();
        Location loc29 = new Location(Y29, X29);
        world.add(loc29, rock29);
        rock29.setColor(Color.WHITE);
        
        Rock rock30 = new Rock();
        Location loc30 = new Location(Y30, X30);
        world.add(loc30, rock30);
        rock30.setColor(Color.WHITE);
        
        Rock rock31 = new Rock();
        Location loc31 = new Location(Y31, X31);
        world.add(loc31, rock31);
        rock31.setColor(Color.WHITE);
        
        Rock rock32 = new Rock();
        Location loc32 = new Location(Y32, X32);
        world.add(loc32, rock32);
        rock32.setColor(Color.WHITE);
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }
    
    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
            throws InterruptedException
    {
        Board game = new Board();
//         int i = 1;
//         while (i == 1)
//         {
//             game.createNextGeneration();
//             Thread.sleep(1000);
//         }
    }
}
