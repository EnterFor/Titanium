/*
 * This file is part of Titanium
 * Copyright (C) 2018, Horizon Studio <contact@hrznstudio.com>, All rights reserved.
 *
 * This means no, you cannot steal this code. This is licensed for sole use by Horizon Studio and its subsidiaries, you MUST be granted specific written permission by Horizon Studio to use this code, thinking you have permission IS NOT PERMISSION!
 */
package com.hrznstudio.titanium.api.component;

import net.minecraft.util.IStringSerializable;

public interface IComponentType<T extends IComponent> extends IStringSerializable {
    boolean isInstance(IComponent component);

    T cast(IComponent component);
}