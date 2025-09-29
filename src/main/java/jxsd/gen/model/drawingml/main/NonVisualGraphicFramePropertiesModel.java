package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.NonVisualGraphicFramePropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class NonVisualGraphicFramePropertiesModel {
  private final GraphicalObjectFrameLockingModel graphicFrameLocks;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualGraphicFramePropertiesModel(GraphicalObjectFrameLockingModel graphicFrameLocks,
      OfficeArtExtensionListModel extLst) {
    this.graphicFrameLocks = graphicFrameLocks;
    this.extLst = extLst;
  }

  public NonVisualGraphicFramePropertiesBuilder builder() {
    return new NonVisualGraphicFramePropertiesBuilder().from(this);
  }

  public GraphicalObjectFrameLockingModel getGraphicFrameLocks() {
    return this.graphicFrameLocks;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
