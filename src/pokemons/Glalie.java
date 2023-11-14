package pokemons;

import moves.DarkPulse;
import ru.ifmo.se.pokemon.Type;

public class Glalie extends Snorunt {

    public Glalie(String name, int level) {
        super(name, level);
        setType(Type.ICE);
        setStats(80, 80, 80, 80, 80, 80);
        addMove(new DarkPulse());
    }
}
