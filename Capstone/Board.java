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
     * @post    all chess pieces are added to the grid
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
        Rook rook1 = new Rook(Color.BLACK, loc1, world);
        world.add(loc1, rook1);
        
        Location loc2 = new Location(Y2, X2);
        Knight knight1 = new Knight(Color.BLACK, loc2, world);
        world.add(loc2, knight1);
        
        Location loc3 = new Location(Y3, X3);
        Bishop bishop1 = new Bishop(Color.BLACK, loc3, world);
        world.add(loc3, bishop1);
        
        Location loc4 = new Location(Y4, X4);
        Queen queen1 = new Queen(Color.BLACK, loc4, world);
        world.add(loc4, queen1);
        
        Location loc5 = new Location(Y5, X5);
        King king1 = new King(Color.BLACK, loc5, world);
        world.add(loc5, king1);
        
        Location loc6 = new Location(Y6, X6);
        Bishop bishop2 = new Bishop(Color.BLACK, loc6, world);
        world.add(loc6, bishop2);
        
        Location loc7 = new Location(Y7, X7);
        Knight knight2 = new Knight(Color.BLACK, loc7, world);
        world.add(loc7, knight2);
        
        Location loc8 = new Location(Y8, X8);
        Rook rook2 = new Rook(Color.BLACK, loc8, world);
        world.add(loc8, rook2);
        
        Location loc9 = new Location(Y9, X9);
        Pawn pawn1 = new Pawn(Color.BLACK, loc9, world);
        world.add(loc9, pawn1);
        
        Location loc10 = new Location(Y10, X10);
        Pawn pawn2 = new Pawn(Color.BLACK, loc10, world);
        world.add(loc10, pawn2);
        
        Location loc11 = new Location(Y11, X11);
        Pawn pawn3 = new Pawn(Color.BLACK, loc11, world);
        world.add(loc11, pawn3);
        
        Location loc12 = new Location(Y12, X12);
        Pawn pawn4 = new Pawn(Color.BLACK, loc12, world);
        world.add(loc12, pawn4);
        
        Location loc13 = new Location(Y13, X13);
        Pawn pawn5 = new Pawn(Color.BLACK, loc13, world);
        world.add(loc13, pawn5);
        
        Location loc14 = new Location(Y14, X14);
        Pawn pawn6 = new Pawn(Color.BLACK, loc14, world);
        world.add(loc14, pawn6);
        
        Location loc15 = new Location(Y15, X15);
        Pawn pawn7 = new Pawn(Color.BLACK, loc15, world);
        world.add(loc15, pawn7);
        
        Location loc16 = new Location(Y16, X16);
        Pawn pawn8 = new Pawn(Color.BLACK, loc16, world);
        world.add(loc16, pawn8);
        
        Location loc17 = new Location(Y17, X17);
        Pawn pawn9 = new Pawn(Color.WHITE, loc17, world);
        world.add(loc17, pawn9);
        
        Location loc18 = new Location(Y18, X18);
        Pawn pawn10 = new Pawn(Color.WHITE, loc18, world);
        world.add(loc18, pawn10);
        
        Location loc19 = new Location(Y19, X19);
        Pawn pawn11 = new Pawn(Color.WHITE, loc19, world);
        world.add(loc19, pawn11);
        
        Location loc20 = new Location(Y20, X20);
        Pawn pawn12 = new Pawn(Color.WHITE, loc20, world);
        world.add(loc20, pawn12);
        
        Location loc21 = new Location(Y21, X21);
        Pawn pawn13 = new Pawn(Color.WHITE, loc21, world);
        world.add(loc21, pawn13);
        
        Location loc22 = new Location(Y22, X22);
        Pawn pawn14 = new Pawn(Color.WHITE, loc22, world);
        world.add(loc22, pawn14);
        
        Location loc23 = new Location(Y23, X23);
        Pawn pawn15 = new Pawn(Color.WHITE, loc23, world);
        world.add(loc23, pawn15);
        
        Location loc24 = new Location(Y24, X24);
        Pawn pawn16 = new Pawn(Color.WHITE, loc24, world);
        world.add(loc24, pawn16);
        
        Location loc25 = new Location(Y25, X25);
        Rook rook3 = new Rook(Color.WHITE, loc25, world);
        world.add(loc25, rook3);
        
        Location loc26 = new Location(Y26, X26);
        Knight knight3 = new Knight(Color.WHITE, loc26, world);
        world.add(loc26, knight3);
        
        Location loc27 = new Location(Y27, X27);
        Bishop bishop3 = new Bishop(Color.WHITE, loc27, world);
        world.add(loc27, bishop3);
        
        Location loc28 = new Location(Y28, X28);
        Queen queen2 = new Queen(Color.WHITE, loc28, world);
        world.add(loc28, queen2);
        
        Location loc29 = new Location(Y29, X29);
        King king2 = new King(Color.WHITE, loc29, world);
        world.add(loc29, king2);
        
        Location loc30 = new Location(Y30, X30);
        Bishop bishop4 = new Bishop(Color.WHITE, loc30, world);
        world.add(loc30, bishop4);
        
        Location loc31 = new Location(Y31, X31);
        Knight knight4 = new Knight(Color.WHITE, loc31, world);
        world.add(loc31, knight4);
        
        Location loc32 = new Location(Y32, X32);
        Rook rook4 = new Rook(Color.WHITE, loc32, world);
        world.add(loc32, rook4);
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
    }
}
