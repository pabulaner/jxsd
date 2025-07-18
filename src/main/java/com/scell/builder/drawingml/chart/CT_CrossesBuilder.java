package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_CrossesModel;
import com.scell.model.drawingml.chart.ST_CrossesModel;

public class CT_CrossesBuilder {
  private ST_CrossesModel val;

  public CT_CrossesBuilder() {
  }

  public CT_CrossesBuilder setVal(ST_CrossesModel val) {
    this.val = val;
    return this;
  }

  public CT_CrossesModel build() {
    return new CT_CrossesModel(this.val);
  }

  public CT_CrossesBuilder from(CT_CrossesModel value) {
    this.val = value.getVal();
    return this;
  }
}
