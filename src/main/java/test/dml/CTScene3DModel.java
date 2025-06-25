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
import test.dml.CTScene3DModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTScene3DModel
{
	
	private final CTCameraModel camera;
	private final CTLightRigModel lightRig;
	private final CTBackdropModel backdrop;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTScene3DModel(CTCameraModel camera, CTLightRigModel lightRig, CTBackdropModel backdrop, CTOfficeArtExtensionListModel extLst) {
		this.camera = camera;
		this.lightRig = lightRig;
		this.backdrop = backdrop;
		this.extLst = extLst;
	}
	
	public CTCameraModel getCamera() {
		return this.camera;
	}
	public CTLightRigModel getLightRig() {
		return this.lightRig;
	}
	public CTBackdropModel getBackdrop() {
		return this.backdrop;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
