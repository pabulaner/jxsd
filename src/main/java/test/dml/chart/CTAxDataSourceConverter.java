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
import test.dml.chart.CTAxDataSourceModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTAxDataSourceConverter
{
	
	private CTAxDataSourceConverter() {
		// empty
	}
	
	public static CTAxDataSourceModel fromDocx4j(CTAxDataSource value)
	{
		if (value.getMultiLvlStrRef() != null) return new CTAxDataSourceModel(
		CTMultiLvlStrRefConverter.fromDocx4j(value.getMultiLvlStrRef())
		);
		if (value.getNumRef() != null) return new CTAxDataSourceModel(
		CTNumRefConverter.fromDocx4j(value.getNumRef())
		);
		if (value.getNumLit() != null) return new CTAxDataSourceModel(
		CTNumDataConverter.fromDocx4j(value.getNumLit())
		);
		if (value.getStrRef() != null) return new CTAxDataSourceModel(
		CTStrRefConverter.fromDocx4j(value.getStrRef())
		);
		if (value.getStrLit() != null) return new CTAxDataSourceModel(
		CTStrDataConverter.fromDocx4j(value.getStrLit())
		);
		
		return new CTAxDataSourceModel();
	}
}
