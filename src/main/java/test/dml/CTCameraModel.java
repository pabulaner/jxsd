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
import test.dml.CTCameraModel.*;
import test.officeDocument.relationships.*;

public class CTCameraModel
{
	
	private final STPresetCameraTypeModel prst;
	private final STFOVAngleModel fov;
	private final STPositivePercentageModel zoom;
	private final CTSphereCoordsModel rot;
	
	public CTCameraModel(STPresetCameraTypeModel prst, STFOVAngleModel fov, STPositivePercentageModel zoom, CTSphereCoordsModel rot) {
		this.prst = prst;
		this.fov = fov;
		this.zoom = zoom;
		this.rot = rot;
	}
	
	public STPresetCameraTypeModel getPrst() {
		return this.prst;
	}
	public STFOVAngleModel getFov() {
		return this.fov;
	}
	public STPositivePercentageModel getZoom() {
		return this.zoom;
	}
	public CTSphereCoordsModel getRot() {
		return this.rot;
	}
}
