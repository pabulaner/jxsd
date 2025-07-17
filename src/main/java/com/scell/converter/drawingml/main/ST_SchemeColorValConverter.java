package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_SchemeColorValModel;
import org.docx4j.dml.STSchemeColorVal;

public class ST_SchemeColorValConverter {
  private ST_SchemeColorValConverter() {
  }

  public static ST_SchemeColorValModel fromDocx4j(STSchemeColorVal value) {
    if (value == null) return null;
    if (value == STSchemeColorVal.BG1) return ST_SchemeColorValModel.BG1;
    if (value == STSchemeColorVal.TX1) return ST_SchemeColorValModel.TX1;
    if (value == STSchemeColorVal.BG2) return ST_SchemeColorValModel.BG2;
    if (value == STSchemeColorVal.TX2) return ST_SchemeColorValModel.TX2;
    if (value == STSchemeColorVal.ACCENT1) return ST_SchemeColorValModel.ACCENT1;
    if (value == STSchemeColorVal.ACCENT2) return ST_SchemeColorValModel.ACCENT2;
    if (value == STSchemeColorVal.ACCENT3) return ST_SchemeColorValModel.ACCENT3;
    if (value == STSchemeColorVal.ACCENT4) return ST_SchemeColorValModel.ACCENT4;
    if (value == STSchemeColorVal.ACCENT5) return ST_SchemeColorValModel.ACCENT5;
    if (value == STSchemeColorVal.ACCENT6) return ST_SchemeColorValModel.ACCENT6;
    if (value == STSchemeColorVal.HLINK) return ST_SchemeColorValModel.HLINK;
    if (value == STSchemeColorVal.FOL_HLINK) return ST_SchemeColorValModel.FOL_HLINK;
    if (value == STSchemeColorVal.PH_CLR) return ST_SchemeColorValModel.PH_CLR;
    if (value == STSchemeColorVal.DK1) return ST_SchemeColorValModel.DK1;
    if (value == STSchemeColorVal.LT1) return ST_SchemeColorValModel.LT1;
    if (value == STSchemeColorVal.DK2) return ST_SchemeColorValModel.DK2;
    if (value == STSchemeColorVal.LT2) return ST_SchemeColorValModel.LT2;
    return null;
  }

  public static STSchemeColorVal toDocx4j(ST_SchemeColorValModel value) {
    return null;
  }
}
