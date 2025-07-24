package com.scell.model.drawingml.main;

public class NonVisualGraphicFramePropertiesModel {
  private final GraphicalObjectFrameLockingModel graphicFrameLocks;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualGraphicFramePropertiesModel(GraphicalObjectFrameLockingModel graphicFrameLocks,
      OfficeArtExtensionListModel extLst) {
    this.graphicFrameLocks = graphicFrameLocks;
    this.extLst = extLst;
  }

  public GraphicalObjectFrameLockingModel getGraphicFrameLocks() {
    return this.graphicFrameLocks;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
