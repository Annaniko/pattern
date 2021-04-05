package examPattern;

public class Main {
    public static void main(String[] args){
        Editor editor = new Editor();

        editor.setBuilder(new ExampleDocument());
        Document document = editor.buildDocument();

        System.out.println(document);

        editor.setBuilder(new AnotherExampleDocument());
        Document document1 = editor.buildDocument();

        System.out.println(document1);
    }
}
