package test.drawingml.main;

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
import test.drawingml.main.CTColorMappingOverrideModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE CONVERTER
public class CTColorMappingOverrideConverter
{
	
	private CTColorMappingOverrideConverter() {
		// empty
	}
	
	public static CTColorMappingOverrideModel fromDocx4j(CTColorMappingOverride value)
	{
		if (value.getMasterClrMapping() != null) return CTColorMappingOverrideModel.createMasterClrMapping(
		CTEmptyElementConverter.fromDocx4j(value.getMasterClrMapping())
		);
		if (value.getOverrideClrMapping() != null) return CTColorMappingOverrideModel.createOverrideClrMapping(
		CTColorMappingConverter.fromDocx4j(value.getOverrideClrMapping())
		);
		
		return new CTColorMappingOverrideModel();
	}
}
