package pokemons;

import moves.Blizzard;
import moves.IceFang;
import moves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Snorunt extends Pokemon {
    public Snorunt(String name, int level) {
        super(name, level);
        setType(Type.ICE);
        setStats(50, 50, 50, 50, 50, 50);
        setMove(new Blizzard(), new IceFang(), new Rest());
    }
}
