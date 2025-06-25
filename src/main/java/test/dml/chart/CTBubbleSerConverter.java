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
import org.docx4j.dml.chartDrawing.*;
import test.dml.chart.CTBubbleSerModel.*;
import test.officeDocument.relationships.*;

public class CTBubbleSerConverter
{
	
	private CTBubbleSerConverter() {
		// empty
	}
	
	public static CTBubbleSerModel fromDocx4j(CTBubbleSer value)
	{
		return new CTBubbleSerModel(
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
		value.getDPt().stream().map(CTDPtConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		value.getTrendline().stream().map(CTTrendlineConverter::fromDocx4j).collect(Collectors.toList());
		,
		value.getErrBars().stream().map(CTErrBarsConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTAxDataSourceConverter.fromDocx4j(value.getXVal())
		,
		CTNumDataSourceConverter.fromDocx4j(value.getYVal())
		,
		CTNumDataSourceConverter.fromDocx4j(value.getBubbleSize())
		,
		CTBooleanConverter.fromDocx4j(value.getBubble3D())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
