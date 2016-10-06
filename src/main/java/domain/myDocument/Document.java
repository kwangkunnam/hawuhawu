package domain.myDocument;

import java.lang.reflect.Type;
/**
 * Created by gnan on 10/6/16.
 */

public class Document {

    private String name;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    private Type type;

    private String location;
}
