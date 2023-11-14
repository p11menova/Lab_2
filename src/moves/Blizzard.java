package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends PhysicalMove {

    public Blizzard() {
        super(Type.GRASS, 90, 10);
    }

    @Override
    public String describe() {
        return "юзает Blizzard...";
    }
}
