package creational.factorymethod.example1;

public class DialogWindows extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
