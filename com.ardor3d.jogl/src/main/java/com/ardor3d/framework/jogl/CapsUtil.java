/**
 * Copyright (c) 2008-2012 Ardor Labs, Inc.
 *
 * This file is part of Ardor3D.
 *
 * Ardor3D is free software: you can redistribute it and/or modify it 
 * under the terms of its license which may be found in the accompanying
 * LICENSE file or at <http://www.ardor3d.com/LICENSE>.
 */

package com.ardor3d.framework.jogl;

import javax.media.opengl.GLCapabilities;

import com.ardor3d.framework.DisplaySettings;
import com.ardor3d.util.Ardor3dException;

public class CapsUtil {

    public static GLCapabilities getCapsForSettings(final DisplaySettings settings) {

        // Validate window dimensions.
        if (settings.getWidth() <= 0 || settings.getHeight() <= 0) {
            throw new Ardor3dException("Invalid resolution values: " + settings.getWidth() + " " + settings.getHeight());
        }

        // Validate bit depth.
        if ((settings.getColorDepth() != 32) && (settings.getColorDepth() != 16) && (settings.getColorDepth() != 24)
                && (settings.getColorDepth() != -1)) {
            throw new Ardor3dException("Invalid pixel depth: " + settings.getColorDepth());
        }

        final GLCapabilities caps = new GLCapabilities();
        caps.setHardwareAccelerated(true);
        caps.setDoubleBuffered(true);
        caps.setAlphaBits(settings.getAlphaBits());
        caps.setDepthBits(settings.getDepthBits());
        caps.setNumSamples(settings.getSamples());
        caps.setSampleBuffers(settings.getSamples() != 0);
        caps.setStereo(settings.isStereo());
        caps.setStencilBits(settings.getStencilBits());
        return caps;
    }

}
