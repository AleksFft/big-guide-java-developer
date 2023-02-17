package creational.abstractfactory.example1;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        try {
            configureApplication().paint();
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    private static Application configureApplication() {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else if (osName.contains("win")) {
            factory = new MacOSFactory();
        } else {
            throw new RuntimeException("can not identify OS");
        }
        return new Application(factory);
    }
}
