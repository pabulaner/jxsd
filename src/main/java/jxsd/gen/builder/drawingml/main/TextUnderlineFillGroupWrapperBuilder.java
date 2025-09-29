package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.BlipFillPropertiesModel;
import jxsd.gen.model.drawingml.main.GradientFillPropertiesModel;
import jxsd.gen.model.drawingml.main.GroupFillPropertiesModel;
import jxsd.gen.model.drawingml.main.NoFillPropertiesModel;
import jxsd.gen.model.drawingml.main.PatternFillPropertiesModel;
import jxsd.gen.model.drawingml.main.SolidColorFillPropertiesModel;
import jxsd.gen.model.drawingml.main.TextUnderlineFillGroupWrapperModel;

/**
 * This is a generated choice class.
 */
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
}
