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
import test.drawingml.main.CTScene3DModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTScene3DConverter
{
	
	private CTScene3DConverter() {
		// empty
	}
	
	public static CTScene3DModel fromDocx4j(CTScene3D value)
	{
		return new CTScene3DModel(
		CTCameraConverter.fromDocx4j(value.getCamera())
		,
		CTLightRigConverter.fromDocx4j(value.getLightRig())
		,
		CTBackdropConverter.fromDocx4j(value.getBackdrop())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
