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
import test.officeDocument.relationships.*;
import test.drawingml.chart.CTNumDataSourceModel.*;

// CHOICE CONVERTER
public class CTNumDataSourceConverter
{
	
	private CTNumDataSourceConverter() {
		// empty
	}
	
	public static CTNumDataSourceModel fromDocx4j(CTNumDataSource value)
	{
		if (value.getNumRef() != null) return CTNumDataSourceModel.createNumRef(
		CTNumRefConverter.fromDocx4j(value.getNumRef())
		);
		if (value.getNumLit() != null) return CTNumDataSourceModel.createNumLit(
		CTNumDataConverter.fromDocx4j(value.getNumLit())
		);
		
		return new CTNumDataSourceModel();
	}
}
