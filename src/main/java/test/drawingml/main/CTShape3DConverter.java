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
import test.drawingml.main.CTShape3DModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTShape3DConverter
{
	
	private CTShape3DConverter() {
		// empty
	}
	
	public static CTShape3DModel fromDocx4j(CTShape3D value)
	{
		return new CTShape3DModel(
		STPositiveCoordinateConverter.fromDocx4j(value.getContourW())
		,
		STPositiveCoordinateConverter.fromDocx4j(value.getExtrusionH())
		,
		STPresetMaterialTypeConverter.fromDocx4j(value.getPrstMaterial())
		,
		STCoordinateConverter.fromDocx4j(value.getZ())
		,
		CTBevelConverter.fromDocx4j(value.getBevelT())
		,
		CTBevelConverter.fromDocx4j(value.getBevelB())
		,
		CTColorConverter.fromDocx4j(value.getExtrusionClr())
		,
		CTColorConverter.fromDocx4j(value.getContourClr())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
