/*
 * Copyright 2017 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.physics.shapes;

import org.terasology.math.geom.Vector3f;

/**
 * Represents a box shaped collision entity in the physics engine.
 */
public interface BoxShape extends CollisionShape {
    /**
     * Returns the half extents of the box shape without adding a margin.
     *
     * @return The {@link Vector3f} containing the half extents of the box shape in each dimension.
     */
    Vector3f getHalfExtentsWithoutMargin();
}
