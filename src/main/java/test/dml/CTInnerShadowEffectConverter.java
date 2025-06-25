package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTInnerShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTInnerShadowEffectModel.*;
import test.officeDocument.relationships.*;

public class CTInnerShadowEffectConverter
{
	
	public static class ScrgbClrOrSrgbClrOrHslClrConverter
	{
		
		private CTInnerShadowEffectConverter() {
			// empty
		}
		
		public static CTInnerShadowEffectModel fromDocx4j(CTInnerShadowEffect value)
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
	private CTInnerShadowEffectConverter() {
		// empty
	}
	
	public static CTInnerShadowEffectModel fromDocx4j(CTInnerShadowEffect value)
	{
		return new CTInnerShadowEffectModel(
		STPositiveCoordinateConverter.fromDocx4j(value.getBlurRad())
		,
		STPositiveCoordinateConverter.fromDocx4j(value.getDist())
		,
		STPositiveFixedAngleConverter.fromDocx4j(value.getDir())
		,
		ScrgbClrOrSrgbClrOrHslClrConverter.fromDocx4j(value.getScrgbClrOrSrgbClrOrHslClr())
		
		);
	}
}
