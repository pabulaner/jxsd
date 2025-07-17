package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_GraphicalObjectFrameLockingModel;
import com.scell.model.drawingml.main.CT_NonVisualGraphicFramePropertiesModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;

public class CT_NonVisualGraphicFramePropertiesBuilder {
  private CT_GraphicalObjectFrameLockingModel graphicFrameLocks;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_NonVisualGraphicFramePropertiesBuilder() {
  }

  public CT_NonVisualGraphicFramePropertiesBuilder setGraphicFrameLocks(
      CT_GraphicalObjectFrameLockingModel graphicFrameLocks) {
    this.graphicFrameLocks = graphicFrameLocks;
    return this;
  }

  public CT_NonVisualGraphicFramePropertiesBuilder setExtLst(
      CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_NonVisualGraphicFramePropertiesModel build() {
    return new CT_NonVisualGraphicFramePropertiesModel(this.graphicFrameLocks, this.extLst);
  }

  public CT_NonVisualGraphicFramePropertiesBuilder from(
      CT_NonVisualGraphicFramePropertiesModel value) {
    this.graphicFrameLocks = value.getGraphicFrameLocks();
    this.extLst = value.getExtLst();
    return this;
  }
}
