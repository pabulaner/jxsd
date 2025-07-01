package test.drawingml.main;

public class CTGraphicalObjectModel {
  private final CTGraphicalObjectDataModel graphicData;

  public CTGraphicalObjectModel(CTGraphicalObjectDataModel graphicData) {
    this.graphicData = graphicData;
  }

  public CTGraphicalObjectDataModel getGraphicData() {
    return this.graphicData;
  }
}
