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

public class CTOuterShadowEffectConverter
{
	
	public static class ScrgbClrOrSrgbClrOrHslClrConverter
	{
		
		private CTOuterShadowEffectConverter() {
			// empty
		}
		
		public static CTOuterShadowEffectModel fromDocx4j(CTOuterShadowEffect value)
		{
			return new ScrgbClrOrSrgbClrOrHslClrModel(
			CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
			,
			CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
			,
			CTHslColorConverter.fromDocx4j(value.getHslClr())
			,
			CTSystemColorConverter.fromDocx4j(value.getSysClr())
			,
			CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
			,
			CTPresetColorConverter.fromDocx4j(value.getPrstClr())
			
			);
		}
	}
	private CTOuterShadowEffectConverter() {
		// empty
	}
	
	public static CTOuterShadowEffectModel fromDocx4j(CTOuterShadowEffect value)
	{
		return new CTOuterShadowEffectModel(
		STPositiveCoordinateConverter.fromDocx4j(value.getBlurRad())
		,
		STPositiveCoordinateConverter.fromDocx4j(value.getDist())
		,
		BooleanConverter.fromDocx4j(value.getRotWithShape())
		,
		STPercentageConverter.fromDocx4j(value.getSy())
		,
		STFixedAngleConverter.fromDocx4j(value.getKy())
		,
		STPercentageConverter.fromDocx4j(value.getSx())
		,
		STFixedAngleConverter.fromDocx4j(value.getKx())
		,
		STPositiveFixedAngleConverter.fromDocx4j(value.getDir())
		,
		STRectAlignmentConverter.fromDocx4j(value.getAlgn())
		,
		ScrgbClrOrSrgbClrOrHslClrConverter.fromDocx4j(value.getScrgbClrOrSrgbClrOrHslClr())
		
		);
	}
}
