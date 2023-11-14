package moves;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 90);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
        super.applyOppEffects(p);
    }

    @Override
    public String describe() {
        return "атакует ThunderWave!!";
    }
}
