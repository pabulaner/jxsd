package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GraphicalObjectFrameLockingModel;
import com.scell.model.drawingml.main.NonVisualGraphicFramePropertiesModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;

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

  public NonVisualGraphicFramePropertiesModel build() {
    return new NonVisualGraphicFramePropertiesModel(this.graphicFrameLocks, this.extLst);
  }

  public NonVisualGraphicFramePropertiesBuilder from(NonVisualGraphicFramePropertiesModel value) {
    this.graphicFrameLocks = value.getGraphicFrameLocks();
    this.extLst = value.getExtLst();
    return this;
  }
}
