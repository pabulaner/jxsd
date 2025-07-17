package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_CrossBetweenModel;
import com.scell.model.drawingml.chart.ST_CrossBetweenModel;

public class CT_CrossBetweenBuilder {
  private ST_CrossBetweenModel val;

  public CT_CrossBetweenBuilder() {
  }

  public CT_CrossBetweenBuilder setVal(ST_CrossBetweenModel val) {
    this.val = val;
    return this;
  }

  public CT_CrossBetweenModel build() {
    return new CT_CrossBetweenModel(this.val);
  }

  public CT_CrossBetweenBuilder from(CT_CrossBetweenModel value) {
    this.val = value.getVal();
    return this;
  }
}
