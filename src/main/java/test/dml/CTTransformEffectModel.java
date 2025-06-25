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
import test.dml.CTTransformEffectModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTTransformEffectModel
{
	
	private final STPercentageModel sy;
	private final STFixedAngleModel ky;
	private final STPercentageModel sx;
	private final STCoordinateModel ty;
	private final STFixedAngleModel kx;
	private final STCoordinateModel tx;
	
	public CTTransformEffectModel(STPercentageModel sy, STFixedAngleModel ky, STPercentageModel sx, STCoordinateModel ty, STFixedAngleModel kx, STCoordinateModel tx) {
		this.sy = sy;
		this.ky = ky;
		this.sx = sx;
		this.ty = ty;
		this.kx = kx;
		this.tx = tx;
	}
	
	public STPercentageModel getSy() {
		return this.sy;
	}
	public STFixedAngleModel getKy() {
		return this.ky;
	}
	public STPercentageModel getSx() {
		return this.sx;
	}
	public STCoordinateModel getTy() {
		return this.ty;
	}
	public STFixedAngleModel getKx() {
		return this.kx;
	}
	public STCoordinateModel getTx() {
		return this.tx;
	}
}
