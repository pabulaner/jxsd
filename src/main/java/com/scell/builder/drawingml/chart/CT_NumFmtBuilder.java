package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.chart.CT_NumFmtModel;
import com.scell.model.drawingml.chart.ST_XstringModel;

public class CT_NumFmtBuilder {
  private ST_XstringModel formatCode;

  private BooleanModel sourceLinked;

  public CT_NumFmtBuilder() {
  }

  public CT_NumFmtBuilder setFormatCode(ST_XstringModel formatCode) {
    this.formatCode = formatCode;
    return this;
  }

  public CT_NumFmtBuilder setSourceLinked(BooleanModel sourceLinked) {
    this.sourceLinked = sourceLinked;
    return this;
  }

  public CT_NumFmtModel build() {
    return new CT_NumFmtModel(this.formatCode, this.sourceLinked);
  }

  public CT_NumFmtBuilder from(CT_NumFmtModel value) {
    this.formatCode = value.getFormatCode();
    this.sourceLinked = value.getSourceLinked();
    return this;
  }
}
