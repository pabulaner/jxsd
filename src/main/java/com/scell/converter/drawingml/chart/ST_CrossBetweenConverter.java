package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_CrossBetweenModel;
import org.docx4j.dml.chart.STCrossBetween;

public class ST_CrossBetweenConverter {
  private ST_CrossBetweenConverter() {
  }

  public static ST_CrossBetweenModel fromDocx4J(STCrossBetween value) {
    if (value == null) return null;
    if (value == STCrossBetween.BETWEEN) return ST_CrossBetweenModel.BETWEEN;
    if (value == STCrossBetween.MID_CAT) return ST_CrossBetweenModel.MID_CAT;
    return null;
  }

  public static STCrossBetween toDocx4J(ST_CrossBetweenModel value) {
    return null;
  }
}
