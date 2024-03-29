/**
 * Copyright (c) 2008-2012 Ardor Labs, Inc.
 *
 * This file is part of Ardor3D.
 *
 * Ardor3D is free software: you can redistribute it and/or modify it 
 * under the terms of its license which may be found in the accompanying
 * LICENSE file or at <http://www.ardor3d.com/LICENSE>.
 */

package com.ardor3d.extension.animation.skeletal;

/**
 * Describes a class interested in receiving notice when an animation has changed state.
 */
public interface AnimationListener {

    /**
     * Called when an animation reaches the end of its complete play time (maxTime * loops)
     */
    void animationFinished();

}
