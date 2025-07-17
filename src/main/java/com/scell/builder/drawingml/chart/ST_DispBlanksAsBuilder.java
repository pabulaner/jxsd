package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_DispBlanksAsModel;

public class ST_DispBlanksAsBuilder {
  private ST_DispBlanksAsModel value;

  public ST_DispBlanksAsBuilder() {
    this.value = null;
  }

  public ST_DispBlanksAsBuilder from(ST_DispBlanksAsModel value) {
    this.value = value;
    return this;
  }

  public ST_DispBlanksAsModel build() {
    return this.value;
  }

  public ST_DispBlanksAsBuilder setValue(ST_DispBlanksAsModel value) {
    this.value = value;
    return this;
  }
}
