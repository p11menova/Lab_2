package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;

public class IceFang extends PhysicalMove {

    public IceFang(){
        super(Type.ICE, 65,95);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1) Effect.freeze(p);
        if (Math.random() <= 0.1) Effect.flinch(p);
        super.applyOppEffects(p);
    }

    @Override
    public String describe(){
        return "баам! атакует IceFang!";
    }
}
