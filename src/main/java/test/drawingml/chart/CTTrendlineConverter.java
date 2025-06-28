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
import test.drawingml.chartDrawing.*;
import test.drawingml.chart.CTTrendlineModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTTrendlineConverter
{
	
	private CTTrendlineConverter() {
		// empty
	}
	
	public static CTTrendlineModel fromDocx4j(CTTrendline value)
	{
		return new CTTrendlineModel(
		StringConverter.fromDocx4j(value.getName())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTTrendlineTypeConverter.fromDocx4j(value.getTrendlineType())
		,
		CTOrderConverter.fromDocx4j(value.getOrder())
		,
		CTPeriodConverter.fromDocx4j(value.getPeriod())
		,
		CTDoubleConverter.fromDocx4j(value.getForward())
		,
		CTDoubleConverter.fromDocx4j(value.getBackward())
		,
		CTDoubleConverter.fromDocx4j(value.getIntercept())
		,
		CTBooleanConverter.fromDocx4j(value.getDispRSqr())
		,
		CTBooleanConverter.fromDocx4j(value.getDispEq())
		,
		CTTrendlineLblConverter.fromDocx4j(value.getTrendlineLbl())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
