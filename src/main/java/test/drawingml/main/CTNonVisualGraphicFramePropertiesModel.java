package test.drawingml.main;

public class CTNonVisualGraphicFramePropertiesModel {
  private final CTGraphicalObjectFrameLockingModel graphicFrameLocks;

  private final CTOfficeArtExtensionListModel extLst;

  public CTNonVisualGraphicFramePropertiesModel(
      CTGraphicalObjectFrameLockingModel graphicFrameLocks, CTOfficeArtExtensionListModel extLst) {
    this.graphicFrameLocks = graphicFrameLocks;
    this.extLst = extLst;
  }

  public CTGraphicalObjectFrameLockingModel getGraphicFrameLocks() {
    return this.graphicFrameLocks;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
