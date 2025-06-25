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
import test.dml.chart.CTRadarSerModel.*;
import test.officeDocument.relationships.*;

public class CTRadarSerConverter
{
	
	private CTRadarSerConverter() {
		// empty
	}
	
	public static CTRadarSerModel fromDocx4j(CTRadarSer value)
	{
		return new CTRadarSerModel(
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
		value.getDPt().stream().map(CTDPtConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		CTAxDataSourceConverter.fromDocx4j(value.getCat())
		,
		CTNumDataSourceConverter.fromDocx4j(value.getVal())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
