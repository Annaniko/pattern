package examPattern;

public class Editor {
    DocumentBuilder builder;

    public void setBuilder(DocumentBuilder builder) {
        this.builder = builder;
    }

    Document buildDocument(){
        builder.createDocument();
        builder.buildHeading();
        builder.buildSubtitle();
        builder.buildText();

        Document document = builder.getDocument();

        return document;
    }
}
