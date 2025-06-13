


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

    private final List<AhXYOrahPolarModel> ahXYOrahPolar;

    public CT_AdjustHandleListModel(List<AhXYOrahPolarModel> ahXYOrahPolar ) {
        this.ahXYOrahPolar = ahXYOrahPolar;
    }

    public List<AhXYOrahPolarModel> getAhXYOrahPolar() {
        return this.ahXYOrahPolar;
    }
}