package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_CrossesModel;

public class ST_CrossesBuilder {
  private ST_CrossesModel value;

  public ST_CrossesBuilder() {
    this.value = null;
  }

  public ST_CrossesBuilder from(ST_CrossesModel value) {
    this.value = value;
    return this;
  }

  public ST_CrossesModel build() {
    return this.value;
  }

  public ST_CrossesBuilder setValue(ST_CrossesModel value) {
    this.value = value;
    return this;
  }
}
