package nl.runnable.alfresco.extensions.controlpanel;

import javax.annotation.ManagedBean;

import nl.runnable.alfresco.webscripts.annotations.Attribute;
import nl.runnable.alfresco.webscripts.annotations.Uri;
import nl.runnable.alfresco.webscripts.annotations.WebScript;

/**
 * Handles requests for the index page.
 * <p>
 * This implementation redirects to the {@link Bundles} index.
 * 
 * @author Laurens Fridael
 */
@ManagedBean
@WebScript
public class IndexHandler extends AbstractControlPanelHandler {

	@Uri("/dynamic-extensions/")
	public void redirectToBundles(@Attribute final ResponseHelper response) {
		response.redirectToBundles();
	}
}