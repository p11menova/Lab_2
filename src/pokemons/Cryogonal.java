package pokemons;

import moves.*;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cryogonal extends Pokemon {
    public Cryogonal(String name, int level) {
        super(name, level);
        setType(Type.ICE);
        setStats(80, 50, 50, 95, 135, 105);
        setMove(new IceShard(), new IceBeam(), new FrostBreath(), new Blizzard());

    }
}
