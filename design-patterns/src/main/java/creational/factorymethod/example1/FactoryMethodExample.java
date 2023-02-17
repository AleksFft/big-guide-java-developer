package creational.factorymethod.example1;

public class FactoryMethodExample {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new DialogWindows();
        } else {
            dialog = new DialogWeb();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}

