package structural.adapter.example2;

public class ChiefAdapter2 implements Chief {
    private Plumber plumber = new Plumber();

    @Override
    public Object makeBreakfast() {
        return plumber.getScrewNut();
    }

    @Override
    public Object makeLunch() {
        return plumber.getGasket();
    }

    @Override
    public Object makeDinner() {
        return plumber.getPipe();
    }
}
