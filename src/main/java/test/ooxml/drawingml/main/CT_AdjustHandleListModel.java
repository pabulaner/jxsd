
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_XYAdjustHandleModel;
import test.ooxml.drawingml.main.CT_PolarAdjustHandleModel;


public class CT_AdjustHandleListModel {

public class AhXYOrahPolarModel {


    private final Object value;

    public AhXYOrahPolarModel(CT_XYAdjustHandleModel value) {
        this.value = value;
    }
    public AhXYOrahPolarModel(CT_PolarAdjustHandleModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_XYAdjustHandleModel getAhXY() {
        return (CT_XYAdjustHandleModel) value;
    }
    public CT_PolarAdjustHandleModel getAhPolar() {
        return (CT_PolarAdjustHandleModel) value;
    }
}

    private final AhXYOrahPolarModel ahXYOrahPolar;

    public CT_AdjustHandleListModel(AhXYOrahPolarModel ahXYOrahPolar) {
        this.ahXYOrahPolar = ahXYOrahPolar;
    }

    public AhXYOrahPolarModel getAhXYOrahPolar() {
        return this.ahXYOrahPolar;
    }
}
