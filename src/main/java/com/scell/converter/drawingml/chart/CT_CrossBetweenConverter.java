package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_CrossBetweenModel;
import org.docx4j.dml.chart.CTCrossBetween;

public class CT_CrossBetweenConverter {
  private CT_CrossBetweenConverter() {
  }

  public static CT_CrossBetweenModel fromDocx4J(CTCrossBetween value) {
    if (value == null) return null;
    return new CT_CrossBetweenModel(ST_CrossBetweenConverter.fromDocx4J(value.getVal()));
  }

  public static CTCrossBetween toDocx4J(CT_CrossBetweenModel value) {
    return null;
  }
}
