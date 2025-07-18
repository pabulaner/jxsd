package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_CrossBetweenModel;

public class ST_CrossBetweenBuilder {
  private ST_CrossBetweenModel value;

  public ST_CrossBetweenBuilder() {
    this.value = null;
  }

  public ST_CrossBetweenBuilder from(ST_CrossBetweenModel value) {
    this.value = value;
    return this;
  }

  public ST_CrossBetweenModel build() {
    return this.value;
  }

  public ST_CrossBetweenBuilder setValue(ST_CrossBetweenModel value) {
    this.value = value;
    return this;
  }
}
