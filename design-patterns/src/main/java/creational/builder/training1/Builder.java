package creational.builder.training1;

public interface Builder {
    void location(String location);
    void wallMaterial(WallMaterial material);
    void windowsCount(int windows);
    void floorsCount(int floors);
    void reception(String reception);
    Builder getResult();
}
