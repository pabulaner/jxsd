package test.dml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.CTTitleModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTTitleConverter
{
	
	private CTTitleConverter() {
		// empty
	}
	
	public static CTTitleModel fromDocx4j(CTTitle value)
	{
		return new CTTitleModel(
		CTTxConverter.fromDocx4j(value.getTx())
		,
		CTLayoutConverter.fromDocx4j(value.getLayout())
		,
		CTBooleanConverter.fromDocx4j(value.getOverlay())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTTextBodyConverter.fromDocx4j(value.getTxPr())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
