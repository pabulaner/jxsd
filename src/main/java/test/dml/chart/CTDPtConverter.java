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
import test.dml.chart.CTDPtModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTDPtConverter
{
	
	private CTDPtConverter() {
		// empty
	}
	
	public static CTDPtModel fromDocx4j(CTDPt value)
	{
		return new CTDPtModel(
		CTUnsignedIntConverter.fromDocx4j(value.getIdx())
		,
		CTBooleanConverter.fromDocx4j(value.getInvertIfNegative())
		,
		CTMarkerConverter.fromDocx4j(value.getMarker())
		,
		CTBooleanConverter.fromDocx4j(value.getBubble3D())
		,
		CTUnsignedIntConverter.fromDocx4j(value.getExplosion())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTPictureOptionsConverter.fromDocx4j(value.getPictureOptions())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
