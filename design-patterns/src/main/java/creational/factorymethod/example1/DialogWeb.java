package creational.factorymethod.example1;

public class DialogWeb extends Dialog {
    @Override
    public Button createButton() {
        return new WebButton();
    }
}
