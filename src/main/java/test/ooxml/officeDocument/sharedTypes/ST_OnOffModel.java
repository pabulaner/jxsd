
package test.ooxml.officeDocument.sharedTypes;



public class ST_OnOffModel {

    private final Object value;

    public ST_OnOffModel(test._2001.XMLSchema.BooleanModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test._2001.XMLSchema.BooleanModel getBoolean() {
        return (test._2001.XMLSchema.BooleanModel) this.value;
    }
}