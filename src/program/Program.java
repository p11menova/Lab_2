package program;

import ru.ifmo.se.pokemon.*;
import pokemons.*;


public class Program {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon cryo = new Cryogonal("катя пим", 1);
        Pokemon ty = new Tynamo("гришаня", 1);
        Pokemon glal = new Glalie("денчик", 1);

        Pokemon snor = new Snorunt("алена", 1);
        Pokemon eele = new Eelektrik("по ля", 1);
        Pokemon tross = new Eelektross("антонио", 1);

        b.addAlly(cryo);
        b.addAlly(ty);
        b.addAlly(glal);

        b.addFoe(tross);
        b.addFoe(eele);
        b.addFoe(snor);

        b.go();

    }
}
