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

// SEQUENCE MODEL
public class CTShape3DModel
{
	
	private final STPositiveCoordinateModel contourW;
	private final STPositiveCoordinateModel extrusionH;
	private final STPresetMaterialTypeModel prstMaterial;
	private final STCoordinateModel z;
	private final CTBevelModel bevelT;
	private final CTBevelModel bevelB;
	private final CTColorModel extrusionClr;
	private final CTColorModel contourClr;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTShape3DModel(STPositiveCoordinateModel contourW, STPositiveCoordinateModel extrusionH, STPresetMaterialTypeModel prstMaterial, STCoordinateModel z, CTBevelModel bevelT, CTBevelModel bevelB, CTColorModel extrusionClr, CTColorModel contourClr, CTOfficeArtExtensionListModel extLst) {
		this.contourW = contourW;
		this.extrusionH = extrusionH;
		this.prstMaterial = prstMaterial;
		this.z = z;
		this.bevelT = bevelT;
		this.bevelB = bevelB;
		this.extrusionClr = extrusionClr;
		this.contourClr = contourClr;
		this.extLst = extLst;
	}
	
	public STPositiveCoordinateModel getContourW() {
		return this.contourW;
	}
	public STPositiveCoordinateModel getExtrusionH() {
		return this.extrusionH;
	}
	public STPresetMaterialTypeModel getPrstMaterial() {
		return this.prstMaterial;
	}
	public STCoordinateModel getZ() {
		return this.z;
	}
	public CTBevelModel getBevelT() {
		return this.bevelT;
	}
	public CTBevelModel getBevelB() {
		return this.bevelB;
	}
	public CTColorModel getExtrusionClr() {
		return this.extrusionClr;
	}
	public CTColorModel getContourClr() {
		return this.contourClr;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
