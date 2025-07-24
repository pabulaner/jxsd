package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.SchemeColorValModel;
import org.docx4j.dml.STSchemeColorVal;

public class SchemeColorValConverter {
  private SchemeColorValConverter() {
  }

  public static SchemeColorValModel fromDocx4J(STSchemeColorVal value) {
    if (value == null) return null;
    if (value == STSchemeColorVal.BG_1) return SchemeColorValModel.BG_1;
    if (value == STSchemeColorVal.TX_1) return SchemeColorValModel.TX_1;
    if (value == STSchemeColorVal.BG_2) return SchemeColorValModel.BG_2;
    if (value == STSchemeColorVal.TX_2) return SchemeColorValModel.TX_2;
    if (value == STSchemeColorVal.ACCENT_1) return SchemeColorValModel.ACCENT_1;
    if (value == STSchemeColorVal.ACCENT_2) return SchemeColorValModel.ACCENT_2;
    if (value == STSchemeColorVal.ACCENT_3) return SchemeColorValModel.ACCENT_3;
    if (value == STSchemeColorVal.ACCENT_4) return SchemeColorValModel.ACCENT_4;
    if (value == STSchemeColorVal.ACCENT_5) return SchemeColorValModel.ACCENT_5;
    if (value == STSchemeColorVal.ACCENT_6) return SchemeColorValModel.ACCENT_6;
    if (value == STSchemeColorVal.HLINK) return SchemeColorValModel.HLINK;
    if (value == STSchemeColorVal.FOL_HLINK) return SchemeColorValModel.FOL_HLINK;
    if (value == STSchemeColorVal.PH_CLR) return SchemeColorValModel.PH_CLR;
    if (value == STSchemeColorVal.DK_1) return SchemeColorValModel.DK_1;
    if (value == STSchemeColorVal.LT_1) return SchemeColorValModel.LT_1;
    if (value == STSchemeColorVal.DK_2) return SchemeColorValModel.DK_2;
    if (value == STSchemeColorVal.LT_2) return SchemeColorValModel.LT_2;
    return null;
  }
}
