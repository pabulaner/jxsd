
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_MultiLvlStrRefModel;
import test.ooxml.drawingml.chart.CT_NumRefModel;
import test.ooxml.drawingml.chart.CT_NumDataModel;
import test.ooxml.drawingml.chart.CT_StrRefModel;
import test.ooxml.drawingml.chart.CT_StrDataModel;


public class CT_AxDataSourceModel {

public class MultiLvlStrRefOrnumRefOrnumLitModel {


    private final Object value;

    public MultiLvlStrRefOrnumRefOrnumLitModel(CT_MultiLvlStrRefModel value) {
        this.value = value;
    }
    public MultiLvlStrRefOrnumRefOrnumLitModel(CT_NumRefModel value) {
        this.value = value;
    }
    public MultiLvlStrRefOrnumRefOrnumLitModel(CT_NumDataModel value) {
        this.value = value;
    }
    public MultiLvlStrRefOrnumRefOrnumLitModel(CT_StrRefModel value) {
        this.value = value;
    }
    public MultiLvlStrRefOrnumRefOrnumLitModel(CT_StrDataModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_MultiLvlStrRefModel getMultiLvlStrRef() {
        return (CT_MultiLvlStrRefModel) value;
    }
    public CT_NumRefModel getNumRef() {
        return (CT_NumRefModel) value;
    }
    public CT_NumDataModel getNumLit() {
        return (CT_NumDataModel) value;
    }
    public CT_StrRefModel getStrRef() {
        return (CT_StrRefModel) value;
    }
    public CT_StrDataModel getStrLit() {
        return (CT_StrDataModel) value;
    }
}

    private final MultiLvlStrRefOrnumRefOrnumLitModel multiLvlStrRefOrnumRefOrnumLit;

    public CT_AxDataSourceModel(MultiLvlStrRefOrnumRefOrnumLitModel multiLvlStrRefOrnumRefOrnumLit) {
        this.multiLvlStrRefOrnumRefOrnumLit = multiLvlStrRefOrnumRefOrnumLit;
    }

    public MultiLvlStrRefOrnumRefOrnumLitModel getMultiLvlStrRefOrnumRefOrnumLit() {
        return this.multiLvlStrRefOrnumRefOrnumLit;
    }
}
