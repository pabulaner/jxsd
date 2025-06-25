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
import test.dml.CTStyleMatrixReferenceModel.ScrgbClrOrSrgbClrOrHslClrModel.*;
import test.dml.chartDrawing.*;
import test.dml.CTStyleMatrixReferenceModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTStyleMatrixReferenceConverter
{
	
	public static class ScrgbClrOrSrgbClrOrHslClrConverter
	{
		
		private CTStyleMatrixReferenceConverter() {
			// empty
		}
		
		public static CTStyleMatrixReferenceModel fromDocx4j(CTStyleMatrixReference value)
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
	private CTStyleMatrixReferenceConverter() {
		// empty
	}
	
	public static CTStyleMatrixReferenceModel fromDocx4j(CTStyleMatrixReference value)
	{
		return new CTStyleMatrixReferenceModel(
		STStyleMatrixColumnIndexConverter.fromDocx4j(value.getIdx())
		,
		ScrgbClrOrSrgbClrOrHslClrConverter.fromDocx4j(value.getScrgbClrOrSrgbClrOrHslClr())
		
		);
	}
}
