package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.main.CTFillStyleListModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE CONVERTER
public class CTFillStyleListConverter
{
	
	private CTFillStyleListConverter() {
		// empty
	}
	
	public static CTFillStyleListModel fromDocx4j(CTFillStyleList value)
	{
		if (value.getNoFill() != null) return CTFillStyleListModel.createNoFill(
		CTNoFillPropertiesConverter.fromDocx4j(value.getNoFill())
		);
		// THIS IS A JAVA CHOICE
		if (value.getScrgbClr != null) return CTSolidColorFillPropertiesModel.createScrgbClr(
		CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
		);
		if (value.getSrgbClr != null) return CTSolidColorFillPropertiesModel.createSrgbClr(
		CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
		);
		if (value.getHslClr != null) return CTSolidColorFillPropertiesModel.createHslClr(
		CTHslColorConverter.fromDocx4j(value.getHslClr())
		);
		if (value.getSysClr != null) return CTSolidColorFillPropertiesModel.createSysClr(
		CTSystemColorConverter.fromDocx4j(value.getSysClr())
		);
		if (value.getSchemeClr != null) return CTSolidColorFillPropertiesModel.createSchemeClr(
		CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
		);
		if (value.getPrstClr != null) return CTSolidColorFillPropertiesModel.createPrstClr(
		CTPresetColorConverter.fromDocx4j(value.getPrstClr())
		);
		// THIS IS A JAVA CHOICE END
		if (value.getGradFill() != null) return CTFillStyleListModel.createGradFill(
		CTGradientFillPropertiesConverter.fromDocx4j(value.getGradFill())
		);
		if (value.getBlipFill() != null) return CTFillStyleListModel.createBlipFill(
		CTBlipFillPropertiesConverter.fromDocx4j(value.getBlipFill())
		);
		if (value.getPattFill() != null) return CTFillStyleListModel.createPattFill(
		CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
		);
		if (value.getGrpFill() != null) return CTFillStyleListModel.createGrpFill(
		CTGroupFillPropertiesConverter.fromDocx4j(value.getGrpFill())
		);
		
		return new CTFillStyleListModel();
	}
}
