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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;
import test.dml.CTColorModel.*;

public class CTColorConverter
{
	
	private CTColorConverter() {
		// empty
	}
	
	public static CTColorModel fromDocx4j(CTColor value)
	{
		if (value.getScrgbClr() != null) return new CTColorModel(
		CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
		);
		if (value.getSrgbClr() != null) return new CTColorModel(
		CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
		);
		if (value.getHslClr() != null) return new CTColorModel(
		CTHslColorConverter.fromDocx4j(value.getHslClr())
		);
		if (value.getSysClr() != null) return new CTColorModel(
		CTSystemColorConverter.fromDocx4j(value.getSysClr())
		);
		if (value.getSchemeClr() != null) return new CTColorModel(
		CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
		);
		if (value.getPrstClr() != null) return new CTColorModel(
		CTPresetColorConverter.fromDocx4j(value.getPrstClr())
		);
		
		return new CTColorModel();
	}
}
