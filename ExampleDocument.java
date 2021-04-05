package examPattern;

public class ExampleDocument extends DocumentBuilder {
    @Override
    void buildHeading() {
        document.setHeading("This is zagolovok");
    }

    @Override
    void buildSubtitle() {
        document.setSubtitle("This is podzagolovok");
    }

    @Override
    void buildText() {
        document.setText("This is text");
    }
}
