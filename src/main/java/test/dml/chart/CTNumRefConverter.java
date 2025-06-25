package test.dml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.CTNumRefModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTNumRefConverter
{
	
	private CTNumRefConverter() {
		// empty
	}
	
	public static CTNumRefModel fromDocx4j(CTNumRef value)
	{
		return new CTNumRefModel(
		StringConverter.fromDocx4j(value.getF())
		,
		CTNumDataConverter.fromDocx4j(value.getNumCache())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
