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
import test.dml.CTReflectionEffectModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTReflectionEffectModel
{
	
	private final STPositiveCoordinateModel blurRad;
	private final STPositiveFixedPercentageModel endPos;
	private final STPercentageModel sy;
	private final STFixedAngleModel kx;
	private final STPositiveFixedPercentageModel stA;
	private final STPositiveFixedPercentageModel stPos;
	private final STRectAlignmentModel algn;
	private final STPositiveCoordinateModel dist;
	private final BooleanModel rotWithShape;
	private final STFixedAngleModel ky;
	private final STPositiveFixedAngleModel fadeDir;
	private final STPercentageModel sx;
	private final STPositiveFixedAngleModel dir;
	private final STPositiveFixedPercentageModel endA;
	
	public CTReflectionEffectModel(STPositiveCoordinateModel blurRad, STPositiveFixedPercentageModel endPos, STPercentageModel sy, STFixedAngleModel kx, STPositiveFixedPercentageModel stA, STPositiveFixedPercentageModel stPos, STRectAlignmentModel algn, STPositiveCoordinateModel dist, BooleanModel rotWithShape, STFixedAngleModel ky, STPositiveFixedAngleModel fadeDir, STPercentageModel sx, STPositiveFixedAngleModel dir, STPositiveFixedPercentageModel endA) {
		this.blurRad = blurRad;
		this.endPos = endPos;
		this.sy = sy;
		this.kx = kx;
		this.stA = stA;
		this.stPos = stPos;
		this.algn = algn;
		this.dist = dist;
		this.rotWithShape = rotWithShape;
		this.ky = ky;
		this.fadeDir = fadeDir;
		this.sx = sx;
		this.dir = dir;
		this.endA = endA;
	}
	
	public STPositiveCoordinateModel getBlurRad() {
		return this.blurRad;
	}
	public STPositiveFixedPercentageModel getEndPos() {
		return this.endPos;
	}
	public STPercentageModel getSy() {
		return this.sy;
	}
	public STFixedAngleModel getKx() {
		return this.kx;
	}
	public STPositiveFixedPercentageModel getStA() {
		return this.stA;
	}
	public STPositiveFixedPercentageModel getStPos() {
		return this.stPos;
	}
	public STRectAlignmentModel getAlgn() {
		return this.algn;
	}
	public STPositiveCoordinateModel getDist() {
		return this.dist;
	}
	public BooleanModel getRotWithShape() {
		return this.rotWithShape;
	}
	public STFixedAngleModel getKy() {
		return this.ky;
	}
	public STPositiveFixedAngleModel getFadeDir() {
		return this.fadeDir;
	}
	public STPercentageModel getSx() {
		return this.sx;
	}
	public STPositiveFixedAngleModel getDir() {
		return this.dir;
	}
	public STPositiveFixedPercentageModel getEndA() {
		return this.endA;
	}
}
