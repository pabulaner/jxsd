package test.dml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.CTDispUnitsModel.CustUnitOrBuiltInUnitModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chart.CTDispUnitsModel.*;
import test.officeDocument.relationships.*;

public class CTDispUnitsConverter
{
	
	public static class CustUnitOrBuiltInUnitConverter
	{
		
		private CTDispUnitsConverter() {
			// empty
		}
		
		public static CTDispUnitsModel fromDocx4j(CTDispUnits value)
		{
			return new CustUnitOrBuiltInUnitModel(
			CTDoubleConverter.fromDocx4j(value.getCustUnit())
			,
			CTBuiltInUnitConverter.fromDocx4j(value.getBuiltInUnit())
			
			);
		}
	}
	private CTDispUnitsConverter() {
		// empty
	}
	
	public static CTDispUnitsModel fromDocx4j(CTDispUnits value)
	{
		return new CTDispUnitsModel(
		CustUnitOrBuiltInUnitConverter.fromDocx4j(value.getCustUnitOrBuiltInUnit())
		,
		CTDispUnitsLblConverter.fromDocx4j(value.getDispUnitsLbl())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
