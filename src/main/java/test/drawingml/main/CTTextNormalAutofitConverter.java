package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import test.drawingml.main.CTTextNormalAutofitModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTTextNormalAutofitConverter
{
	
	private CTTextNormalAutofitConverter() {
		// empty
	}
	
	public static CTTextNormalAutofitModel fromDocx4j(CTTextNormalAutofit value)
	{
		return new CTTextNormalAutofitModel(
		STTextFontScalePercentConverter.fromDocx4j(value.getFontScale())
		,
		STTextSpacingPercentConverter.fromDocx4j(value.getLnSpcReduction())
		
		);
	}
}
