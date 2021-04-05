package examPattern;

public class AnotherExampleDocument extends DocumentBuilder{
    @Override
    void buildHeading() {
        document.setHeading("This is  another zagolovok");
    }

    @Override
    void buildSubtitle() {
        document.setSubtitle("This is another podzagolovok");
    }

    @Override
    void buildText() {
        document.setText("This is another text");
    }
}
