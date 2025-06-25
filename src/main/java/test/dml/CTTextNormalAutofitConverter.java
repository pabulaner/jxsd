package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTTextNormalAutofitModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
