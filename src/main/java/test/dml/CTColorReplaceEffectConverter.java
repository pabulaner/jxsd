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
import test.dml.CTColorReplaceEffectModel.*;
import test.officeDocument.relationships.*;

public class CTColorReplaceEffectConverter
{
	
	private CTColorReplaceEffectConverter() {
		// empty
	}
	
	public static CTColorReplaceEffectModel fromDocx4j(CTColorReplaceEffect value)
	{
		if (value.getScrgbClr() != null) return new CTColorReplaceEffectModel(
		CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
		);
		if (value.getSrgbClr() != null) return new CTColorReplaceEffectModel(
		CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
		);
		if (value.getHslClr() != null) return new CTColorReplaceEffectModel(
		CTHslColorConverter.fromDocx4j(value.getHslClr())
		);
		if (value.getSysClr() != null) return new CTColorReplaceEffectModel(
		CTSystemColorConverter.fromDocx4j(value.getSysClr())
		);
		if (value.getSchemeClr() != null) return new CTColorReplaceEffectModel(
		CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
		);
		if (value.getPrstClr() != null) return new CTColorReplaceEffectModel(
		CTPresetColorConverter.fromDocx4j(value.getPrstClr())
		);
		
		return new CTColorReplaceEffectModel();
	}
}
