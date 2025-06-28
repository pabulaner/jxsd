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
import test.drawingml.chart.CTPivotFmtModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTPivotFmtConverter
{
	
	private CTPivotFmtConverter() {
		// empty
	}
	
	public static CTPivotFmtModel fromDocx4j(CTPivotFmt value)
	{
		return new CTPivotFmtModel(
		CTUnsignedIntConverter.fromDocx4j(value.getIdx())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTTextBodyConverter.fromDocx4j(value.getTxPr())
		,
		CTMarkerConverter.fromDocx4j(value.getMarker())
		,
		CTDLblConverter.fromDocx4j(value.getDLbl())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
