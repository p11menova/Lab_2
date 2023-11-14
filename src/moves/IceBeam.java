package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class IceBeam extends SpecialMove {

    public IceBeam(){
        super(Type.ICE, 90,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){

        if (Math.random() <= 0.3) Effect.freeze(p);
        super.applyOppEffects(p);
    }

    @Override
    public String describe(){
        return "использует спешиал-атаку IceBeam!!";
    }
}
