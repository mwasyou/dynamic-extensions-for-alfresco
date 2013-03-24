package nl.runnable.alfresco.extensions.webconsole;

import nl.runnable.alfresco.extensions.Extension;

class TemplateVariables {

	/**
	 * Refers to {@link Extension} instances representing core bundles.
	 */
	static final String CORE_BUNDLES = "coreBundles";

	/**
	 * Refers to {@link Extension} instances representing extensions.
	 */
	static final String EXTENSIONS = "extensions";

	/**
	 * Refers to Strings that specify the full paths to directories for installing OSGi bundle JARs.
	 */
	static final String FILE_INSTALL_PATHS = "fileInstallPaths";

	private TemplateVariables() {
	}
}
