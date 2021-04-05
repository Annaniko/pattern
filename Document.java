package examPattern;

public class Document {
   private String heading;
   private String subtitle;
   private String text;

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Document {" + '\n' +
                " heading='" + heading + '\'' +
                ",\n text='" + text + '\'' +
                ",\n subtitle='" + subtitle + '\'' +
                ",\n text='" + text + '\'' + '\n' +
                '}';
    }
}
