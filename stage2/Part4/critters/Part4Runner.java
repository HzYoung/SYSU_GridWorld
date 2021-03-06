import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.gui.*;
import info.gridworld.world.*;

import java.awt.Color;

public final class Part4Runner
{
    private Part4Runner() {}

    public static void main(String[] args) {
       ActorWorld world = new ActorWorld();
       world.addOccupantClass("ChameleonCritter");
       world.addOccupantClass("CrabCritter");
       world.addOccupantClass("MChameleonCritter");
       world.addOccupantClass("ChameleonKid");
       world.addOccupantClass("RockHound");
       world.addOccupantClass("BlusterCritter");
       world.addOccupantClass("QuickCrab");
       world.addOccupantClass("KingCrab");
       //world.add(new Location(3, 3), new Critter());
       world.add(new Location(2, 8), new Bug(Color.BLUE));
       world.add(new Location(5, 5), new Rock(Color.PINK));
      // world.add(new Location(1, 5), new Rock(Color.RED));
      // world.add(new Location(7, 2), new Rock(Color.YELLOW));
      // world.add(new Location(4, 4), new ChameleonCritter());
       world.show();
    }
}
