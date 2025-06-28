package test.drawingml.chart;

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
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chart.CTErrBarsModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTErrBarsConverter
{
	
	private CTErrBarsConverter() {
		// empty
	}
	
	public static CTErrBarsModel fromDocx4j(CTErrBars value)
	{
		return new CTErrBarsModel(
		CTErrDirConverter.fromDocx4j(value.getErrDir())
		,
		CTErrBarTypeConverter.fromDocx4j(value.getErrBarType())
		,
		CTErrValTypeConverter.fromDocx4j(value.getErrValType())
		,
		CTBooleanConverter.fromDocx4j(value.getNoEndCap())
		,
		CTNumDataSourceConverter.fromDocx4j(value.getPlus())
		,
		CTNumDataSourceConverter.fromDocx4j(value.getMinus())
		,
		CTDoubleConverter.fromDocx4j(value.getVal())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
