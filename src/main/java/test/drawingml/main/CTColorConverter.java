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
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTColorModel.*;
import test.officeDocument.relationships.*;

// CHOICE CONVERTER
public class CTColorConverter
{
	
	private CTColorConverter() {
		// empty
	}
	
	public static CTColorModel fromDocx4j(CTColor value)
	{
		if (value.getScrgbClr() != null) return CTColorModel.createScrgbClr(
		CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
		);
		if (value.getSrgbClr() != null) return CTColorModel.createSrgbClr(
		CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
		);
		if (value.getHslClr() != null) return CTColorModel.createHslClr(
		CTHslColorConverter.fromDocx4j(value.getHslClr())
		);
		if (value.getSysClr() != null) return CTColorModel.createSysClr(
		CTSystemColorConverter.fromDocx4j(value.getSysClr())
		);
		if (value.getSchemeClr() != null) return CTColorModel.createSchemeClr(
		CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
		);
		if (value.getPrstClr() != null) return CTColorModel.createPrstClr(
		CTPresetColorConverter.fromDocx4j(value.getPrstClr())
		);
		
		return new CTColorModel();
	}
}
