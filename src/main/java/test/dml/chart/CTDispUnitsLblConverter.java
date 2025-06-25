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
import test.dml.chart.CTDispUnitsLblModel.*;
import test.officeDocument.relationships.*;

public class CTDispUnitsLblConverter
{
	
	private CTDispUnitsLblConverter() {
		// empty
	}
	
	public static CTDispUnitsLblModel fromDocx4j(CTDispUnitsLbl value)
	{
		return new CTDispUnitsLblModel(
		CTLayoutConverter.fromDocx4j(value.getLayout())
		,
		CTTxConverter.fromDocx4j(value.getTx())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTTextBodyConverter.fromDocx4j(value.getTxPr())
		
		);
	}
}
