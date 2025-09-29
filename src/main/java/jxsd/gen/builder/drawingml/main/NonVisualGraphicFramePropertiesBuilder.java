package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.GraphicalObjectFrameLockingModel;
import jxsd.gen.model.drawingml.main.NonVisualGraphicFramePropertiesModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;

/**
 * This is a generated sequence class.
 */
public class NonVisualGraphicFramePropertiesBuilder {
  private GraphicalObjectFrameLockingModel graphicFrameLocks;

  private OfficeArtExtensionListModel extLst;

  public NonVisualGraphicFramePropertiesBuilder() {
  }

  public NonVisualGraphicFramePropertiesBuilder setGraphicFrameLocks(
      GraphicalObjectFrameLockingModel graphicFrameLocks) {
    this.graphicFrameLocks = graphicFrameLocks;
    return this;
  }

  public NonVisualGraphicFramePropertiesBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public NonVisualGraphicFramePropertiesBuilder from(NonVisualGraphicFramePropertiesModel value) {
    this.graphicFrameLocks = value.getGraphicFrameLocks();
    this.extLst = value.getExtLst();
    return this;
  }

  public NonVisualGraphicFramePropertiesModel build() {
    return new NonVisualGraphicFramePropertiesModel(this.graphicFrameLocks, this.extLst);
  }
}
