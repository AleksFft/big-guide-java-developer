package structural.adapter.example1;

public class AdapterDemo {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5.0);
        RoundPeg roundPeg = new RoundPeg(5.0);

        if (roundHole.fits(roundPeg)) {
            System.out.printf("Round peg r%f fits round hole r%f\n", roundPeg.getRadius(), roundHole.getRadius());
        }

        SquarePeg smallSquarePeg = new SquarePeg(2.0);
        SquarePeg bigSquarePeg = new SquarePeg(20.0);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter bigSqPegAdapter = new SquarePegAdapter(bigSquarePeg);

        if (roundHole.fits(smallSqPegAdapter)) {
            System.out.printf("Square peg w%f fits round hole r%f\n", smallSquarePeg.getWidth(), roundHole.getRadius());
        }
        if (roundHole.fits(bigSqPegAdapter)) {
            System.out.printf("Square peg w%f fits round hole r%f\n", bigSquarePeg.getWidth(), roundHole.getRadius());
        } else {
            System.out.printf("Square peg w%f not fits round hole r%f\n", bigSquarePeg.getWidth(), roundHole.getRadius());
        }
    }
}
