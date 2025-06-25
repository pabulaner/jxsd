package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.CTOuterShadowEffectModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTOuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel.*;
import test.officeDocument.relationships.*;

public class CTOuterShadowEffectModel
{
	
	public static class ScrgbClrOrSrgbClrOrHslClrModel
	{
		
		private final CTScRgbColorModel scrgbClr;
		private final CTSRgbColorModel srgbClr;
		private final CTHslColorModel hslClr;
		private final CTSystemColorModel sysClr;
		private final CTSchemeColorModel schemeClr;
		private final CTPresetColorModel prstClr;
		
		public ScrgbClrOrSrgbClrOrHslClrModel(CTScRgbColorModel scrgbClr, CTSRgbColorModel srgbClr, CTHslColorModel hslClr, CTSystemColorModel sysClr, CTSchemeColorModel schemeClr, CTPresetColorModel prstClr) {
			this.scrgbClr = scrgbClr;
			this.srgbClr = srgbClr;
			this.hslClr = hslClr;
			this.sysClr = sysClr;
			this.schemeClr = schemeClr;
			this.prstClr = prstClr;
		}
		
		public CTScRgbColorModel getScrgbClr() {
			return this.scrgbClr;
		}
		public CTSRgbColorModel getSrgbClr() {
			return this.srgbClr;
		}
		public CTHslColorModel getHslClr() {
			return this.hslClr;
		}
		public CTSystemColorModel getSysClr() {
			return this.sysClr;
		}
		public CTSchemeColorModel getSchemeClr() {
			return this.schemeClr;
		}
		public CTPresetColorModel getPrstClr() {
			return this.prstClr;
		}
	}
	private final STPositiveCoordinateModel blurRad;
	private final STPositiveCoordinateModel dist;
	private final BooleanModel rotWithShape;
	private final STPercentageModel sy;
	private final STFixedAngleModel ky;
	private final STPercentageModel sx;
	private final STFixedAngleModel kx;
	private final STPositiveFixedAngleModel dir;
	private final STRectAlignmentModel algn;
	private final ScrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr;
	
	public CTOuterShadowEffectModel(STPositiveCoordinateModel blurRad, STPositiveCoordinateModel dist, BooleanModel rotWithShape, STPercentageModel sy, STFixedAngleModel ky, STPercentageModel sx, STFixedAngleModel kx, STPositiveFixedAngleModel dir, STRectAlignmentModel algn, ScrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr) {
		this.blurRad = blurRad;
		this.dist = dist;
		this.rotWithShape = rotWithShape;
		this.sy = sy;
		this.ky = ky;
		this.sx = sx;
		this.kx = kx;
		this.dir = dir;
		this.algn = algn;
		this.scrgbClrOrSrgbClrOrHslClr = scrgbClrOrSrgbClrOrHslClr;
	}
	
	public STPositiveCoordinateModel getBlurRad() {
		return this.blurRad;
	}
	public STPositiveCoordinateModel getDist() {
		return this.dist;
	}
	public BooleanModel getRotWithShape() {
		return this.rotWithShape;
	}
	public STPercentageModel getSy() {
		return this.sy;
	}
	public STFixedAngleModel getKy() {
		return this.ky;
	}
	public STPercentageModel getSx() {
		return this.sx;
	}
	public STFixedAngleModel getKx() {
		return this.kx;
	}
	public STPositiveFixedAngleModel getDir() {
		return this.dir;
	}
	public STRectAlignmentModel getAlgn() {
		return this.algn;
	}
	public ScrgbClrOrSrgbClrOrHslClrModel getScrgbClrOrSrgbClrOrHslClr() {
		return this.scrgbClrOrSrgbClrOrHslClr;
	}
}
