
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_StrRefModel;
import test.ooxml.drawingml.main.CT_TextBodyModel;


public class CT_TxModel {

public class StrRefOrrichModel {


    private final Object value;

    public StrRefOrrichModel(CT_StrRefModel value) {
        this.value = value;
    }
    public StrRefOrrichModel(CT_TextBodyModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_StrRefModel getStrRef() {
        return (CT_StrRefModel) value;
    }
    public CT_TextBodyModel getRich() {
        return (CT_TextBodyModel) value;
    }
}

    private final StrRefOrrichModel strRefOrrich;

    public CT_TxModel(StrRefOrrichModel strRefOrrich) {
        this.strRefOrrich = strRefOrrich;
    }

    public StrRefOrrichModel getStrRefOrrich() {
        return this.strRefOrrich;
    }
}
