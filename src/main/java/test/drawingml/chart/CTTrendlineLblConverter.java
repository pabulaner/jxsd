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
import test.drawingml.chart.CTTrendlineLblModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTTrendlineLblConverter
{
	
	private CTTrendlineLblConverter() {
		// empty
	}
	
	public static CTTrendlineLblModel fromDocx4j(CTTrendlineLbl value)
	{
		return new CTTrendlineLblModel(
		CTLayoutConverter.fromDocx4j(value.getLayout())
		,
		CTTxConverter.fromDocx4j(value.getTx())
		,
		CTNumFmtConverter.fromDocx4j(value.getNumFmt())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTTextBodyConverter.fromDocx4j(value.getTxPr())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
