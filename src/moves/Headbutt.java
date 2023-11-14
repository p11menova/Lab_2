package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Headbutt extends PhysicalMove {

    public Headbutt(){
        super(Type.NORMAL, 70, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3) Effect.flinch(p);
        super.applyOppEffects(p);
    }

    @Override
    public String describe(){
        return "атакует Headbutt'oм!!";
    }
}
