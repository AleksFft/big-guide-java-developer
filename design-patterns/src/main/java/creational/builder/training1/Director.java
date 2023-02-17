package creational.builder.training1;

public class Director {
    public void buildShoppingCenter(Builder builder) {
        builder.wallMaterial(WallMaterial.CONCRETE);
        builder.floorsCount(5);
        builder.windowsCount(50);
        builder.location("city center");
    }

    public void buildBathSauna(Builder builder) {
        builder.wallMaterial(WallMaterial.WOOD);
        builder.floorsCount(1);
        builder.windowsCount(3);
        builder.location("on the lake");
    }

    public void buildReception(Builder builder) {
        builder.reception("nice woman");
    }
}
