package test.dml.chart;

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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import test.dml.chart.CTBarSerModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTBarSerConverter
{
	
	private CTBarSerConverter() {
		// empty
	}
	
	public static CTBarSerModel fromDocx4j(CTBarSer value)
	{
		return new CTBarSerModel(
		CTUnsignedIntConverter.fromDocx4j(value.getIdx())
		,
		CTUnsignedIntConverter.fromDocx4j(value.getOrder())
		,
		CTSerTxConverter.fromDocx4j(value.getTx())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTBooleanConverter.fromDocx4j(value.getInvertIfNegative())
		,
		CTPictureOptionsConverter.fromDocx4j(value.getPictureOptions())
		,
		value.getDPt().stream().map(CTDPtConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		value.getTrendline().stream().map(CTTrendlineConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTErrBarsConverter.fromDocx4j(value.getErrBars())
		,
		CTAxDataSourceConverter.fromDocx4j(value.getCat())
		,
		CTNumDataSourceConverter.fromDocx4j(value.getVal())
		,
		CTShapeConverter.fromDocx4j(value.getShape())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
