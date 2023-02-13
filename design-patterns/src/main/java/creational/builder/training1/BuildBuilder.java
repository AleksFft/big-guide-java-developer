package creational.builder.training1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BuildBuilder implements Builder {
    private String location;
    private WallMaterial wallMaterial;
    private int windowsCount;
    private int floorsCount;

    public Builder getResult() {
        return new BuildBuilder(location, wallMaterial, windowsCount, floorsCount);
    }

    @Override
    public void location(String location) {
        this.location = location;
    }

    @Override
    public void wallMaterial(WallMaterial material) {
        this.wallMaterial = material;
    }

    @Override
    public void windowsCount(int windows) {
        this.windowsCount = windows;
    }

    @Override
    public void floorsCount(int floors) {
        this.floorsCount = floors;
    }
}
