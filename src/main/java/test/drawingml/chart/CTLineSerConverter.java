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
import test.officeDocument.relationships.*;
import test.drawingml.chart.CTLineSerModel.*;

// SEQUENCE CONVERTER
public class CTLineSerConverter
{
	
	private CTLineSerConverter() {
		// empty
	}
	
	public static CTLineSerModel fromDocx4j(CTLineSer value)
	{
		return new CTLineSerModel(
		CTUnsignedIntConverter.fromDocx4j(value.getIdx())
		,
		CTUnsignedIntConverter.fromDocx4j(value.getOrder())
		,
		CTSerTxConverter.fromDocx4j(value.getTx())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTMarkerConverter.fromDocx4j(value.getMarker())
		,
		value.getDPt().stream().map(CTDPtConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		value.getTrendline().stream().map(CTTrendlineConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTErrBarsConverter.fromDocx4j(value.getErrBars())
		,
		CTAxDataSourceConverter.fromDocx4j(value.getCat())
		,
		CTNumDataSourceConverter.fromDocx4j(value.getVal())
		,
		CTBooleanConverter.fromDocx4j(value.getSmooth())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
