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
import test.dml.chart.CTMarkerModel.*;
import test.officeDocument.relationships.*;

public class CTMarkerConverter
{
	
	private CTMarkerConverter() {
		// empty
	}
	
	public static CTMarkerModel fromDocx4j(CTMarker value)
	{
		return new CTMarkerModel(
		CTMarkerStyleConverter.fromDocx4j(value.getSymbol())
		,
		CTMarkerSizeConverter.fromDocx4j(value.getSize())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
