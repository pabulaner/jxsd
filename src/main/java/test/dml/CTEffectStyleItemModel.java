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
import test.dml.CTEffectStyleItemModel.EffectLstOrEffectDagModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTEffectStyleItemModel.*;
import test.officeDocument.relationships.*;

public class CTEffectStyleItemModel
{
	
	public static class EffectLstOrEffectDagModel
	{
		
		private final CTEffectListModel effectLst;
		private final CTEffectContainerModel effectDag;
		
		public EffectLstOrEffectDagModel(CTEffectListModel effectLst, CTEffectContainerModel effectDag) {
			this.effectLst = effectLst;
			this.effectDag = effectDag;
		}
		
		public CTEffectListModel getEffectLst() {
			return this.effectLst;
		}
		public CTEffectContainerModel getEffectDag() {
			return this.effectDag;
		}
	}
	private final EffectLstOrEffectDagModel effectLstOrEffectDag;
	private final CTScene3DModel scene3d;
	private final CTShape3DModel sp3d;
	
	public CTEffectStyleItemModel(EffectLstOrEffectDagModel effectLstOrEffectDag, CTScene3DModel scene3d, CTShape3DModel sp3d) {
		this.effectLstOrEffectDag = effectLstOrEffectDag;
		this.scene3d = scene3d;
		this.sp3d = sp3d;
	}
	
	public EffectLstOrEffectDagModel getEffectLstOrEffectDag() {
		return this.effectLstOrEffectDag;
	}
	public CTScene3DModel getScene3d() {
		return this.scene3d;
	}
	public CTShape3DModel getSp3d() {
		return this.sp3d;
	}
}
