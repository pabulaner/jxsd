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
import test.dml.chart.CTNumDataSourceModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTNumDataSourceConverter
{
	
	private CTNumDataSourceConverter() {
		// empty
	}
	
	public static CTNumDataSourceModel fromDocx4j(CTNumDataSource value)
	{
		if (value.getNumRef() != null) return new CTNumDataSourceModel(
		CTNumRefConverter.fromDocx4j(value.getNumRef())
		);
		if (value.getNumLit() != null) return new CTNumDataSourceModel(
		CTNumDataConverter.fromDocx4j(value.getNumLit())
		);
		
		return new CTNumDataSourceModel();
	}
}
