package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextSpacingModel;
import com.scell.model.drawingml.main.TextSpacingPercentModel;
import com.scell.model.drawingml.main.TextSpacingPointModel;
import java.lang.Object;

public class TextSpacingBuilder {
  private int type;

  private Object value;

  public TextSpacingBuilder() {
    this.type = -1;
    this.value = null;
  }

  public TextSpacingBuilder setSpcPct(TextSpacingPercentModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public TextSpacingBuilder setSpcPts(TextSpacingPointModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public TextSpacingModel build() {
    if (this.type == -1) return new TextSpacingModel();
    if (this.type == 0) return TextSpacingModel.newSpcPct((TextSpacingPercentModel) this.value);
    if (this.type == 1) return TextSpacingModel.newSpcPts((TextSpacingPointModel) this.value);
    return null;
  }

  public TextSpacingBuilder from(TextSpacingModel value) {
    this.type = -1;
    this.value = null;
    if (value.isSpcPct()) {
      this.type = 0;
      this.value = value.getSpcPct();
    }
    if (value.isSpcPts()) {
      this.type = 1;
      this.value = value.getSpcPts();
    }
    return this;
  }
}
