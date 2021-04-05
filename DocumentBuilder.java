package examPattern;

public abstract class DocumentBuilder {
    Document document;

    void createDocument(){
        document = new Document();
    }

    abstract void buildHeading();
    abstract void buildSubtitle();
    abstract void buildText();

    Document getDocument(){
        return document;
    }
}
