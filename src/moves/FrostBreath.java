package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FrostBreath extends SpecialMove {
    public FrostBreath() {
        super(Type.ICE, 60, 90);

    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        super.calcCriticalHit(att, def);
        if (Math.random() <= 0.4) {
            System.out.println("критический удар!");
            return 1.5;
        }
        return 1;
    }

    @Override
    public String describe() {
        return "замораживает FrostBreath'ом!1";
    }
}
