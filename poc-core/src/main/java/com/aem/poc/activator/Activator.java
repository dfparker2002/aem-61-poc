
package com.aem.poc.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * OSGI Bundle Activator.
 */
public class Activator implements BundleActivator {
    /**
     * Default Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Activator.class);

    /**
     * Bundle Start.
     * @param context BundleContext
     * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
     */
    public final void start(final BundleContext context) {
        LOGGER.debug(context.getBundle().getSymbolicName() + " started");
    }

    /**
     * Bundle stop.
     * @param context BundleContext
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    public final void stop(final BundleContext context) {
        LOGGER.debug(context.getBundle().getSymbolicName() + " stopped");
    }
}
