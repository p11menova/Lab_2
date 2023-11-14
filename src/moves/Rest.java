package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest() {
        super(Type.PSYCHIC, 0, 0);

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect.sleep(p);
        Effect e = new Effect().stat(Stat.HP, 100);
        p.addEffect(e);
        super.applySelfEffects(p);

    }

    @Override
    public String describe() {
        return "отдыхает и восполняет здоровье!!:)";
    }
}
