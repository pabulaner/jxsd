package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_CrossesModel;
import org.docx4j.dml.chart.STCrosses;

public class ST_CrossesConverter {
  private ST_CrossesConverter() {
  }

  public static ST_CrossesModel fromDocx4J(STCrosses value) {
    if (value == null) return null;
    if (value == STCrosses.AUTO_ZERO) return ST_CrossesModel.AUTO_ZERO;
    if (value == STCrosses.MAX) return ST_CrossesModel.MAX;
    if (value == STCrosses.MIN) return ST_CrossesModel.MIN;
    return null;
  }

  public static STCrosses toDocx4J(ST_CrossesModel value) {
    return null;
  }
}
