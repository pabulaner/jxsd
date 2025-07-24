package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlipFillPropertiesModel;
import com.scell.model.drawingml.main.GradientFillPropertiesModel;
import com.scell.model.drawingml.main.GroupFillPropertiesModel;
import com.scell.model.drawingml.main.NoFillPropertiesModel;
import com.scell.model.drawingml.main.PatternFillPropertiesModel;
import com.scell.model.drawingml.main.SolidColorFillPropertiesModel;
import com.scell.model.drawingml.main.TextUnderlineFillGroupWrapperModel;
import java.lang.Object;

public class TextUnderlineFillGroupWrapperBuilder {
  private int type;

  private Object value;

  public TextUnderlineFillGroupWrapperBuilder() {
    this.type = -1;
    this.value = null;
  }

  public TextUnderlineFillGroupWrapperBuilder setNoFill(NoFillPropertiesModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public TextUnderlineFillGroupWrapperBuilder setSolidFill(SolidColorFillPropertiesModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public TextUnderlineFillGroupWrapperBuilder setGradFill(GradientFillPropertiesModel value) {
    this.type = 2;
    this.value = value;
    return this;
  }

  public TextUnderlineFillGroupWrapperBuilder setBlipFill(BlipFillPropertiesModel value) {
    this.type = 3;
    this.value = value;
    return this;
  }

  public TextUnderlineFillGroupWrapperBuilder setPattFill(PatternFillPropertiesModel value) {
    this.type = 4;
    this.value = value;
    return this;
  }

  public TextUnderlineFillGroupWrapperBuilder setGrpFill(GroupFillPropertiesModel value) {
    this.type = 5;
    this.value = value;
    return this;
  }

  public TextUnderlineFillGroupWrapperModel build() {
    if (this.type == -1) return new TextUnderlineFillGroupWrapperModel();
    if (this.type == 0) return TextUnderlineFillGroupWrapperModel.newNoFill((NoFillPropertiesModel) this.value);
    if (this.type == 1) return TextUnderlineFillGroupWrapperModel.newSolidFill((SolidColorFillPropertiesModel) this.value);
    if (this.type == 2) return TextUnderlineFillGroupWrapperModel.newGradFill((GradientFillPropertiesModel) this.value);
    if (this.type == 3) return TextUnderlineFillGroupWrapperModel.newBlipFill((BlipFillPropertiesModel) this.value);
    if (this.type == 4) return TextUnderlineFillGroupWrapperModel.newPattFill((PatternFillPropertiesModel) this.value);
    if (this.type == 5) return TextUnderlineFillGroupWrapperModel.newGrpFill((GroupFillPropertiesModel) this.value);
    return null;
  }

  public TextUnderlineFillGroupWrapperBuilder from(TextUnderlineFillGroupWrapperModel value) {
    this.type = -1;
    this.value = null;
    if (value.isNoFill()) {
      this.type = 0;
      this.value = value.getNoFill();
    }
    if (value.isSolidFill()) {
      this.type = 1;
      this.value = value.getSolidFill();
    }
    if (value.isGradFill()) {
      this.type = 2;
      this.value = value.getGradFill();
    }
    if (value.isBlipFill()) {
      this.type = 3;
      this.value = value.getBlipFill();
    }
    if (value.isPattFill()) {
      this.type = 4;
      this.value = value.getPattFill();
    }
    if (value.isGrpFill()) {
      this.type = 5;
      this.value = value.getGrpFill();
    }
    return this;
  }
}
