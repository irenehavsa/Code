/*
 * generated by Xtext
 */
package org.xtext.tesis.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.tesis.ui.internal.SALActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SALExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SALActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SALActivator.getInstance().getInjector(SALActivator.ORG_XTEXT_TESIS_SAL);
	}
	
}