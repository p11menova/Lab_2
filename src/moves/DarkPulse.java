package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DarkPulse extends SpecialMove {

    public DarkPulse() {
        super(Type.DARK, 80, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon opp, double damage) {
        if (Math.random() <= 0.2) Effect.flinch(opp);
        super.applyOppDamage(opp, damage);
    }

    @Override
    public String describe() {
        return "применяет DarkPulse...7";
    }
}
