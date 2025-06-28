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
import test.drawingml.chart.CTDispUnitsModel.CustUnitOrBuiltInUnitModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.chart.CTDispUnitsModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTDispUnitsConverter
{
	
	// CHOICE CONVERTER
	public static class CustUnitOrBuiltInUnitConverter
	{
		
		private CustUnitOrBuiltInUnitConverter() {
			// empty
		}
		
		public static CustUnitOrBuiltInUnitModel fromDocx4j(CustUnitOrBuiltInUnit value)
		{
			if (value.getCustUnit() != null) return CustUnitOrBuiltInUnitModel.createCustUnit(
			CTDoubleConverter.fromDocx4j(value.getCustUnit())
			);
			if (value.getBuiltInUnit() != null) return CustUnitOrBuiltInUnitModel.createBuiltInUnit(
			CTBuiltInUnitConverter.fromDocx4j(value.getBuiltInUnit())
			);
			
			return new CustUnitOrBuiltInUnitModel();
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
