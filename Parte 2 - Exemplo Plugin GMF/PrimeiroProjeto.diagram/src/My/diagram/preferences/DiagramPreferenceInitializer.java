package My.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		My.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		My.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		My.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		My.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		My.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return My.diagram.part.MyDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
