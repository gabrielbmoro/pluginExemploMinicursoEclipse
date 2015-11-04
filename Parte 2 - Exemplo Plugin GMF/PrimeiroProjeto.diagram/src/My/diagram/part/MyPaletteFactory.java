
package My.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class MyPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMy1Group());
	}

	/**
	* Creates "My" palette tool group
	* @generated
	*/
	private PaletteContainer createMy1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(My.diagram.part.Messages.My1Group_title);
		paletteContainer.setId("createMy1Group"); //$NON-NLS-1$
		paletteContainer.add(createNode1CreationTool());
		paletteContainer.add(createEdge2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createNode1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(My.diagram.part.Messages.Node1CreationTool_title,
				My.diagram.part.Messages.Node1CreationTool_desc,
				Collections.singletonList(My.diagram.providers.MyElementTypes.Node_2001));
		entry.setId("createNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(My.diagram.part.MyDiagramEditorPlugin
				.findImageDescriptor("/PrimeiroProjeto.edit/icons/full/obj16/iconNo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(My.diagram.part.MyDiagramEditorPlugin
				.findImageDescriptor("/PrimeiroProjeto.edit/icons/full/obj16/iconNo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEdge2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(My.diagram.part.Messages.Edge2CreationTool_title,
				My.diagram.part.Messages.Edge2CreationTool_desc,
				Collections.singletonList(My.diagram.providers.MyElementTypes.Edge_4001));
		entry.setId("createEdge2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(My.diagram.part.MyDiagramEditorPlugin
				.findImageDescriptor("/PrimeiroProjeto.edit/icons/full/obj16/iconSeta.gif")); //$NON-NLS-1$
		entry.setLargeIcon(My.diagram.part.MyDiagramEditorPlugin
				.findImageDescriptor("/PrimeiroProjeto.edit/icons/full/obj16/iconSeta.gif")); //$NON-NLS-1$
		return entry;
	}

}
