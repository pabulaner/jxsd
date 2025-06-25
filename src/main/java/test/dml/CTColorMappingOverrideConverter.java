package test.dml;

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
import test.dml.CTColorMappingOverrideModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTColorMappingOverrideConverter
{
	
	private CTColorMappingOverrideConverter() {
		// empty
	}
	
	public static CTColorMappingOverrideModel fromDocx4j(CTColorMappingOverride value)
	{
		if (value.getMasterClrMapping() != null) return new CTColorMappingOverrideModel(
		CTEmptyElementConverter.fromDocx4j(value.getMasterClrMapping())
		);
		if (value.getOverrideClrMapping() != null) return new CTColorMappingOverrideModel(
		CTColorMappingConverter.fromDocx4j(value.getOverrideClrMapping())
		);
		
		return new CTColorMappingOverrideModel();
	}
}
