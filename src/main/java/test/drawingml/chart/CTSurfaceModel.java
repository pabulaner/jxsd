package test.drawingml.chart;

import test.drawingml.main.CTShapePropertiesModel;

public class CTSurfaceModel {
  private final CTUnsignedIntModel thickness;

  private final CTShapePropertiesModel spPr;

  private final CTPictureOptionsModel pictureOptions;

  private final CTExtensionListModel extLst;

  public CTSurfaceModel(CTUnsignedIntModel thickness, CTShapePropertiesModel spPr,
      CTPictureOptionsModel pictureOptions, CTExtensionListModel extLst) {
    this.thickness = thickness;
    this.spPr = spPr;
    this.pictureOptions = pictureOptions;
    this.extLst = extLst;
  }

  public CTUnsignedIntModel getThickness() {
    return this.thickness;
  }

  public CTShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CTPictureOptionsModel getPictureOptions() {
    return this.pictureOptions;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
