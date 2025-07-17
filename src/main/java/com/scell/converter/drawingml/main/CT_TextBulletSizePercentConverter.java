package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextBulletSizePercentModel;
import org.docx4j.dml.CTTextBulletSizePercent;

public class CT_TextBulletSizePercentConverter {
  private CT_TextBulletSizePercentConverter() {
  }

  public static CT_TextBulletSizePercentModel fromDocx4j(CTTextBulletSizePercent value) {
    if (value == null) return null;
    return new CT_TextBulletSizePercentModel(ST_TextBulletSizePercentConverter.fromDocx4j(value.getVal()));
  }

  public static CTTextBulletSizePercent toDocx4j(CT_TextBulletSizePercentModel value) {
    return null;
  }
}
