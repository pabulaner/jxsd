package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_AbsSizeAnchorModel;
import com.scell.model.drawingml.chartDrawing.CT_DrawingModel;
import com.scell.model.drawingml.chartDrawing.CT_RelSizeAnchorModel;
import java.lang.Object;
import java.util.List;

public class CT_DrawingBuilder {
  private List<CT_DrawingModel.EG_AnchorModel> egAnchor;

  public CT_DrawingBuilder() {
  }

  public CT_DrawingBuilder setEGAnchor(List<CT_DrawingModel.EG_AnchorModel> egAnchor) {
    this.egAnchor = egAnchor;
    return this;
  }

  public CT_DrawingModel build() {
    return new CT_DrawingModel(this.egAnchor);
  }

  public CT_DrawingBuilder from(CT_DrawingModel value) {
    this.egAnchor = value.getEGAnchor();
    return this;
  }

  public static class EG_AnchorBuilder {
    private int type;

    private Object value;

    public EG_AnchorBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_AnchorBuilder setRelSizeAnchor(CT_RelSizeAnchorModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_AnchorBuilder setAbsSizeAnchor(CT_AbsSizeAnchorModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_DrawingModel.EG_AnchorModel build() {
      if (this.type == -1) return new CT_DrawingModel.EG_AnchorModel();
      if (this.type == 0) return CT_DrawingModel.EG_AnchorModel.newRelSizeAnchor((CT_RelSizeAnchorModel) this.value);
      if (this.type == 1) return CT_DrawingModel.EG_AnchorModel.newAbsSizeAnchor((CT_AbsSizeAnchorModel) this.value);
      return null;
    }

    public EG_AnchorBuilder from(CT_DrawingModel.EG_AnchorModel value) {
      this.type = -1;
      this.value = null;
      if (value.isRelSizeAnchor()) {
        this.type = 0;
        this.value = value.getRelSizeAnchor();
      }
      if (value.isAbsSizeAnchor()) {
        this.type = 1;
        this.value = value.getAbsSizeAnchor();
      }
      return this;
    }
  }
}
